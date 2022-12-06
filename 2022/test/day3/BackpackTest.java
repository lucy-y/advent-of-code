import main.Backpack;
import main.Backpack2;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class BackpackTest {

    private Backpack backpack;
    private Backpack2 backpack2;

    @BeforeEach
    void setUp() {
        backpack = new Backpack();
        backpack2 = new Backpack2();
    }

    @Test
    void example() throws IOException {
        backpack.solution("./src/test/file/test_backpack.txt");
    }

    @Test
    void solution() throws IOException {
        backpack.solution("./src/test/file/backpack.txt");
    }

    @Test
    void example2() throws IOException {
        backpack2.solution("./src/test/file/test_backpack.txt");
    }

    @Test
    void solution2() throws IOException {
        backpack2.solution("./src/test/file/backpack.txt");
    }
}
