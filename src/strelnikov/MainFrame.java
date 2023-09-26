package strelnikov;

import javax.swing.*;

public class MainFrame extends JFrame {
    private final DrawPanel drawPanel;

    public MainFrame() {
        drawPanel = new DrawPanel(new Cave());
        this.add(drawPanel);
    }
}
