package Libraries.Sprites;

import Libraries.General.Position;
import Libraries.General.Size;

import java.awt.*;
import java.util.ArrayList;

public class Sprite {

    private Position pos;
    private Size size;
    private boolean solid;
    private BoundingBox box;

    public Sprite(Position pos, Size size, boolean solid) {
        this.pos = pos;
        this.size = size;
        this.solid = solid;
        box = new BoundingBox(pos, new Position(pos.getX() + size.getWidth(), pos.getY() + getSize().getHeight()));
    }

    public void draw(Graphics2D graphics) {

    }

    public boolean collidedWith(Sprite sprite) {
        return (box.getPos1().getX() <= sprite.getBox().getPos2().getX()
                && box.getPos1().getX() >= sprite.getBox().getPos1().getX()
                && box.getPos1().getY() <= sprite.getBox().getPos2().getY()
                && box.getPos1().getY() >= sprite.getBox().getPos1().getY())
                || (box.getPos1().getX() <= sprite.getBox().getPos2().getX()
                && box.getPos1().getX() >= sprite.getBox().getPos1().getX()
                && box.getPos2().getY() >= sprite.getBox().getPos1().getY()
                && box.getPos2().getY() <= sprite.getBox().getPos2().getY())
                || (box.getPos2().getX() >= sprite.getBox().getPos1().getX()
                && box.getPos2().getX() <= sprite.getBox().getPos2().getX()
                && box.getPos1().getY() <= sprite.getBox().getPos2().getY()
                && box.getPos1().getY() >= sprite.getBox().getPos1().getY())
                || (box.getPos2().getX() >= sprite.getBox().getPos1().getX()
                && box.getPos2().getX() <= sprite.getBox().getPos2().getX()
                && box.getPos2().getY() <= sprite.getBox().getPos1().getY()
                && box.getPos2().getY() >= sprite.getBox().getPos2().getY());
    }

    public Position getPos() {
        return pos;
    }

    public Size getSize() {
        return size;
    }

    public boolean isSolid() {
        return solid;
    }

    public BoundingBox getBox() {
        return box;
    }

    public void setPos(Position pos) {
        this.pos = pos;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public void setSolid(boolean solid) {
        this.solid = solid;
    }
}
