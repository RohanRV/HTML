import java.awt.*;
import javax.swing.*;

public class java extends JTextArea {
    public void paint(Graphics g) {
        super.paint(g);
        g.drawString("Hello, World!", 25, 25);
    }
}