package com.bridgelabz.testcases;

public class MoodAnalyzerException extends RuntimeException {
    enum ExceptionType {
        ENTERED_NULL, ENTERED_EMPTY
    }

    ExceptionType type;

    public MoodAnalyzerException(ExceptionType type, String message) {

        super(message);
        this.type = type;
    }

}