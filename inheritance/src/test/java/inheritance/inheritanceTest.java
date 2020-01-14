package inheritance;

import org.junit.Test;

import javax.lang.model.SourceVersion;

public class inheritanceTest {

    @Test public void testRestaurantConstructor() {
    var firstRestaurant = new Restaurant("Wutang Restaurant", 5, "$$$");

        System.out.println(firstRestaurant);
    }

    @Test public void testToString() {
        var secondRestaurant = new Restaurant("EMPD cafe", 4.5f, "$$$$$");


        System.out.println(secondRestaurant.toString());
    }
    @Test public void testReviewConstructor() {
        var firstReview = new Review("Delicious food", "Dre", 3);
        System.out.println("firstReview = " + firstReview);
    }
    @Test public void testReviewToString() {
        var review = new Review("Great customer service", "Martin", 4.5f);
        System.out.println(review.toString());
    }
}
