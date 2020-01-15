/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

import java.util.ArrayList;

public class Library {
    public boolean someLibraryMethod() {
        return true;
    }

    public ArrayList<Integer> roll(int n){
        ArrayList<Integer> numberArray = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            int rollTheDie = (int) (Math.floor(Math.random() * 6) + 1);
            numberArray.add(rollTheDie);
        }
        return numberArray;
    }

    public boolean containsDuplicates(char[] charArray) {
        for(int i = 0; i < charArray.length; i++){
            for (int j = i + 1; j < charArray.length; j++) {
                if(charArray[j] ==charArray[i]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static double calculateAverage(double[] arrayToBeCalculated) {
        double sum = 0;
        double average = 0;

        for(double number : arrayToBeCalculated) {
            sum += number;
        }
        average = sum / arrayToBeCalculated.length;

        return average;
    }



}

