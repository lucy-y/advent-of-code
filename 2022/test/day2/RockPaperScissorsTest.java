import main.RockPaperScissors;
import main.RockPaperScissors2;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class RockPaperScissorsTest {

    private RockPaperScissors rockPaperScissors;

    private RockPaperScissors2 rockPaperScissors2;
    @BeforeEach
    void setUp() {
        rockPaperScissors = new RockPaperScissors();
        rockPaperScissors2 = new RockPaperScissors2();
    }

    @Test
    void example() throws IOException {
        rockPaperScissors.solution("./src/test/file/test_rock_paper_scissors.txt");
    }

    @Test
    void solution() throws IOException {
        rockPaperScissors.solution("./src/test/file/rock_paper_scissors.txt");
    }

    @Test
    void example2() throws IOException {
        rockPaperScissors2.solution("./src/test/file/test_rock_paper_scissors.txt");
    }

    @Test
    void solution2() throws IOException {
        rockPaperScissors2.solution("./src/test/file/rock_paper_scissors.txt");
    }
}
