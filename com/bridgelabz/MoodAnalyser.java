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

    public void moodAnalysis() throws MoodAnalysisExceptiom {
        /**
         * In this method return mood
         */
        try {
            if (message.length() == 0) {
                throw new MoodAnalysisExceptiom("Enter proper message");
            } else {
                boolean status = message.toLowerCase().contains("sad");
                if (status == true) {
                    System.out.println("Sad");
                } else {
                    System.out.println("Happy");
                }
            }
        } catch (Exception exception) {
            System.out.println("Happy.." + exception);
        }
    }

    public static void main(String[] args) throws MoodAnalysisExceptiom {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter message : ");
        String message = input.nextLine();
        /**
         * Printing the message through object
         */
        MoodAnalyser moodAnalyser = new MoodAnalyser(message);
        moodAnalyser.moodAnalysis();
    }
}
