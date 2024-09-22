package Libraries.General;

public class Position {

    private int x;
    private int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Position pos) {
        return Math.sqrt(((x - pos.getX()) ^ 2) + ((y - pos.getY()) ^ 2));
    }

    public Position add(String dir, Grid grid) {
        int x1 = x;
        int y1 = y;
        if (dir.equals(Directions.NORTH)) {
            y1 -= grid.getRectSize().getHeight() + grid.getGapSize();
        }
        if (dir.equals(Directions.SOUTH)) {
            y1 += grid.getRectSize().getHeight() + grid.getGapSize();
        }
        if (dir.equals(Directions.EAST)) {
            x1 += grid.getRectSize().getWidth() + grid.getGapSize();
        }
        if (dir.equals(Directions.WEST)) {
            x1 -= grid.getRectSize().getWidth() + grid.getGapSize();
        }
        return new Position(x1, y1);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}
