import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;
import org.ssikandar.foodTruck.controller.FoodTruckController;
import org.ssikandar.foodTruck.model.FoodTruck;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
public class FoodTruckTest {

  @BeforeAll
  public void setup() {
    MockitoAnnotations.initMocks(this);
  }

  FoodTruckController foodTruckController = new FoodTruckController();

  @Mock
  FoodTruck food;

  @Test
  public void testInvalidFoodTruck() throws Exception {
    foodTruckController.addNewFoodTruck(food);
    assertNull(foodTruckController.retrieveFoodTruckOnLocationID("9"));
  }

  @Test
  public void testInvalidRetrieveLocationId() throws Exception {
    assertNull(foodTruckController.retrieveFoodTruckOnLocationID("12"));
  }

  @Test
  public void checksIfBlockExists() throws Exception {
    food.setBlock("073311");
    foodTruckController.addNewFoodTruck(food);
    assertThrows(Exception.class, () -> foodTruckController.getByBlock("073311"), "Block does not exist");
  }

  @Test
  public void checkIfBlockIsNull() {
    food.setBlock(null);
    assertNull(food.getBlock());
  }
  

}
