/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.unpas.pp2_c_233040108.modul08.view;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author ASUS
 */
public class PersegiPanjangView extends JFrame {
    
    // Komponen UI sebagai atribut
    private JTextField txtPanjang = new JTextField(10);
    private JTextField txtLebar = new JTextField(10);
    private JLabel lblHasilLuas = new JLabel("-");      
    private JLabel lblHasilKeliling = new JLabel("-");  // BARU: Label Keliling
    private JButton btnHitung = new JButton("Hitung"); 
    private JButton btnReset = new JButton("Reset");    // BARU: Tombol Reset
    
    public PersegiPanjangView() {
        //Inisialisasi UI
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 200);
        this.setLayout(new GridLayout(6, 2, 10, 10)); // Grid 4 baris
        this.setTitle("MVC Kalkulator");
        
        
        this.add(new JLabel("Panjang:"));
        this.add(txtPanjang); 
        this.add(new JLabel("Lebar:"));
        this.add(txtLebar); 
        this.add(new JLabel("Hasil Luas:"));
        this.add(lblHasilLuas); 
        this.add(new JLabel("Hasil Keliling:"));
        this.add(lblHasilKeliling);


        
        this.add(btnHitung); // Tombol Hitung
        this.add(btnReset);  // Tombol Reset
    }
    // Mengambil nilai panjang dari Textfield
    public double getPanjang() {
        return Double.parseDouble(txtPanjang.getText());
    }
    
    // Mengambil nilai lebar dari Textfield
    public double getLebar() {
        return Double.parseDouble(txtLebar.getText());
    }
    
    // Menampilkan hasil ke Label
    public void setHasilLuas(double hasil) {
        lblHasilLuas.setText(String.valueOf(hasil));
    }
    
    // Modifikasi Method untuk menampilkan hasil keliling
    public void setHasilKeliling(double hasil) {
        lblHasilKeliling.setText(String.valueOf(hasil));
    }
    
    // Modifikasi Method untuk mereset input dan hasil
    public void reset() {
        txtPanjang.setText("");
        txtLebar.setText("");
        lblHasilLuas.setText("-");
        lblHasilKeliling.setText("-");
    }
    
    // Menampilkan pesan error (jika input bukan angka)
    public void tampilkanPesanError(String pesan) {
        JOptionPane.showMessageDialog(this, pesan);
    }
    
    // Mendaftarkan Listener untuk tombol (Controller yang akan memberikan aksinya)
    public void addHitungListener(ActionListener listener) {
        btnHitung.addActionListener(listener);
    }
    
    // Modifikasi Mendaftarkan Listener untuk tombol RESET
    public void addResetListener(ActionListener listener) {
        btnReset.addActionListener(listener);
    }
}