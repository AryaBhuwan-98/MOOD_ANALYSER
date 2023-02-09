package com.bridgelabz.moodanalyser;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
    
    @Test
    public void testMoodAnalysis_whenMoodIsSad() { //TC 1.1 "I am in sad mood"
        MoodAnalyser moodAnalyzer = new MoodAnalyser();
        String mood = moodAnalyzer.analyseMood("I am in sad mood");
        Assert.assertEquals(mood, "SAD");
    }

    @Test
    public void testMoodAnalysis_whenMoodIsHappy() { //TC 1.2 I am in happy mood
        MoodAnalyser moodAnalyzer = new MoodAnalyser();
        String mood1 = moodAnalyzer.analyseMood("I am in happy mood");
        Assert.assertEquals(mood1, "HAPPY");
    }
}

