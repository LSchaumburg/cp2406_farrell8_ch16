/**
 * Created by Luke on 17/10/2016.
 */
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.geom.*;

public class JStatePanel extends JPanel
{
    @Override
    public void paintComponent(Graphics gr)
    {
        super.paintComponent(gr);
        Graphics2D gr2D = (Graphics2D)gr;
        gr2D.drawString("Tasmania",50,50);
        GeneralPath pol = new GeneralPath();
        pol.moveTo(50F,50F);
        pol.moveTo(0F,150F);
        pol.lineTo(150F,150F);
        pol.closePath();
        gr2D.draw(pol);
    }
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.add(new JStatePanel());
        frame.setSize(200, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}