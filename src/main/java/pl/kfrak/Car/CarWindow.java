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

        public CarWindow() {
            setVisible(true);
            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            setSize(600, 400);
            setLayout(null);

            carRepository = new CarRepository();

            List<Car> cars = carRepository.getCars();
            //zamienic liste na tablice i wyswietlam tablice w tym ponizej
            //ponizej tworze tablice o takim samym rozmiarze jak cars[]
            Car[] carsArray = new Car[cars.size()];
            //zamiana listy n atablice
            for (int i = 0; i < carsArray.length; i++) {
                carsArray[i] = cars.get(i);
            }


            String[] data = new String[]{"A", "B", "C"};
            JList<String> jList = new JList<>(data);
            jList.setSize(200, 300);
            jList.setLocation(0, 0);
            add(jList);

        }

        public static void main(String[] args) {
            new CarWindow();
        }
    }
