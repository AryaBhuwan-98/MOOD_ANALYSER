package com.bridgelabz.moodanalyser;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
    
     //  Analyse mood by passing the message in the constructor
     @Test
     public void testMoodAnalysis_whenMoodIsSad() {//uc1 refactor
         MoodAnalyser moodAnalyser = new MoodAnalyser("This is a sad message");
         String mood;
         try {
             mood = moodAnalyser.analyseMood();
             Assert.assertEquals("SAD" , mood);
         } catch (MoodAnalysisException e) {
             e.printStackTrace();
         }
     }
     //Analyse mood by passing the message in the constructor
     @Test
     public void testMoodAnalysis_whenMoodIsHappy() {//uc1refactor
         MoodAnalyser moodAnalyser = new MoodAnalyser("This is a happy message");
         String mood;
         try {
             mood = moodAnalyser.analyseMood();
             Assert.assertEquals("HAPPY" , mood);
         }catch (MoodAnalysisException e) {
             e.printStackTrace();
         }
     }
 
  // Custom Exception if User Provides Invalid Mood
      // Input message: null
     @Test
     public void testMoodAnalysis_whenMoodIsNull_ShouldThrowException() {//uc 3.1
         MoodAnalyser moodAnalyser = new MoodAnalyser(null);
         try {
             moodAnalyser.analyseMood();
         } catch (MoodAnalysisException e) {
             Assert.assertEquals(MoodAnalysisException.ExceptionType.ENTERED_NULL, e.type);
         }
     }
     // Custom Exception if User Provides Invalid Mood
      //Input message: empty
     @Test
     public void testMoodAnalysis_whenMoodIsEmpty_ShouldThrowException() {//uc3.2
         MoodAnalyser moodAnalyser = new MoodAnalyser("");
         try {
             moodAnalyser.analyseMood();
         } catch (MoodAnalysisException e) {
             System.out.println(e);
             System.out.println(e.type);
             Assert.assertEquals(MoodAnalysisException.ExceptionType.ENTERED_EMPTY , e.type);
         }
}
}
