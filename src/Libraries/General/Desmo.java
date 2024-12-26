package Libraries.General;

import java.awt.*;

public class Desmo {

    public static Color modifyColor(Color color, int n) {
        int left = Math.abs(3 * n);
        int r = color.getRed();
        int g = color.getGreen();
        int b = color.getBlue();
        if (n > 0) {
            while (r < 255 && left > 2 * n) {
                r++;
                left--;
            }
            while (g < 255 && left > n) {
                g++;
                left--;
            }
            while (r < 255 && left > 0) {
                b++;
                left--;
            }
        } else {
            while (r > 0 && left > 2 * n) {
                r--;
                left--;
            }
            while (g > 0 && left > n) {
                g--;
                left--;
            }
            while (r > 0 && left > 0) {
                b--;
                left--;
            }
        }
        return new Color(r, g, b);
    }
}
