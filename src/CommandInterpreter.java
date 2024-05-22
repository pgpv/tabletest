public class CommandInterpreter {

    public CommandInterpreter() {
    }

    public int[] runCommands(Table table, int[] commands) {
        int[] finalCoords = {Constants.OFF_X, Constants.OFF_Y};

        for (int command : commands) {
            boolean result = true;

            if (command == Constants.MOVE_FORWARDS) result = table.moveForwards();
            if (command == Constants.MOVE_BACKWARDS) result = table.moveBackwards();
            if (command == Constants.ROTATE_CLOCKWISE) table.rotateClockwise();
            if (command == Constants.ROTATE_COUNTERCLOCKWISE) table.rotateCounterClockwise();
            if (command == Constants.END || !result) {
                finalCoords[0] = table.getXPosition();
                finalCoords[1] = table.getYPosition();

                return finalCoords;
            }
        }

        return finalCoords;
    }
}
