import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;
import java.lang.Thread;


public class Main {

    public static void main(String[] args) {

        //Test for pluralize method
        // int dogCount = 1;
        // System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

        // int catCount = 2;
        // System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

        // int turtleCount = 0;
        // System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");

        //Test for flipNHeads method
        flipNHeads(2);

        //Test for clock method
        // clock();

    }

    public static String pluralize(String word, int number) {
        String pluralizedWord = " ";
        if(number == 0 || number > 1) {
            pluralizedWord = word + "s";
        } else {
            return word;
        }
        return pluralizedWord;
    }

    public static void flipNHeads(int n) {
        int flipsCounter = 0;
        int headCounter = 0;
        boolean isRow = true;

        while (isRow) {
            double randomNumber = Math.random();
            if(randomNumber < .5) {
                System.out.println("tails");
                flipsCounter++;
            } else {
                System.out.println("heads");
                flipsCounter++;
                headCounter++;
                if(headCounter == n) {
                    isRow = false;
                    System.out.println("It took " + flipsCounter + " flips to flip " + n + " heads in a row.");
                }
            }
        }
    }
    // Source: https://stackoverflow.com/questions/24104313/how-do-i-make-a-delay-in-java
    public static void timer(int second){
        try
        {
            Thread.sleep(second);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
    }
    
    public static void clock() {
        boolean isClockRunning = true;
        while(isClockRunning) {
            LocalDateTime now = LocalDateTime.now();
            String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
            System.out.println(time);
            timer(1000);
        }
    }
}