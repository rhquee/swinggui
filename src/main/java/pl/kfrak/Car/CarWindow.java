package pl.kfrak.Car;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.util.List;

/**
 * Created by RENT on 2017-04-28.
 */
public class CarWindow extends JFrame {

    private CarRepository carRepository;

    public static void main(String[] args) {
        new CarWindow();
    }

    public CarWindow(){
        setVisible(true);
        setSize(new Dimension(800, 600));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(null);

        carRepository = new CarRepository();

        List<Car> cars = carRepository.getCars();
        //zamienic liste na tablice i wyswietlam tablice w tym ponizej

        String[] data = new String[]{"A", "B", "C"};
        JList<String> jList = new JList<String>();
        jList.setSize(200, 300);
        jList.setLocation(0, 0);
        add(jList);
    }
}
