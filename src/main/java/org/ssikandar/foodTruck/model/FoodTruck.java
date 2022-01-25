package org.ssikandar.foodTruck.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

/**
 * The object FoodTruck contains fields that are all of the type String.
 * Because the data is being written out into a comma-separated values file,
 * having the fields in consistent and as strings enables light-weighted
 * modifications for adding and deleting.
 *
 * Additionally, thanks to Lombok there is no need to explicitly create
 * getters and setters (done under the hood).
 */
@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class FoodTruck {
  String locationId;
  String applicant;
  String facilityType;
  String cnn;
  String locationDescription;
  String address;
  String blockLot;
  String block;
  String lot;
  String permit;
  String status;
  String foodItems;
  String x;
  String y;
  String latitude;
  String longitude;
  String schedule;
  String daysHours;
  String noiSent;
  String approved;
  String received;
  String priorPermit;
  String expirationDate;
  String location;

  /**
   * @param str (either block or location ID)
   * @return boolean
   */
  public static boolean emptyAndNullCheck(String str){
    if(str != null && !str.trim().isEmpty()){
      return true;
    }
    return false;
  }

  /**
   * @return a String representation of the Food Truck object
   */
  @Override
  public String toString(){
    StringBuilder b = new StringBuilder();
    b.append("Location ID: " + getLocationId());
    b.append("\n  Applicant: " + getApplicant());
    b.append("\n  Facility Type: " + getFacilityType());
    b.append("\n  CNN: " + getCnn());
    b.append("\n  Location Description: " + getLocationDescription());
    b.append("\n  Address: " + getAddress());
    b.append("\n  Block Lot: " + getBlockLot());
    b.append("\n  Block: " + getBlock());
    b.append("\n  Lot: " + getLot());
    b.append("\n  Permit: " + getPermit());
    b.append("\n  Status: " + getStatus());
    b.append("\n  Food Items: " + getFoodItems());
    b.append("\n  X: " + getX());
    b.append("\n  Y: " + getY());
    b.append("\n  Latitude: " + getLatitude());
    b.append("\n  Longitude: " + getLongitude());
    b.append("\n  Schedule: " + getSchedule());
    b.append("\n  Days/Hours: " + getDaysHours());
    b.append("\n  NOI Sent: " + getNoiSent());
    b.append("\n  Approved: " + getApproved());
    b.append("\n  Received: " + getReceived());
    b.append("\n  Prior Permit: " + getPriorPermit());
    b.append("\n  Expiration Date: " + getExpirationDate());
    b.append("\n  Location: " + getLocation());
    return b.toString();
  }
}
