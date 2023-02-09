package com.bridgelabz.moodanalyser;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
    
    @Test
    public void testMoodAnalysis_whenMoodIsSad() throws MoodAnalysisException {
        MoodAnalyser moodAnalyser = new MoodAnalyser("This is a sad message");//Tc1.1 Refactor
        String mood = moodAnalyser.analyseMood();
        Assert.assertEquals(mood,"SAD");
    }

    @Test
    public void testMoodAnalysis_whenMoodIsHappy() throws MoodAnalysisException {//Tc1.2 Refactor
        MoodAnalyser moodAnalyser = new MoodAnalyser("This is a happy message");
        String mood1 = moodAnalyser.analyseMood();
        Assert.assertEquals(mood1,"HAPPY");
    }
    @Test
    public void testMoodAnalysis_whenMoodIsNull() throws MoodAnalysisException { //tc 2.1
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        String mood2 = moodAnalyser.analyseMood();
        Assert.assertEquals(mood2,"HAPPY");
    }
}
    