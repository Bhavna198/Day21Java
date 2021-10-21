package com.bridgelabz.testcases;

import org.junit.Assert;
import org.junit.Test;

public class TestCases {

    @Test
    public void givenMessage_WhenSad_ShouldReturnSad() throws Exception {
        TestCases moodAnalyzer = new TestCases("This is a Sad message");
        String mood = moodAnalyzer.analyzeMood();
        Assert.assertEquals("SAD", mood);

    }


    @Test
    public void givenMessage_WhenHappy_ShouldReturnHappy() throws Exception {

        TestCases moodAnalyzer = new TestCases("This is a Happy message");
        String mood = moodAnalyzer.analyzeMood();
        Assert.assertEquals("HAPPY", mood);
    }

    @Test
    public void givenMessage_WhenNull_ShouldThrowMoodAnalysisNullException() {

        TestCases moodAnalyzer = new TestCases(null);
        try {
            moodAnalyzer.analyzeMood();
        } catch (MoodAnalyzerException e) {
            Assert.assertEquals(MoodAnalyzerException.ExceptionType.ENTERED_NULL, e.type);
        }

    }

    @Test
    public void givenMessage_WhenEmpty_ShouldThrowMoodAnalysisEmptyException() {

        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("");
        try {
            moodAnalyzer.analyzeMood();
        } catch (MoodAnalyzerException e) {
            Assert.assertEquals(MoodAnalyzerException.ExceptionType.ENTERED_EMPTY, e.type);
        }
    }
}

