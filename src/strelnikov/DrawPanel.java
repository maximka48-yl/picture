package strelnikov;

import strelnikov.elements.*;

import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {
    private Cave cave;

    public DrawPanel(Cave cave) {
        this.cave = cave;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        Background.draw((Graphics2D) g);

        for (Stone stone : cave.getThirdLayer()) {
            stone.draw((Graphics2D) g);
        }

        for (Stone stone : cave.getSecondLayer()) {
            stone.draw((Graphics2D) g);
        }

        cave.getSis().draw((Graphics2D) g);

        cave.getPs().draw((Graphics2D) g);

        for (Stone stone : cave.getFirstLayer()) {
            stone.draw((Graphics2D) g);
        }

        //TODO: add randomized boulders (class)
    }
}
