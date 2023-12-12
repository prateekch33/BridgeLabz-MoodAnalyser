import org.example.MoodAnalyser;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MoodAnalyserTest {
    MoodAnalyser moodAnalyser=new MoodAnalyser("I am in Sad Mood");
    MoodAnalyser moodAnalyser1=new MoodAnalyser("");
    @Test
    void testValidMood() throws MoodAnalyser.MoodAnalysisException {
        assertEquals(moodAnalyser.analyseMood().compareTo("Sad"), 0);
        assertEquals(moodAnalyser1.analyseMood().compareTo("Null Mood"),0);
    }
}
