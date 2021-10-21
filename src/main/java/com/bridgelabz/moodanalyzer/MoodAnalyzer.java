package com.bridgelabz.moodanalyzer;

public class MoodAnalyzer {

        String message;

        public MoodAnalyzer() {

        }

        public MoodAnalyzer(String message) {
            this.message = message;
        }

        public String analyzeMood() throws MoodAnalyzerException {

            try {
                if (message.length() == 0) {
                    throw new MoodAnalyzerException(ExceptionType.ENTERED_EMPTY, "Enter Proper Message. EMPTY Not Allowed");
                }
                if (this.message.contains("Sad")) {
                    return "SAD";
                } else {
                    return "HAPPY";
                }
            } catch (NullPointerException e) {
                throw new MoodAnalyzerException(ExceptionType.ENTERED_NULL, "Enter Proper Message. NULL Not Allowed");
            }
        }
    }


}
