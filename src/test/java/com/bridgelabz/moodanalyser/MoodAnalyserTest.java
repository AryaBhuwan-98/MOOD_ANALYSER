package com.bridgelabz.moodanalyser;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
    
    @Test
    public void testMoodAnalysis_whenMoodIsSad() {
        MoodAnalyser moodAnalyzer = new MoodAnalyser("This is a sad message");//Tc1.1 Refactor
        String mood = moodAnalyzer.analyseMood();
        Assert.assertEquals(mood,"SAD");
    }

    @Test
    public void testMoodAnalysis_whenMoodIsHappy() {//Tc1.2 Refactor
        MoodAnalyser moodAnalyzer = new MoodAnalyser("This is a happy message");
        String mood1 = moodAnalyzer.analyseMood();
        Assert.assertEquals(mood1,"HAPPY");
    }
}
