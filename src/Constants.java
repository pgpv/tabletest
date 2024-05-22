public class Constants {
    public static final int NORTH = 1;
    public static final int EAST = 2;
    public static final int SOUTH = 3;
    public static final int WEST = 4;
    public static final int DEFAULT_ORIENTATION = NORTH;

    public static final int END = 0;
    public static final int MOVE_FORWARDS = 1;
    public static final int MOVE_BACKWARDS = 2;
    public static final int ROTATE_CLOCKWISE = 3;
    public static final int ROTATE_COUNTERCLOCKWISE = 4;

    public static final int FIRST_COMMAND = END;
    public static final int LAST_COMMAND = ROTATE_COUNTERCLOCKWISE;
    public static final String COMMAND_RANGE = "[" + Constants.FIRST_COMMAND + "-" + Constants.LAST_COMMAND + "]";

    public static final int OFF_X = -1;
    public static final int OFF_Y = -1;

}
