package inheritance;

public class Restaurant {
    public String restaurantName;
    public float numberOfStars;
    public String numberOfDollarSign;

    public Restaurant(String restaurantName, float numberOfStars, String numberOfDollarSign) {
        this.restaurantName = restaurantName;
        this.numberOfStars = numberOfStars;
        this.numberOfDollarSign = numberOfDollarSign;
    }

    public String toString() {

        return String.format(
                "%s has %.1f stars and has a price category of %s.",
                restaurantName, numberOfStars, numberOfDollarSign
        );

    }



}
