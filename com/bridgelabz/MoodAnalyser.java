package com.bridgelabz;

import java.util.Scanner;

/**
 * @author Govardhan Reddy
 */
public class MoodAnalyser {
    /**
     * Display Mood
     */
    String message;

    /**
     * create default and parameterized constructors
     */
    public MoodAnalyser(String message) {
        this.message = message;
    }

    public MoodAnalyser() {

    }

    public String moodAnalysis() {
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
        /**
         * Printing the message through object
         */
        MoodAnalyser moodAnalyser = new MoodAnalyser(message);
        String result = moodAnalyser.moodAnalysis();
        System.out.println(result);
    }
}
