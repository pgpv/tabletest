import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParserTest {

    @Test
    void validateValidHeader() {
        String header = "4,4,2,2";
        int[] expectedHeader = {4, 4, 2, 2};
        Parser parser = new StdInParser();

        assertArrayEquals(expectedHeader, parser.validateHeader(header));
    }

    @Test
    void validateIncompleteHeader() {
        String header = "4,4,2";
        Parser parser = new StdInParser();

        assertNull(parser.validateHeader(header));
    }

    @Test
    void validateInvalidHeader() {
        String header = "4,4,4,4";
        Parser parser = new StdInParser();

        assertNull(parser.validateHeader(header));
    }

    @Test
    void validateValidCommands() {
        String commands = "1,4,1,3,2,3,2,4,1,0";
        int[] expectedCommands = {1, 4, 1, 3, 2, 3, 2, 4, 1, 0};
        Parser parser = new StdInParser();

        assertArrayEquals(expectedCommands, parser.validateCommands(commands));
    }

    @Test
    void validateInvalidCommands() {
        String commands = "1,4,1,3,2,3,2,4,1," + Constants.LAST_COMMAND + 1 + ",0";
        Parser parser = new StdInParser();

        assertNull(parser.validateCommands(commands));
    }

}