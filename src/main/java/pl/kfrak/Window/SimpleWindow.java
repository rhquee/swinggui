package pl.kfrak.Window;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by RENT on 2017-04-28.
 */
public class SimpleWindow {
    public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setVisible(true);
        window.setSize(600, 400);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        window.setLayout(new FlowLayout());


        //dodanie przycisku do okna
        JButton button = new JButton("Kliknij mnie");
        window.add(button);

        //dodanie testfielda
        final JTextField textField = new JTextField();
        //dimension to taka klasa, ktora ma w i sz
        textField.setPreferredSize(new Dimension(200, 50));
        window.add(textField);


        button.addActionListener(new ButtonAction());

        button.addActionListener(new ActionListener() {
            //klasa anonimowa:
            public void actionPerformed(ActionEvent e) {
                String text = textField.getText();
                System.out.println(text);
//                System.out.println(textField);
                textField.setText("setText w textFieldzie");
                System.out.println("Anonimowa klasa");
            }
        });

    }
}
