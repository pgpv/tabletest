import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TableTest {

    @Test
    void moveForwards() {
        Table table = new Table(4, 4, 2, 2);

        table.moveForwards();

        assertEquals(2, table.getXPosition());
        assertEquals(1, table.getYPosition());
    }

    @Test
    void moveBackwards() {
        Table table = new Table(4, 4, 2, 2);

        table.moveBackwards();

        assertEquals(2, table.getXPosition());
        assertEquals(3, table.getYPosition());
    }

    @Test
    void rotateClockwise() {
        Table table = new Table(4, 4, 2, 2);

        table.rotateClockwise();

        assertEquals(Constants.EAST, table.getOrientation());
    }

    @Test
    void rotateCounterClockwise() {
        Table table = new Table(4, 4, 2, 2);

        table.rotateCounterClockwise();

        assertEquals(Constants.WEST, table.getOrientation());
    }

    @Test
    void rotateClockwiseAndMoveForwards() {
        Table table = new Table(4, 4, 2, 2);

        table.rotateClockwise();
        table.moveForwards();

        assertEquals(Constants.EAST, table.getOrientation());
        assertEquals(3, table.getXPosition());
        assertEquals(2, table.getYPosition());
    }

    @Test
    void rotateClockwiseAndMoveBackwards() {
        Table table = new Table(4, 4, 2, 2);

        table.rotateClockwise();
        table.moveBackwards();

        assertEquals(Constants.EAST, table.getOrientation());
        assertEquals(1, table.getXPosition());
        assertEquals(2, table.getYPosition());
    }

    @Test
    void rotateCounterClockwiseAndMoveForwards() {
        Table table = new Table(4, 4, 2, 2);

        table.rotateCounterClockwise();
        table.moveForwards();

        assertEquals(Constants.WEST, table.getOrientation());
        assertEquals(1, table.getXPosition());
        assertEquals(2, table.getYPosition());
    }

    @Test
    void rotateCounterClockwiseAndMoveBackwards() {
        Table table = new Table(4, 4, 2, 2);

        table.rotateCounterClockwise();
        table.moveBackwards();

        assertEquals(Constants.WEST, table.getOrientation());
        assertEquals(3, table.getXPosition());
        assertEquals(2, table.getYPosition());
    }
}