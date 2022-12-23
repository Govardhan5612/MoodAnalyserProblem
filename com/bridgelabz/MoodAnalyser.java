package com.bridgelabz;

import java.util.Scanner;

/**
 * @author Govardhan Reddy
 */
public class MoodAnalyser {
    /**
     * Display Mood
     */
    public String moodAnalysis(String message) {
        /**
         * In this method return mood
         */
        boolean status = message.toLowerCase().contains("sad");
        if (status == true) {
            return "Sad";
        } else {
            return "Happy";
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter message : ");
        String message = input.nextLine();
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String result = moodAnalyser.moodAnalysis(message);
        System.out.println(result);
    }
}
