public class Table {
    private int xSize = 0;
    private int ySize = 0;
    private int xPosition = 0;
    private int yPosition = 0;
    private int orientation = Constants.DEFAULT_ORIENTATION;

    public Table(int xSize, int ySize, int xPosition, int yPosition) {
        this.xSize = xSize;
        this.ySize = ySize;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }

    public int getXPosition() {
        return xPosition;
    }

    public int getYPosition() {
        return yPosition;
    }

    public int getOrientation() {
        return orientation;
    }

    public boolean moveForwards() {
        return move(orientation);
    }

    public boolean moveBackwards() {
        return switch (orientation) {
            case Constants.NORTH -> move(Constants.SOUTH);
            case Constants.SOUTH -> move(Constants.NORTH);
            case Constants.EAST -> move(Constants.WEST);
            case Constants.WEST -> move(Constants.EAST);
            default -> false;
        };
    }

    private boolean move(int direction) {
        boolean validMove = false;
        int tentativeXPosition = xPosition;
        int tentativeYPosition = yPosition;

        switch (direction) {
            case Constants.NORTH -> tentativeYPosition--;
            case Constants.SOUTH -> tentativeYPosition++;
            case Constants.EAST -> tentativeXPosition++;
            case Constants.WEST -> tentativeXPosition--;
        }

        if (validatePosition(tentativeXPosition, tentativeYPosition)) {
            validMove = true;
            xPosition = tentativeXPosition;
            yPosition = tentativeYPosition;
        } else {
            xPosition = -1;
            yPosition = -1;
        }

        return validMove;
    }

    private boolean validatePosition(int x, int y) {
        return x >= 0 && x < xSize && y >= 0 && y < ySize;
    }

    public void rotateClockwise() {
        switch (orientation) {
            case Constants.NORTH -> orientation = Constants.EAST;
            case Constants.EAST -> orientation = Constants.SOUTH;
            case Constants.SOUTH -> orientation = Constants.WEST;
            case Constants.WEST -> orientation = Constants.NORTH;
        }
    }

    public void rotateCounterClockwise() {
        switch (orientation) {
            case Constants.NORTH -> orientation = Constants.WEST;
            case Constants.WEST -> orientation = Constants.SOUTH;
            case Constants.SOUTH -> orientation = Constants.EAST;
            case Constants.EAST -> orientation = Constants.NORTH;
        }
    }

}
