/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

import java.util.ArrayList;
import java.util.HashSet;

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

    public static int calculateAverage(int[] arrayToBeCalculated) {
        int sum = 0;
        int average = 0;

        for(int number : arrayToBeCalculated) {
            sum += number;
        }
        average = sum / arrayToBeCalculated.length;

        return average;
    }

    public static int[] getLowestAverageOfMatrix(int[][] matrix) {
        int[] lowestAverageArray = matrix[0];

        for(int i = 0; i < matrix.length; i++) {
            if(calculateAverage(matrix[i]) < calculateAverage(lowestAverageArray)) {
                lowestAverageArray = matrix[i];
            }
        }
        return lowestAverageArray;
    }

    public static String analyzeWeather(int[][] matrix) {
        int low = matrix[0][0];
        int high = matrix[0][0];
        var unique = new HashSet<Integer>();

        for(int[] array: matrix) {
            for(int i = 0; i < matrix.length; i++) {
                unique.add(array[i]);
                if(array[i] < low) {
                    low = array[i];
                }

                if(array[i] > high) {
                    high = array[i];
                }
            }
        }

        String result = "High: " + high + "\n"
                      + "Low: " + low + "\n";

        for(int i = low; i < high; i++) {
            if(!unique.contains(i)) {
                result += "Never saw temperature: " + i + "\n";
            }
        }
    return result;



    }

}

