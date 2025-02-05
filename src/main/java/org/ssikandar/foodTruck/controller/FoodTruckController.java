package org.ssikandar.foodTruck.controller;

import java.util.ArrayList;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.ssikandar.foodTruck.model.FoodTruck;
import org.ssikandar.foodTruck.repository.FoodTruckRepository;

@RestController
public class FoodTruckController {
  public static Map<String, FoodTruck> locationIdMap = FoodTruckRepository.locationIdMap;
  public static Map<String, ArrayList<FoodTruck>> blockMap = FoodTruckRepository.blockMap;
  private static final Logger log = LoggerFactory.getLogger(FoodTruckController.class);

  public FoodTruckController() {
    FoodTruckRepository.keyValforLocAndBlock();
  }

  /**
   * @param locationId
   * @return food truck object
   *
   * Retrieve a food truck based on the location id field.
   *
   * Example: http://localhost:8080/getByLocationId/?locationId=751253
   */
  @RequestMapping(value="/getByLocationId", method=RequestMethod.GET)
  public FoodTruck retrieveFoodTruckOnLocationID(@Param("locationId") String locationId ){
    return locationIdMap.getOrDefault(locationId, null);
  }

  /**
   * @param newFoodTruck
   * @return food truck object
   *
   * Add a new food truck.
   * Example: http://localhost:8080/newFoodTrucks
   */
  @RequestMapping(value="/newFoodTrucks", method=RequestMethod.POST)
  public void addNewFoodTruck(@RequestBody FoodTruck newFoodTruck) throws Exception {
    FoodTruckRepository.addFoodTruck(newFoodTruck);
    log.info("Successfully added new Food Truck");
  }

  /**
   * @param block
   * @return food truck object list
   *
   * Get all food trucks for a given block.
   * Checks if block exists
   * Example: http://localhost:8080/getByBlock/?block=3549
   */
  @RequestMapping(value="/getByBlock",method=RequestMethod.GET)
  public ArrayList<FoodTruck> getByBlock(@Param("block") String block) throws Exception{
    if(!blockMap.containsKey(block)){
      throw new Exception(block + " Block does not exist in " + blockMap);
    }
    ArrayList<FoodTruck> foodTruck = blockMap.get(block);
    return foodTruck;
  }
}
