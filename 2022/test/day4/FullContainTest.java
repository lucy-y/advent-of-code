import main.FullContain;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class FullContainTest {

    private FullContain fullContain;
    @BeforeEach
    void setUp() {
        fullContain = new FullContain();
    }

    @Test
    void example() throws IOException {
        fullContain.solution("./src/test/file/test_fullcontain.txt");
    }

    @Test
    void solution() throws IOException {
        fullContain.solution("./src/test/file/fullcontain.txt");
    }
}
