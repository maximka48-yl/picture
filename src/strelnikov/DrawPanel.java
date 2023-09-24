package strelnikov;

import strelnikov.elements.Stone;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class DrawPanel extends JPanel {
    public DrawPanel() {
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Random random = new Random();
        int lastWidth;
//        for (int i = random.nextInt(-10, 5); i < 1200; i = random.nextInt(i + lastWidth - 15, i + lastWidth + 5)) {
//            lastWidth = random.nextInt(40, 60);
//            Stone stone = new Stone(i, 80,
//                    lastWidth, random.nextInt(100, 180),
//                    random.nextInt(3, 6),
//                    1 / (double) random.nextInt(2, 3),
//                    new Color(72, 72, 72, 255), true);
//            stone.draw(g);
//        }

        for (int i = random.nextInt(-5, 10); i < 1200; i = random.nextInt(i + lastWidth - 5, i + lastWidth + 15)) {
            lastWidth = random.nextInt(60, 85);
            Stone stone = new Stone(i, 20,
                    lastWidth, random.nextInt(140, 220),
                    random.nextInt(5, 7),
                    1 / (double) random.nextInt(2, 3),
                    new Color(112, 112, 112, 255), true);
            stone.draw(g);
        }

        //Stone stone_1 = new Stone(0, 800, 200, 800, 10, 1/2.0, Color.gray,true, true);
    }
}
