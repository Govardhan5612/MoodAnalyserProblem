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
        if (message.equalsIgnoreCase("null")){
            this.message=null;
        }
        else {
            this.message = message;
        }
    }

    public MoodAnalyser() {

    }

    public void moodAnalysis() {
        /**
         * In this method return mood
         */
        try {


            boolean status = message.toLowerCase().contains("sad");
            if (status == true) {
                System.out.println( "Sad");
            } else {
                System.out.println( "Happy");
            }
        }
        catch (Exception exception){
            System.out.println("Happy");
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
        moodAnalyser.moodAnalysis();
    }
}
