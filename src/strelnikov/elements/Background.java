package strelnikov.elements;

import java.awt.*;

public class Background {
    public static final Color BACKGROUND_COLOR = new Color(35, 35, 35);
    public static final Color THIRD_LAYER_COLOR = new Color(70, 70, 70, 255);
    public static final Color SECOND_LAYER_COLOR = new Color(100, 100, 100, 255);
    public static final Color FIRST_LAYER_COLOR = new Color(150, 150, 150, 255);
    public static void draw(Graphics g) {
        Graphics2D graphics2D = (Graphics2D) g;
        graphics2D.setColor(BACKGROUND_COLOR);
        graphics2D.fillRect(0, 0, 1200, 800);

        graphics2D.setColor(FIRST_LAYER_COLOR);
        graphics2D.fillRect(0, 0, 1200, 90);
        graphics2D.setColor(SECOND_LAYER_COLOR);
        graphics2D.fillOval(0, 90 - 40, 1200, 80);
        graphics2D.fillRect(0, 90, 1200, 70);
        graphics2D.setColor(THIRD_LAYER_COLOR);
        graphics2D.fillOval(0, 160 - 40, 1200, 80);
        graphics2D.setColor(BACKGROUND_COLOR);
        graphics2D.fillOval(0, 200 - 40, 1200, 80);

        graphics2D.setColor(THIRD_LAYER_COLOR);
        graphics2D.fillOval(0, 450 - 50, 1200, 100);
        graphics2D.fillRect(0, 450, 1200, 400);
        graphics2D.setColor(SECOND_LAYER_COLOR);
        graphics2D.fillOval(100, 450, 1000, 300);
        graphics2D.setColor(FIRST_LAYER_COLOR);
        graphics2D.fillOval(250, 500, 700, 200);
        graphics2D.setColor(new Color(0xFFFFFF));
    }
}
