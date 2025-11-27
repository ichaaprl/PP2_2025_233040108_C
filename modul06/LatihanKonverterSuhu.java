/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.unpas.pp2_c_233040108.modul06;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author ASUS
 */
public class LatihanKonverterSuhu {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Konverter Suhu");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new GridLayout(5, 2, 5, 5));

        JLabel labelCelcius = new JLabel("Celcius:");
        JTextField inputCelcius = new JTextField(10);
        JButton buttonKonversi = new JButton("Konversi");
        JLabel labelFahrenheit = new JLabel("Fahrenheit:");
        JLabel hasilFahrenheit = new JLabel("-");

        buttonKonversi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String inputTeks = inputCelcius.getText();
                    double celcius = Double.parseDouble(inputTeks);

                    double fahrenheit = (celcius * 9 / 5) + 32;

                    hasilFahrenheit.setText(String.format("%.2f", fahrenheit) + " F");

                } catch (NumberFormatException ex) {
                    hasilFahrenheit.setText("Inputan ERROR!");
                }
            }
        });

        frame.add(labelCelcius);
        frame.add(inputCelcius);
        frame.add(new JLabel(""));
        frame.add(buttonKonversi);
        frame.add(labelFahrenheit);
        frame.add(hasilFahrenheit);

        frame.setVisible(true);
    }
}
