package pl.kfrak.Car;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.*;
import java.util.List;

/**
 * Created by RENT on 2017-04-28.
 */

public class CarWindow extends JFrame {

    private CarRepository carRepository;
    private JList<Car> carsJList;

    public CarWindow() {
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLayout(null);

        carRepository = new CarRepository();

        carsJList = new JList<>();
        carsJList.setSize(200, 300);
        carsJList.setLocation(0, 0);
        add(carsJList);

        // WYSWIETLANIE KOMUNIKATU BŁĘDU
        JOptionPane.showMessageDialog(carsJList, "ZŁE DANE", "BŁĄD", JOptionPane.ERROR_MESSAGE);

        updateCarsListData();

        JButton btnShow = new JButton("Pokaż");
        btnShow.setSize(200, 50);
        btnShow.setLocation(0, 350);
        add(btnShow);

        JLabel lblBrand = new JLabel("Brand");
        lblBrand.setSize(200, 50);
        lblBrand.setLocation(300, 0);
        add(lblBrand);

        JTextField txtBrand = new JTextField();
        txtBrand.setSize(200, 50);
        txtBrand.setLocation(300, 50);
        add(txtBrand);

        JLabel lblModel = new JLabel("Model");
        lblModel.setSize(200, 50);
        lblModel.setLocation(300, 100);
        add(lblModel);

        JTextField txtModel = new JTextField();
        txtModel.setSize(200, 50);
        txtModel.setLocation(300, 150);
        add(txtModel);

        JLabel lblYear = new JLabel("Manufacture year");
        lblYear.setSize(200, 50);
        lblYear.setLocation(300, 200);
        add(lblYear);

        JTextField txtYear = new JTextField();
        txtYear.setSize(200, 50);
        txtYear.setLocation(300, 250);
        add(txtYear);

        JLabel lblPower = new JLabel("Power");
        lblPower.setSize(200, 50);
        lblPower.setLocation(300, 300);
        add(lblPower);

        JTextField txtPower = new JTextField();
        txtPower.setSize(200, 50);
        txtPower.setLocation(300, 350);
        add(txtPower);

        JButton btnCreateCar = new JButton("Stwórz nowy");
        btnCreateCar.setSize(200,50);
        btnCreateCar.setLocation(400,400);
        add(btnCreateCar);

        JButton btnSaveChanges = new JButton("Zapisz zmiany");
        btnSaveChanges.setSize(200,50);
        btnSaveChanges.setLocation(400,500);
        add(btnSaveChanges);

        btnSaveChanges.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String model = txtModel.getText();
                String brand = txtBrand.getText();
                String year = txtYear.getText();
                double power = Double.parseDouble(txtPower.getText());

                Car selectedCar = carsJList.getSelectedValue();
                selectedCar.setBrand(brand);
                selectedCar.setModel(model);
                selectedCar.setManufactureYear(year);
                selectedCar.setPower(power);

                carsJList.repaint();
                // lub
                updateCarsListData();



            }
        });

        btnCreateCar.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String model = txtModel.getText();
                String brand = txtBrand.getText();
                String year = txtYear.getText();
                double power = Double.parseDouble(txtPower.getText());

                Car car = new Car(brand, model, year, power);

                carRepository.getCars().add(car);
                updateCarsListData();
            }
        });

        btnShow.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Car selectedCar = carsJList.getSelectedValue();
                System.out.println(selectedCar);

                if (selectedCar != null) {
                    String model = selectedCar.getModel();
                    txtModel.setText(model);

                    txtBrand.setText(selectedCar.getBrand());
                    txtModel.setText(selectedCar.getModel());
                    txtYear.setText(selectedCar.getManufactureYear());

                    txtPower.setText("" + selectedCar.getPower());
                    txtPower.setText(Double.toString(selectedCar.getPower()));
                }

                // Wyświetlenie okna dialogowego
//				JOptionPane.showMessageDialog(btnShow, selectedCar);
            }
        });

        repaint();
    }

    private void updateCarsListData() {
        List<Car> carsFromRepository = carRepository.getCars();

        Car[] carsArray = new Car[carsFromRepository.size()];
        for (int i = 0; i < carsArray.length; i++) {
            carsArray[i] = carsFromRepository.get(i);
        }

        carsJList.setListData(carsArray);
    }

    public static void main(String[] args) {
        new CarWindow();
    }
}
