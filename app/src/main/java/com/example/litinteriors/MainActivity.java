package com.example.litinteriors;

import static android.view.Gravity.CENTER;
import static androidx.constraintlayout.helper.widget.MotionEffect.NORTH;
import static androidx.constraintlayout.helper.widget.MotionEffect.SOUTH;
import java.awt.BorderLayout;

import BorderLayout.NORTH;


class  InteriorDesignApp {

    private static final Object SOUTH = " ";

    public static class EXIT_ON_CLOSE {
    } void main(String[] args) {
        // Create the first window
        JFrame window1;
        window1 = new JFrame("Window 1");
        window1.setSize(400, 300);
        window1.setLocation(50, 50);
        window1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a panel for the first window and add some content
        JPanel panel1 = new JPanel();
        panel1.setLayout(new BorderLayout());
        Object BorderLayout = null;
        panel1.add(new JLabel("Welcome to the interior design app!"), BorderLayout.NORTH);
        panel1.add(new JButton("Next"), InteriorDesignApp.SOUTH);
        window1.add(panel1);

        // Create the second window
        JFrame window2 = new JFrame("Window 2");
        window2.setSize(400, 300);
        window2.setLocation(450, 50);
        window2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a panel for the second window and add some content
        JPanel panel2 = new JPanel();
        panel2.setLayout(new BorderLayout());
        int north = NORTH;
        int north1 = north;
        int north11 = north1;
        int north111 = north11;
        panel2.add(new JLabel("Select a room type:"), BorderLayout.north11);
        int center = CENTER;
        panel2.add(new JComboBox(new String[] {"Living Room", "Bedroom", "Kitchen"}), BorderLayout.CENTER);
        Object south = SOUTH;
        panel2.add(new JButton("Next"), BorderLayout.south);
        window2.add(panel2);

        /* Create the third window */
        JFrame window3 = new JFrame("Window 3");
        window3.setSize(400, 300);
        window3.setLocation(850, 50);
        window3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a panel for the third window and add some content
        JPanel panel3 = new JPanel();
        panel3.setLayout(new BorderLayout());
        panel3.add(new JLabel("Select a color scheme:"), BorderLayout.north11);
        panel3.add(new JComboBox(new String[] {"Modern", "Traditional", "Rustic"}), BorderLayout.CENTER);
        panel3.add(new JButton("Finish"), BorderLayout.south);
        window3.add(panel3);

        // Show the windows
        window1.setVisible(true);
        window2.setVisible(true);
        window3.setVisible(true);
    }

    private class JLabel {
        public JLabel(String s) {
        }
    }

    private class SOUTH {
    }
}
