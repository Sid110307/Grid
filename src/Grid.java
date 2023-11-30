import javax.swing.*;
import java.awt.*;

public class Grid {
    static int size = 50;

    JFrame frame;
    JButton button;

    public Grid(int row, int col) {
        frame = new JFrame();

        for (int i = 0; i < row * col; ++i) {
            button = new JButton();
            frame.add(button);
        }

        frame.setTitle(Grid.class.getSimpleName());
        frame.setLayout(new GridLayout(row, col));
        frame.setSize(row * size, col * size);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Grid(10, 10);
    }
}
