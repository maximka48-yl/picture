package strelnikov;

import strelnikov.elements.Stone;

import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {
    public DrawPanel() {
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Stone stone = new Stone(0, 800, 1200, 800, 10, 7/9.0);
        stone.draw(g);
        Graphics2D graphics2D = (Graphics2D) g;
        graphics2D.drawLine(1200, 0, 1200, 800);
    }
}
