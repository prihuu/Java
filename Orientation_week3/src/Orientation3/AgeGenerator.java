package Orientation3;

import java.util.Random;

public class AgeGenerator {

    public static void main(String[] args) {

        //ages in the student group
        int[] ages = {18, 19, 20, 21, 22, 23};

        //number of students of each age
        int[] frequencies = {10, 5, 5, 5, 3, 2};

        //calculate total number of students
        int totalStudents = 0;

        for (int frequency : frequencies) {
            totalStudents += frequency;
        }

        //calculate cumulative probabilities
        double[] cumulativeProbabilities = new double[ages.length];

        int cumulativeFrequency = 0;

        for (int i = 0; i < ages.length; i++) {
            cumulativeFrequency += frequencies[i];

            cumulativeProbabilities[i] =
                    (double) cumulativeFrequency / totalStudents;
        }

        //generate 1000 random ages
        Random random = new Random();

        int[] ageCounts = new int[ages.length];

        for (int i = 0; i < 1000; i++) {

            double randomNumber = random.nextDouble();

            for (int j = 0; j < ages.length; j++) {

                if (randomNumber < cumulativeProbabilities[j]) {
                    ageCounts[j]++;
                    break;
                }
            }
        }

        //print results
        System.out.println("Generated 1000 ages:");
        System.out.println();

        for (int i = 0; i < ages.length; i++) {
            System.out.println(
                    "Age " + ages[i] + ": " + ageCounts[i] + " students"
            );
        }
    }
}
