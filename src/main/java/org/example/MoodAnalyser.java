package org.example;

public class MoodAnalyser {
    private String message;

    public enum MoodError {
        EMPTY, NULL
    }

    public static class MoodAnalysisException extends Exception {
        private MoodError error;

        public MoodAnalysisException(MoodError error, String message) {
            super(message);
            this.error = error;
        }

        public MoodError getError() {
            return this.error;
        }
    }

    public MoodAnalyser() {
        this.message = "";
    }

    public MoodAnalyser(String message) {
        this.message = message;
    }

    public String analyseMood() throws MoodAnalysisException {
        try {
            if (this.message.isEmpty()) {
                throw new MoodAnalysisException(MoodError.EMPTY, "Empty mood");
            }
            if (this.message.contains("Sad")) {
                return "Sad";
            } else {
                return "Happy";
            }
        } catch (Exception e) {
            throw new MoodAnalysisException(MoodError.NULL, "Null mood");
        }
    }
}
