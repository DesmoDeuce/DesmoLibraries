package Libraries.Sprites;

import Libraries.General.Grid;
import Libraries.General.Position;
import Libraries.General.Size;

import java.awt.*;

public class RectSprite extends Sprite {

    private Color color;

    public RectSprite(Position pos, Size size, boolean solid, Color color) {
        super(pos, size, solid);
        this.color = color;
    }

    @Override
    public void draw(Graphics2D graphics) {
        graphics.setColor(color);
        graphics.fillRect(getPos().getX(), getPos().getY(), getSize().getWidth(), getSize().getHeight());
    }

    public void draw(Graphics2D graphics, double scale) {
        graphics.setColor(color);
        graphics.fillRect(getPos().getX(), getPos().getY(), (int) Math.round(getSize().getWidth() * scale), (int) Math.round(getSize().getHeight() * scale));
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
