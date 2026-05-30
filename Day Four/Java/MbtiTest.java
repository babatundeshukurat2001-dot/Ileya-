import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MbtiTest {

    @Test
    public void testToGetFirstQuestion() {
        Mbti mbti = new Mbti();
        String question1 = mbti.getQuestion(1); // Getting the first question
        String expected = "A. expend energy, enjoy groups\nB. conserve energy, enjoy one-on-one";
        assertEquals(expected, question1);
    }

    @Test
    public void testToSaveAnswer() {
        Mbti mbti = new Mbti();
        mbti.saveAnswer(1, "A"); // Save Answer A for question 1 inside mbti
        assertEquals("A", mbti.getSavedAnswer(1));
    }

}
