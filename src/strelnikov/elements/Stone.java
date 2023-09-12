package strelnikov.elements;

import java.awt.*;

public class Stone {
    private int x0;
    private int y0;
    private int width;
    private int height;
    private int amplitude;
    private double division;
    private double k;

    /**
     * *
     * @param x0
     * @param y0
     * @param width
     * @param height
     * @param amplitude
     * @param division should be between 0 & 1: 0 < division < 1
     */
    public Stone(int x0, int y0, int width, int height, int amplitude, double division) {
        this.x0 = x0;
        this.y0 = y0;
        this.width = width;
        this.height = height;
        this.amplitude = amplitude;
        this.division = division;
    }

    public void draw(Graphics g) {
        Graphics2D graphics = (Graphics2D) g;
        Polygon p = new Polygon();
        for (int i = 0; i < width * division; i++) {
            p.addPoint(x0 + i,
                    (int) (-Math.sin(Math.PI * (i / (width * division / amplitude))) * amplitude - (height / (division * width)) * (i) + y0));
        }
        for (int i = (int) (width * division); i <= width; i++) {
            p.addPoint(x0 + i,
                    (int) (-Math.sin(Math.PI * (i / (width * (1 - division) / amplitude))) * amplitude + (height / ((1 - division) * width)) * (i) - height / (1 - division) + y0));
        }
        /*System.out.println((Math.sin(amplitude * width / k) * amplitude + y0 - height / (division - 1) + (height / ((division - 1) * width / division)) * width));
        *graphics.setColor(Color.GRAY);
        *graphics.fill(p);*/
        graphics.draw(p);
    }
}
