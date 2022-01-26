package org.ssikandar.foodTruck.repository;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.ssikandar.foodTruck.model.FoodTruck;

public class FoodTruckRepository {
  // path to CSV
  private final static File filePath = new File("./src/main/resources/data/Mobile_Food_Facility_Permit.csv");
  
  // these maps will be called in FoodTruckController where the endpoints are
  public static Map<String, FoodTruck> locationIdMap = new HashMap<>();
  public static Map<String, ArrayList<FoodTruck>> blockMap = new HashMap<>();

  /**
   * @throws IOException
   * creates the helper functions for
   * location ID to food truck object
   * as well as block to food truck object
   */
  public static void keyValforLocAndBlock(){
    BufferedReader objReader = null;
    try {
      objReader = new BufferedReader(new FileReader(filePath));
      String strCurrentLine = "";
      String[] parts;
      while ((strCurrentLine = objReader.readLine()) != null) {
        parts = strCurrentLine.split(",");
        String locationId = parts[0];
        String applicant = parts[1];
        String facilityType = parts[2];
        String cnn = parts[3];
        String locationDescription =parts[4];
        String address = parts[5];
        String blockLot = parts[6];
        String block = parts[7];
        String lot = parts[8];
        String permit = parts[9];
        String status = parts[10];
        String foodItems = parts[11];
        String x = parts[12];
        String y =parts[13];
        String latitude =parts[14];
        String longitude = parts[15];
        String schedule = parts[16];
        String daysHours = parts[17];
        String noiSent = parts[18];
        String approved = parts[19];
        String received = parts[20];
        String priorPermit = parts[21];
        String expirationDate = parts[22];
        String location = parts[23];
        // create a new food truck object with the values of the rows
        FoodTruck foodTruck = new FoodTruck(locationId,applicant,facilityType,cnn,locationDescription,address,blockLot,block, lot,permit,status,foodItems, x,y,latitude,longitude,schedule,daysHours, noiSent,approved,received, priorPermit,expirationDate,location);
        
        // add location ID to food truck object to the location ID.
        locationIdMap.put(locationId, foodTruck);
        if(!blockMap.containsKey(block)){
          blockMap.put(block, new ArrayList<FoodTruck>());
        }
        blockMap.get(block).add(foodTruck);
      }
      objReader.close();
    }
    catch(Exception e){
      e.printStackTrace();
    }
    finally {

      try {
        if (objReader != null)
          objReader.close();
      } catch (IOException ex) {
        ex.printStackTrace();
      }
    }

  }

  /**
   * @param foodTruck
   *
   * Logic for adding a food truck object
   * Assumes location is unique
   */
  public static void addFoodTruck(FoodTruck foodTruck) throws Exception {
    if(locationIdMap.containsKey(foodTruck.getLocationId())) {
      throw new Exception("Already exists - needs to be unique location ID");
    }
    locationIdMap.put(foodTruck.getLocationId(), foodTruck);
    // assumes block isn't unique
    ArrayList<FoodTruck> foodTrucksOnBlock = blockMap.getOrDefault(foodTruck.getBlock(), new ArrayList<>());
    foodTrucksOnBlock.add(foodTruck);
    //mapping the block and the food truck
    blockMap.put(foodTruck.getBlock(), foodTrucksOnBlock);
  }
}
