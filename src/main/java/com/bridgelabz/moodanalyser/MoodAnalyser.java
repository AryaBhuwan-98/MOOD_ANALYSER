package com.bridgelabz.moodanalyser;

public class MoodAnalyser {
    
    private String message;
    //Default Constructor
    public MoodAnalyser() {
    }
    //Parameterized Constructor
    public MoodAnalyser(String message) {
        this.message = message;
    }

    //Handle NULLPOINTER Exception using try-catch block
    public String analyseMood() {
        try {
            if (message.contains("sad"))
                return "SAD";
            else
                return "HAPPY";
        } catch(Exception e) {
            return "HAPPY";
        }
    }
}