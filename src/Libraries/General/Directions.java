package Libraries.General;

public class Directions {

    public static String NORTH = "NORTH";
    public static String SOUTH = "SOUTH";
    public static String EAST = "EAST";
    public static String WEST = "WEST";

    public static void rotateDir(String dir) {
        if (dir.equals(NORTH)) {
            dir = EAST;
        } else if (dir.equals(EAST)) {
            dir = SOUTH;
        } else if (dir.equals(SOUTH)) {
            dir = WEST;
        } else if (dir.equals(WEST)) {
            dir = NORTH;
        }
    }
}
