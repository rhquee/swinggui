package pl.kfrak.Window;

import javax.swing.*;
import java.awt.*;

/**
 * Created by RENT on 2017-04-28.
 */
public class CurrencyCalcWindow extends JFrame {
    public static void main(String[] args) {
        new CurrencyCalcWindow();
    }

    public CurrencyCalcWindow(){
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(new Dimension(600, 400));
        setLayout(null);

        JTextField textFieldKFR = new JTextField();
        //textFieldKFR.setPreferredSize(new Dimension(200, 50)); //do użytku z layout managerami
        textFieldKFR.setSize(100, 100); // gdy nie ma layouti managera
        textFieldKFR.setLocation(100, 200); // gdy nie ma layouti managera
        textFieldKFR.setBackground(Color.BLUE);
        add(textFieldKFR);

        JLabel label = new JLabel("krecik");
        label.setSize(100, 40);
        label.setLocation(100,20);
        add(label);
    }

}
