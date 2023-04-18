package com.company;

import javax.swing.*;

public class StartForm extends JDialog{
    private JButton comedyCreate;
    private JButton adventureCreate;
    private JButton documentaryCreate;
    private JPanel startPanel;

    public StartForm(JFrame parent){
        super(parent);
        setContentPane(startPanel);
        setLocationRelativeTo(null);
        setSize(300, 250);
        setVisible(true);
        comedyCreate.addActionListener(e -> {
            ComedyForm comedyForm = new ComedyForm(null);
            comedyForm.show();
            dispose();
            setVisible(false);
        });
        adventureCreate.addActionListener(e -> {
            AdventureForm adventureForm = new AdventureForm(null);
            adventureForm.show();
            dispose();
            setVisible(false);
        });
        documentaryCreate.addActionListener(e -> {
            DocumentaryForm documentaryForm = new DocumentaryForm(null);
            documentaryForm.show();
            dispose();
            setVisible(false);
        });
    }

    public static void main(String[] args) {
        new StartForm(null);
    }

}
