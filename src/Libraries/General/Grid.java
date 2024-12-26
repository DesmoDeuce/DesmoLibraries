package Libraries.General;

import java.awt.*;
import java.util.ArrayList;

public class Grid {

    private Size dimensions;
    private Size rectSize;
    private Color color;
    private int gapSize;
    private ArrayList<Integer> xs;
    private ArrayList<Integer> ys;

    public Grid(Size dimensions, Size rectSize, Color color, int gapSize) {
        this.dimensions = dimensions;
        this.rectSize = rectSize;
        this.color = color;
        this.gapSize = gapSize;
        xs = new ArrayList<>();
        ys = new ArrayList<>();
        setLists();
    }

    public Grid(Size dimensions, Size rectSize, Color color) {
        this.dimensions = dimensions;
        this.rectSize = rectSize;
        this.color = color;
        this.gapSize = 1;
        xs = new ArrayList<>();
        ys = new ArrayList<>();
        setLists();
    }

    public void setLists() {
        for (int x = 0; x < dimensions.getWidth(); x++) {
            xs.add(gapSize + ((rectSize.getWidth() + gapSize) * x));
        }
        for (int y = 0; y < dimensions.getHeight(); y++) {
            ys.add(gapSize + ((rectSize.getHeight() + gapSize) * y));
        }
    }

    public void draw(Graphics2D graphics) {
        graphics.setColor(color);
        for (int x : xs) {
            for (int y : ys) {
                graphics.fillRect(x, y, rectSize.getWidth(), rectSize.getHeight());
            }
        }
    }

    public ArrayList<Position> getPoss() {
        ArrayList<Position> poss = new ArrayList<>();

        for (int x : getXs()) {
            for (int y : getYs()) {
                poss.add(new Position(x, y));
            }
        }
        return poss;
    }

    public Size getDimensions() {
        return dimensions;
    }

    public Size getRectSize() {
        return rectSize;
    }

    public Color getColor() {
        return color;
    }

    public int getGapSize() {
        return gapSize;
    }

    public ArrayList<Integer> getXs() {
        return xs;
    }

    public ArrayList<Integer> getYs() {
        return ys;
    }

    public void setDimensions(Size dimensions) {
        this.dimensions = dimensions;
    }

    public void setRectSize(Size rectSize) {
        this.rectSize = rectSize;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setGapSize(int gapSize) {
        this.gapSize = gapSize;
    }

    public void setXs(ArrayList<Integer> xs) {
        this.xs = xs;
    }

    public void setYs(ArrayList<Integer> ys) {
        this.ys = ys;
    }
}
