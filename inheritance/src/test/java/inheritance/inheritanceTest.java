package inheritance;

import org.junit.Test;

public class inheritanceTest {

    @Test public void testRestaurantConstructor() {
    var firstRestaurant = new Restaurant("Wutang Restaurant", 5, "$$$");

        System.out.println(firstRestaurant);
    }

    @Test public void testToString() {
        var secondRestaurant = new Restaurant("EMPD cafe", 4.5f, "$$$$$");


        System.out.println(secondRestaurant.toString());
    }
}
