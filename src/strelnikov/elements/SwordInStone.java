package strelnikov.elements;

import java.awt.*;

public class SwordInStone {
    private int x0;
    private int y0;

    private final int STONE_HEIGHT = 160;
    private final int STONE_Y0 = 300;

    public SwordInStone(int x0, int y0) {
        this.x0 = x0;
        this.y0 = y0;
    }

    public void draw(Graphics g) {
        Graphics2D graphics2D = (Graphics2D) g;
        Polygon polygon = new Polygon();
        polygon.addPoint(x0, y0 + STONE_Y0);
        polygon.addPoint(x0 + 30, y0 + STONE_Y0 - STONE_HEIGHT * 2 / 3);
        polygon.addPoint(x0 + 80, y0 + STONE_Y0 - STONE_HEIGHT);
        polygon.addPoint(x0 + 150, y0 + STONE_Y0 - STONE_HEIGHT * 4 / 5);
        polygon.addPoint(x0 + 200, y0 + STONE_Y0);
        graphics2D.setColor(Background.FIRST_LAYER_COLOR);
        graphics2D.fill(polygon);
        graphics2D.setColor(new Color(121, 121, 121, 125));
        graphics2D.draw(polygon);

        polygon = new Polygon();
        polygon.addPoint(x0 + 90, y0 + STONE_Y0 - STONE_HEIGHT * 3 / 5);
        polygon.addPoint(x0 + 90, y0 + STONE_Y0 - STONE_HEIGHT * 4 / 3);
        polygon.addPoint(x0 + 100, y0 + STONE_Y0 - STONE_HEIGHT * 4 / 3);
        polygon.addPoint(x0 + 100, y0 + STONE_Y0 - STONE_HEIGHT * 3 / 5);
        graphics2D.setColor(new Color(168, 158, 147));
        graphics2D.fill(polygon);

        polygon = new Polygon();
        polygon.addPoint(x0 + 100, y0 + STONE_Y0 - STONE_HEIGHT * 3 / 5);
        polygon.addPoint(x0 + 100, y0 + STONE_Y0 - STONE_HEIGHT * 4 / 3);
        polygon.addPoint(x0 + 110, y0 + STONE_Y0 - STONE_HEIGHT * 4 / 3);
        polygon.addPoint(x0 + 110, y0 + STONE_Y0 - STONE_HEIGHT * 3 / 5);
        graphics2D.setColor(new Color(222, 207, 192));
        graphics2D.fill(polygon);

        polygon = new Polygon();
        polygon.addPoint(x0 + 100, y0 + STONE_Y0 - STONE_HEIGHT * 4 / 3);
        polygon.addPoint(x0 + 50, y0 + STONE_Y0 - STONE_HEIGHT * 4 / 3);
        polygon.addPoint(x0 + 80, y0 + STONE_Y0 - STONE_HEIGHT * 3 / 2);
        polygon.addPoint(x0 + 100, y0 + STONE_Y0 - STONE_HEIGHT * 3 / 2);
        graphics2D.setColor(new Color(175, 133, 43));
        graphics2D.fill(polygon);

        polygon = new Polygon();
        polygon.addPoint(x0 + 100, y0 + STONE_Y0 - STONE_HEIGHT * 4 / 3);
        polygon.addPoint(x0 + 150, y0 + STONE_Y0 - STONE_HEIGHT * 4 / 3);
        polygon.addPoint(x0 + 120, y0 + STONE_Y0 - STONE_HEIGHT * 3 / 2);
        polygon.addPoint(x0 + 100, y0 + STONE_Y0 - STONE_HEIGHT * 3 / 2);
        graphics2D.setColor(new Color(220, 163, 54));
        graphics2D.fill(polygon);

        polygon = new Polygon();
        polygon.addPoint(x0 + 100, y0 + STONE_Y0 - STONE_HEIGHT * 3 / 2);
        polygon.addPoint(x0 + 90, y0 + STONE_Y0 - STONE_HEIGHT * 3 / 2);
        polygon.addPoint(x0 + 90, y0 + STONE_Y0 - STONE_HEIGHT * 9 / 5);
        polygon.addPoint(x0 + 100, y0 + STONE_Y0 - STONE_HEIGHT * 9 / 5);
        graphics2D.setColor(new Color(82, 43, 20));
        graphics2D.fill(polygon);

        polygon = new Polygon();
        polygon.addPoint(x0 + 100, y0 + STONE_Y0 - STONE_HEIGHT * 3 / 2);
        polygon.addPoint(x0 + 110, y0 + STONE_Y0 - STONE_HEIGHT * 3 / 2);
        polygon.addPoint(x0 + 110, y0 + STONE_Y0 - STONE_HEIGHT * 9 / 5);
        polygon.addPoint(x0 + 100, y0 + STONE_Y0 - STONE_HEIGHT * 9 / 5);
        graphics2D.setColor(new Color(119, 64, 29));
        graphics2D.fill(polygon);

        graphics2D.setColor(new Color(238, 168, 22));
        graphics2D.fillOval(x0 + 87, y0 + STONE_Y0 - STONE_HEIGHT * 9 / 5 - 13, 26, 26);
    }
}
