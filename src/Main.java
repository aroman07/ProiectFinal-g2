//Am modificat ceva
//Si inca ceva
import javax.swing.*;

public class Main {
    JPanel panel;

    public static void main(String[] args) {
        Main m = new Main();
        m.panel = new JPanel();

        JFrame frame = new JFrame("App");
        frame.setContentPane(m.panel);
        frame.pack();
        frame.setVisible(true);
    }
}
