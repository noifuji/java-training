/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package quiz;

import org.junit.Test;
import static org.junit.Assert.*;

public class QuizTest {
    @Test public void testIsCorrect() {
        Quiz quiz = new Quiz(1, "test", null, 1);
        assertEquals(true, quiz.isCorrect(1));
        assertEquals(false, quiz.isCorrect(2));
    }
}