import javax.swing.*;
import java.awt.*;

public class Cubo extends JPanel {
    double angulo = 0;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        g2d.translate(getWidth() / 2, getHeight() / 2);
        g2d.rotate(angulo);

        g2d.setColor(Color.RED);
        g2d.drawRect(-50, -50, 100, 100);
        g2d.setColor(Color.BLUE);
        g2d.drawRect(-25, -25, 100, 100);
        g2d.setColor(Color.BLACK);
        g2d.drawLine(-50, -50, -25, -25);
        g2d.drawLine(50, -50, 75, -25);
        g2d.drawLine(-50, 50, -25, 75);
        g2d.drawLine(50, 50, 75, 75);
    }

    public void rotarDer() {
        angulo += Math.toRadians(10);
    }

    public void rotarIzq() {
        angulo -= Math.toRadians(10);
    }
}
