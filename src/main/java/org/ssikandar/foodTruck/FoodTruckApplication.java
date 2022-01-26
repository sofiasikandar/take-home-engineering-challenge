package org.ssikandar.foodTruck;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FoodTruckApplication {
  private static final Logger log = LoggerFactory.getLogger(FoodTruckApplication.class);
  public static void main(String[] args) {
    log.info("Application Starting");
    SpringApplication.run(FoodTruckApplication.class);
    log.info("Application Run Complete");
  }
}