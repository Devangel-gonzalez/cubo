import javax.swing.JFrame;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Main extends JFrame {
    Cubo cubo;

    public Main() {
        super("Cubo Rotatorio");
        cubo = new Cubo();
        add(cubo);
        addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                char key = e.getKeyChar();
                switch (key) {
                    case 'r':
                    case 'R':
                        rotarDer();
                        break;
                    case 'l':
                    case 'L':
                        rotarIzq();
                        break;
                }
            }
        });
    }

    public static void main(String[] args) {
        Main ventana = new Main();
        ventana.setSize(640, 480);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void rotarDer() {
        cubo.rotarDer();
        repaint();
    }

    private void rotarIzq() {
        cubo.rotarIzq();
        repaint();
    }
}
