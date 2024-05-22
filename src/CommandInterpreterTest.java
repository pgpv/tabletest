import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CommandInterpreterTest {

    @Test
    void onTable() {
        CommandInterpreter commandInterpreter = new CommandInterpreter();
        Table table = new Table(4, 4, 2, 2);
        int[] commands = {1, 4, 1, 3, 2, 3, 2, 4, 1, 0};
        int[] expectedFinalCoords = {0, 1};
        int[] actualFinalCoords;

        actualFinalCoords = commandInterpreter.runCommands(table, commands);

        assertArrayEquals(expectedFinalCoords, actualFinalCoords);
    }

    @Test
    void offTable() {
        CommandInterpreter commandInterpreter = new CommandInterpreter();
        Table table = new Table(4, 4, 2, 2);
        int[] commands = {1, 1, 1, 1, 1, 0};
        int[] expectedFinalCoords = {-1, -1};
        int[] actualFinalCoords;

        actualFinalCoords = commandInterpreter.runCommands(table, commands);

        assertArrayEquals(expectedFinalCoords, actualFinalCoords);
    }
}
