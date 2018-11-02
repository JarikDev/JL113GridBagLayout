package com;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    static JFrame jFrame = getFrame();
    static JPanel jPanel = new JPanel();

    public static void main(String[] args) {
        jFrame.add(jPanel);
        GridBagLayout gridBagLayout = new GridBagLayout();
        jPanel.setLayout(gridBagLayout);

        GridBagConstraints cont1 = new GridBagConstraints();
        cont1.weightx = 0;
        cont1.weighty = 0;
        cont1.gridx = 0;
        cont1.gridy = 0;
        cont1.gridheight = 2;
        cont1.gridwidth = 2;
        jPanel.add(new JTextArea(4, 20), cont1);

        GridBagConstraints cont2 = new GridBagConstraints();
        cont2.weightx = 0;
        cont2.weighty = 0;
        cont2.gridx = 2;
        cont2.gridy = 0;
        cont2.gridheight = 1;
        cont2.gridwidth = 2;
        jPanel.add(new JButton("submit very long name"), cont2);

        GridBagConstraints cont3 = new GridBagConstraints();
        cont3.weightx = 0;
        cont3.weighty = 0;
        cont3.gridx = 2;
        cont3.gridy = 1;
        cont3.gridheight = 1;
        cont3.gridwidth = 1;
        jPanel.add(new JButton("Submit"), cont3);

        GridBagConstraints cont4 = new GridBagConstraints();
        cont4.weightx = 0;
        cont4.weighty = 0;
        cont4.gridx = 3;
        cont4.gridy = 1;
        cont4.gridheight = 1;
        cont4.gridwidth = 1;
        JButton exit = new JButton("Exit");
        jPanel.add(exit, cont4);
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        jPanel.revalidate();
    }

    static JFrame getFrame() {
        JFrame jFrame = new JFrame() {
        };
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        jFrame.setBounds(dimension.width / 2 - 250, dimension.height / 2 - 150, 500, 500);
        return jFrame;

    }
}
