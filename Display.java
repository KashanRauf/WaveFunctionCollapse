import java.awt.Color;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.GridLayout;
import java.util.Random;

public class Display extends JPanel {
    public Display() {
        Random r = new Random();

        setPreferredSize(new Dimension(600, 600));
        setBackground(Color.GRAY);
        // Using constants for now, will be variable soon
        setLayout(new GridLayout(5, 5));

        JLabel[][] icons = new JLabel[5][5];

        for (int i = 0; i < icons.length; i++) {
            for (int j = 0; j < icons[0].length; j++) {
                icons[i][j] = new JLabel(new ImageIcon("Tiles\\" + r.nextInt(5) + ".png"));
                add(icons[i][j]);
            }
        }
        
    }
}