public class Main {

    public static void main(String[] args) {
        int dogCount = 1;
        System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");
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
}