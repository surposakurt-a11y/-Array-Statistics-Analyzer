
package com.mycompany.mavenproject2;

public class Mavenproject2 {

    public static int calculateSum(int[] scores) {
        int sum = 0;
        for (int score : scores) {
            sum = sum + score;
        }
        return sum;
    }

    public static double calculateAverage(int[] scores) {
        return (double) calculateSum(scores) / scores.length;
    }

    public static int findHighest(int[] scores) {
        int highest = scores[0];
        for (int score : scores) {
            if (score > highest) {
                highest = score;
            }
        }
        return highest;
    }

    public static int findLowest(int[] scores) {
        int lowest = scores[0];
        for (int score : scores) {
            if (score < lowest) {
                lowest = score;
            }
        }
        return lowest;
    }

    public static int countPassing(int[] scores) {
        int count = 0;
        for (int score : scores) {
            if (score >= 75) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        int[] scores = {85, 90, 72, 65, 95, 78, 88, 70};

        if (scores.length == 0) {
            System.out.println("No scores.");
        } else {
            System.out.println("Statistical Information");
            System.out.println("Total Number of Scores: " + scores.length);
            System.out.println("Sum of Scores: " + calculateSum(scores));
            System.out.println("Average Score: " + calculateAverage(scores));
            System.out.println("Highest Score: " + findHighest(scores));
            System.out.println("Lowest Score: " + findLowest(scores));
            System.out.println("Number of Passing Students: " + countPassing(scores));
        }
    }
}
