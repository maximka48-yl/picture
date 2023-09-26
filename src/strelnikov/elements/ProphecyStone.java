package strelnikov.elements;

import java.awt.*;

public class ProphecyStone {
    private int x0;
    private int y0;
    private final int STONE_Y0 = 250;

    public ProphecyStone(int x0, int y0) {
        this.x0 = x0;
        this.y0 = y0;
    }

    public void draw(Graphics2D graphics2D) {
        Polygon polygon = new Polygon();
        polygon.addPoint(x0, y0 + STONE_Y0);
        polygon.addPoint(x0, y0 + STONE_Y0 / 3);
        polygon.addPoint(x0 + 80, y0);
        polygon.addPoint(x0 + 200, y0 + STONE_Y0 / 5);
        polygon.addPoint(x0 + 200, y0 + STONE_Y0);
        graphics2D.setColor(Background.FIRST_LAYER_COLOR);
        graphics2D.fill(polygon);
        graphics2D.setColor(new Color(121, 121, 121, 125));
        graphics2D.draw(polygon);

        graphics2D.setColor(Background.SECOND_LAYER_COLOR);
        graphics2D.setFont(new Font("Calibri", Font.BOLD, 20));
        String[] words = new String[]{"ЛИШЬ", "ДОСТОЙНЕЙШИЙ", "СМОЖЕТ ПОДНЯТЬ", "ЭТОТ МЕЧ"};
        for (int i = 0; i < words.length; i++) {
            graphics2D.drawString(words[i], x0 + 95 - 11 * words[i].length() / 2, y0 + STONE_Y0 * 2 / 5 + 25 * i);
        }
//        graphics2D.drawString("ЛИШЬ", x0 + 100 - 10, y0 + STONE_Y0 / 3);
//        graphics2D.drawString("ДОСТОЙНЕЙШИЙ", x0 + 100 - 30, y0 + STONE_Y0 / 3 + 25);
//        graphics2D.drawString("СМОЖЕТ ПОДНЯТЬ", x0 + 100 - 35, y0 + STONE_Y0 / 3 + 50);
//        graphics2D.drawString("ЭТОТ МЕЧ", x0 + 100 - 20, y0 + STONE_Y0 / 3 + 75);
    }
}
