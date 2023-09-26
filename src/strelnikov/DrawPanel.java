package strelnikov;

import strelnikov.elements.*;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class DrawPanel extends JPanel {
    ArrayList<Stone> firstLayer = new ArrayList<>();
    ArrayList<Stone> secondLayer = new ArrayList<>();
    ArrayList<Stone> thirdLayer = new ArrayList<>();

    SwordInStone sis;
    ProphecyStone ps;

    public DrawPanel() {
        Random random = new Random();
        Stone stone;
        int lastWidth;
        for (int i = random.nextInt(-10, 5); i < 1200; i = random.nextInt(i + lastWidth - 15, i + lastWidth + 5)) {
            lastWidth = random.nextInt(40, 60);
            stone = new Stone(i, 160,
                    lastWidth, random.nextInt(100, 180),
                    random.nextInt(3, 6),
                    1 / (double) random.nextInt(2, 3),
                    Background.THIRD_LAYER_COLOR, true);
            thirdLayer.add(stone);
        }

        for (int i = random.nextInt(-5, 10); i < 1200; i = random.nextInt(i + lastWidth - 5, i + lastWidth + 15)) {
            lastWidth = random.nextInt(60, 85);
            stone = new Stone(i, 90,
                    lastWidth, random.nextInt(140, 220),
                    random.nextInt(5, 7),
                    1 / (double) random.nextInt(2, 3),
                    Background.SECOND_LAYER_COLOR, true);
            secondLayer.add(stone);
        }

        for (int i = random.nextInt(0, 25); i < 1200; i = random.nextInt(i + lastWidth - 5, i + lastWidth + 25)) {
            lastWidth = random.nextInt(80, 100);
            stone = new Stone(i, 25,
                    lastWidth, random.nextInt(180, 260),
                    random.nextInt(5, 8),
                    1 / (double) random.nextInt(2, 3),
                    Background.FIRST_LAYER_COLOR, true);
            firstLayer.add(stone);
        }

        sis = new SwordInStone(650, 300, 200, 300, 160);
        ps = new ProphecyStone(350, 350);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        Background.draw(g);

        for (Stone stone: thirdLayer) {
            stone.draw(g);
        }

        for (Stone stone: secondLayer) {
            stone.draw(g);
        }

        sis.draw(g);

        ps.draw(g);

        for (Stone stone: firstLayer) {
            stone.draw(g);
        }

        //TODO: add randomized boulders (class)
    }
}
