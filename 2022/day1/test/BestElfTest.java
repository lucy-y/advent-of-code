import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

class BestElfTest {

    private BestElf bestElf;
    @BeforeEach
    void init(){
        bestElf = new BestElf();
    }
    @Test
    void sample() throws IOException {
        bestElf.solution("./src/test/file/test_elf.txt");
    }
    @Test
    void solution() throws IOException {
        bestElf.solution("./src/test/file/elf.txt");
    }
}
