package strelnikov.elements;

import java.awt.*;

public class SwordInStone {
    private int x0;
    private int y0;

    private  int stoneWidth;

    private  int stoneHeight;
    private  int stoneLowestY;

    public SwordInStone(int x0, int y0, int stoneWidth, int stoneLowestY, int stoneHeight) {
        this.x0 = x0;
        this.y0 = y0;
        this.stoneWidth = stoneWidth;
        this.stoneHeight = stoneHeight;
        this.stoneLowestY = stoneLowestY;
    }

    public void draw(Graphics g) {
        Graphics2D graphics2D = (Graphics2D) g;
        Polygon polygon = new Polygon();
        polygon.addPoint(x0, y0 + stoneLowestY);
        polygon.addPoint(x0 + stoneWidth * 3 / 20, y0 + stoneLowestY - stoneHeight * 2 / 3);
        polygon.addPoint(x0 + stoneWidth * 2 / 5, y0 + stoneLowestY - stoneHeight);
        polygon.addPoint(x0 + stoneWidth * 3 / 4, y0 + stoneLowestY - stoneHeight * 4 / 5);
        polygon.addPoint(x0 + stoneWidth, y0 + stoneLowestY);
        graphics2D.setColor(Background.FIRST_LAYER_COLOR);
        graphics2D.fill(polygon);
        graphics2D.setColor(new Color(121, 121, 121, 125));
        graphics2D.draw(polygon);

        polygon = new Polygon();
        polygon.addPoint(x0 + stoneWidth / 2 - stoneWidth / 20, y0 + stoneLowestY - stoneHeight * 3 / 5);
        polygon.addPoint(x0 + stoneWidth / 2 - stoneWidth / 20, y0 + stoneLowestY - stoneHeight * 4 / 3);
        polygon.addPoint(x0 + stoneWidth / 2, y0 + stoneLowestY - stoneHeight * 4 / 3);
        polygon.addPoint(x0 + stoneWidth / 2, y0 + stoneLowestY - stoneHeight * 3 / 5);
        graphics2D.setColor(new Color(168, 158, 147));
        graphics2D.fill(polygon);

        polygon = new Polygon();
        polygon.addPoint(x0 + stoneWidth / 2, y0 + stoneLowestY - stoneHeight * 3 / 5);
        polygon.addPoint(x0 + stoneWidth / 2, y0 + stoneLowestY - stoneHeight * 4 / 3);
        polygon.addPoint(x0 + stoneWidth / 2 + stoneWidth / 20, y0 + stoneLowestY - stoneHeight * 4 / 3);
        polygon.addPoint(x0 + stoneWidth / 2 + stoneWidth / 20, y0 + stoneLowestY - stoneHeight * 3 / 5);
        graphics2D.setColor(new Color(222, 207, 192));
        graphics2D.fill(polygon);

        polygon = new Polygon();
        polygon.addPoint(x0 + stoneWidth / 2, y0 + stoneLowestY - stoneHeight * 4 / 3);
        polygon.addPoint(x0 + stoneWidth / 2 - stoneWidth / 4, y0 + stoneLowestY - stoneHeight * 4 / 3);
        polygon.addPoint(x0 + stoneWidth / 2 - stoneWidth / 10, y0 + stoneLowestY - stoneHeight * 3 / 2);
        polygon.addPoint(x0 + stoneWidth / 2, y0 + stoneLowestY - stoneHeight * 3 / 2);
        graphics2D.setColor(new Color(175, 133, 43));
        graphics2D.fill(polygon);

        polygon = new Polygon();
        polygon.addPoint(x0 + stoneWidth / 2, y0 + stoneLowestY - stoneHeight * 4 / 3);
        polygon.addPoint(x0 + stoneWidth / 2 + stoneWidth / 4, y0 + stoneLowestY - stoneHeight * 4 / 3);
        polygon.addPoint(x0 + stoneWidth / 2 + stoneWidth / 10, y0 + stoneLowestY - stoneHeight * 3 / 2);
        polygon.addPoint(x0 + stoneWidth / 2, y0 + stoneLowestY - stoneHeight * 3 / 2);
        graphics2D.setColor(new Color(220, 163, 54));
        graphics2D.fill(polygon);

        polygon = new Polygon();
        polygon.addPoint(x0 + stoneWidth / 2, y0 + stoneLowestY - stoneHeight * 3 / 2);
        polygon.addPoint(x0 + stoneWidth / 2 - stoneWidth / 20, y0 + stoneLowestY - stoneHeight * 3 / 2);
        polygon.addPoint(x0 + stoneWidth / 2 - stoneWidth / 20, y0 + stoneLowestY - stoneHeight * 9 / 5);
        polygon.addPoint(x0 + stoneWidth / 2, y0 + stoneLowestY - stoneHeight * 9 / 5);
        graphics2D.setColor(new Color(82, 43, 20));
        graphics2D.fill(polygon);

        polygon = new Polygon();
        polygon.addPoint(x0 + stoneWidth / 2, y0 + stoneLowestY - stoneHeight * 3 / 2);
        polygon.addPoint(x0 + stoneWidth / 2 + stoneWidth / 20, y0 + stoneLowestY - stoneHeight * 3 / 2);
        polygon.addPoint(x0 + stoneWidth / 2 + stoneWidth / 20, y0 + stoneLowestY - stoneHeight * 9 / 5);
        polygon.addPoint(x0 + stoneWidth / 2, y0 + stoneLowestY - stoneHeight * 9 / 5);
        graphics2D.setColor(new Color(119, 64, 29));
        graphics2D.fill(polygon);

        graphics2D.setColor(new Color(238, 168, 22));
        graphics2D.fillOval(x0 + stoneWidth / 2 - stoneWidth / 15, y0 + stoneLowestY - stoneHeight * 9 / 5 - stoneWidth / 15, stoneWidth * 2 / 15, stoneWidth * 2 / 15);

        polygon = new Polygon();
        polygon.addPoint(x0 + stoneWidth / 2, y0 - stoneHeight * 2);
        polygon.addPoint(x0 - stoneWidth / 10, y0 + stoneLowestY + 20);
        polygon.addPoint(x0 + stoneWidth + stoneWidth / 10, y0 + stoneLowestY + 20);
        graphics2D.setPaint(new GradientPaint(x0 + 100, y0 - stoneHeight, new Color(253, 215, 164, 0),
                x0 + 100, y0, new Color(253, 215, 164, 56)));
        graphics2D.fill(polygon);
    }
}
