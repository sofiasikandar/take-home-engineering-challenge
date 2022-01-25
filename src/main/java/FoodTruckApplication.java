import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FoodTruckApplication {
  private static final Logger logger = LoggerFactory.getLogger(FoodTruckApplication.class);

  public static void main(String[] args) {
    logger.info("Application Starting");
    SpringApplication.run(FoodTruckApplication.class, args);
    logger.info("Application Run Complete");
  }
}
