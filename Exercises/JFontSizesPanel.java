import javax.swing.*;
import java.awt.*;

/**
 * Created by Luke on 17/10/2016.
 */
public class JFontSizesPanel extends JPanel{
    String phrase = new String("Do or do not. There is no try");
    final int START = 6;
    final int STOP = 20;
    final int HORIZONTAL_POS = 50;
    final int INCREASE = 20;
    Font myFont;

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        int verticalPos = 10;
        for(int i = START; i <= STOP; ++i)
        {
            myFont = new Font("TimesRoman", Font.BOLD, i);
            g.setFont(myFont);
            g.drawString(phrase, HORIZONTAL_POS, verticalPos);
            verticalPos += INCREASE;
        }
    }
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.add(new JFontSizesPanel());
        frame.setSize(360, 340);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

