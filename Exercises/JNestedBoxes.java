import javax.swing.*;
import java.awt.*;

/**
 * Created by Luke on 17/10/2016.
 */
public class JNestedBoxes extends JPanel {
    final int NUMBOXES = 8;
    final int INCREASE = 20;

    @Override
    public void paintComponent(Graphics gr)
    {
        super.paintComponent(gr);
        int width = 300;
        int height = 300;
        int x = 20;
        int y = 20;
        for(int count = 0; count < NUMBOXES; ++count)
        {
            gr.drawRect(x, y, width, height);
            x += INCREASE;
            y += INCREASE;
            width -= INCREASE * 2;
            height -= INCREASE * 2;
        }
    }
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.add(new JNestedBoxes());
        frame.setSize(360, 380);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
