package pl.kfrak;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import static com.sun.glass.ui.Cursor.setVisible;

/**
 * Created by RENT on 2017-04-28.
 */
public class AdvKantor extends JFrame {
    public static void main(String[] args) {
        new AdvKantor();
    }

    public AdvKantor() {
        setVisible(true);
        setSize(new Dimension(800, 600));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(null);

        //labelka 1
        JLabel GetAmount = new JLabel("Podaj kwotę:");
        GetAmount.setSize(100, 50);
        GetAmount.setLocation(50, 50);
        add(GetAmount);

        //textfield 1
        final JTextField AmountField = new JTextField();
        AmountField.setSize(200, 50);
        AmountField.setLocation(50, 120); //100, 150;
        add(AmountField);

        //przycisk PLN->EUR
        JButton buttonToEUR = new JButton("PLN -> EUR");
        buttonToEUR.setSize(160, 50);
        buttonToEUR.setLocation(50, 190);
        add(buttonToEUR);

        //przycisk EUR->PLN
        JButton buttonToPLN = new JButton("EUR -> PLN");
        buttonToPLN.setSize(160, 50);
        buttonToPLN.setLocation(230, 190);
        add(buttonToPLN);

        //labelka 2
        JLabel Result = new JLabel("Wynik:");
        Result.setSize(100, 50);
        Result.setLocation(50, 260);
        add(Result);

        //textfield 2
        final JTextField ResultField = new JTextField();
        ResultField.setSize(200, 50);
        ResultField.setLocation(50, 320);
        add(ResultField);

        buttonToPLN.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String PLNamount = AmountField.getText();
                double amount = Double.parseDouble(PLNamount);
                double amountEuro = amount / 4.5;

                ResultField.setText("" + amountEuro);
            }
        });

        buttonToEUR.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String EURamount = AmountField.getText();
                double amount = Double.parseDouble(EURamount);
                double amountPLN = amount * 4.5;

                ResultField.setText("" + amountPLN);
            }
        });
    }
}
