package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DoneForm extends JDialog{
    private JPanel donePanel;
    private JButton createOneMoreButton;
    private JButton exitButton;

    public DoneForm(JFrame parent){
        super(parent);
        setContentPane(donePanel);
        setLocationRelativeTo(null);
        setSize(350, 250);
        setVisible(true);
        createOneMoreButton.addActionListener(e -> {
            new StartForm(null);
            setVisible(false);
            dispose();
        });
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        new DoneForm(null);
    }
}
