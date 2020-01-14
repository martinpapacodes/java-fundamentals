package inheritance;

public class Review extends Restaurant
{
    String body;
    String author;
    float numberOfStars;


    public Review(String body, String author, float numberOfStars, String restaurantName, String numberOfDollarSign) {
        super(restaurantName, numberOfStars, numberOfDollarSign);
        this.body = body;
        this.author = author;
    }

    public String toString() {

        return String.format(
                "%s says %s and gave %.1f stars.",
                author, body, numberOfStars
        );

    }

}
