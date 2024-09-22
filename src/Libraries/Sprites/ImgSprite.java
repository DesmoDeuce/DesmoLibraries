package Libraries.Sprites;

import Libraries.General.Position;
import Libraries.General.Size;

import java.awt.*;
import java.awt.image.BufferedImage;

public class ImgSprite extends Sprite {

    private BufferedImage image;

    public ImgSprite(Position pos, Size size, boolean solid, BufferedImage image) {
        super(pos, size, solid);
        this.image = image;
    }

    @Override
    public void draw(Graphics2D graphics) {
        graphics.drawImage(image, getPos().getX(), getPos().getY(), getSize().getWidth(), getSize().getHeight(), null);
    }

    public void draw(Graphics2D graphics, double scale) {
        graphics.drawImage(image, getPos().getX(), getPos().getY(), (int) Math.round(getSize().getWidth() * scale), (int) Math.round(getSize().getHeight() * scale), null);
    }

    public BufferedImage getImage() {
        return image;
    }

    public void setImage(BufferedImage image) {
        this.image = image;
    }
}
