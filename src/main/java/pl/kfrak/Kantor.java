package pl.kfrak;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by RENT on 2017-04-28.
 */
public class Kantor {
    public static void main(String[] args) {
        JFrame windowKantor = new JFrame();
        windowKantor.setVisible(true);
        windowKantor.setSize(600, 300);
        windowKantor.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        windowKantor.setLayout(new FlowLayout());

        //dodanie textFielda dla złotówek
        final JTextField zlotowki = new JTextField();
        zlotowki.setPreferredSize(new Dimension(150, 40));
        windowKantor.add(zlotowki);

        //dodanie przycisku "przelicz"
        JButton button = new JButton("Przelicz");
        windowKantor.add(button);

        //dodanie textFielda dla euro
        final JTextField euro = new JTextField();
        euro.setPreferredSize(new Dimension(150, 40));
        windowKantor.add(euro);


        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String PLNAmount = zlotowki.getText();
                double amount = Double.parseDouble(PLNAmount);
                double amountEuro = amount/4.5;

                euro.setText("" + amountEuro);
            }
        });
    }
}
