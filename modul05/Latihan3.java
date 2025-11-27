/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.unpas.pp2_c_233040108.modul05;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author ASUS
 */
public class Latihan3 {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame("Contoh BorderLayout");
                frame.setSize(400, 300);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                // 1. Buat komponen JLabel
                // FlowLayout akan menyusun komponen dari kiri ke kanan
                frame.setLayout(new FlowLayout());

                // 2. Buatkan komponen GUI
                // Secara default, JFrame menggunakan BorderLayout
                // dan .add() akan menambahkannya ke bagian tengah (CENTER)
                JLabel label = new JLabel("Teks Awal");
                JButton button = new JButton("Klik Saya!");

                /*
                    3. Tambahkan Aksi (ActionListener) ke tombol
                    Penambahan ini menggunakan lambda untuk mempersingkat
                    penggunaan anonymous inner class
                 */
                button.addActionListener(e -> {
                    // Aksi ini akan mngubah teks pada label
                    label.setText("Tombol berhasil diklik!");
                });

                /*
                    4. Tambahkan komponen ke frame
                    karena kita menggunakan flowLayout,
                    keduanya akan tampil berdampingan
                 */
                frame.add(label);
                frame.add(button);

                frame.setVisible(true);
            }
        });
    }
}
