/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.unpas.pp2_c_233040108.modul10.tugas.view;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

/**
 *
 * @author ASUS
 */
public class MahasiswaAppView extends JFrame {

    public JTextField txtNama, txtNIM, txtJurusan, txtSearch;
    public JButton btnSimpan, btnEdit, btnHapus, btnClear, btnSearch;
    public JTable tableMahasiswa;
    public DefaultTableModel model;

    public MahasiswaAppView() {
        setTitle("Aplikasi CRUD Mahasiswa JDBC");
        setSize(600, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        JPanel panelForm = new JPanel(new GridLayout(4, 2, 10, 10));
        panelForm.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        panelForm.add(new JLabel("Nama: "));
        txtNama = new JTextField();
        panelForm.add(txtNama);

        panelForm.add(new JLabel("NIM: "));
        txtNIM = new JTextField();
        panelForm.add(txtNIM);

        panelForm.add(new JLabel("Jurusan: "));
        txtJurusan = new JTextField();
        panelForm.add(txtJurusan);

        panelForm.add(new JLabel("Cari Nama: "));
        txtSearch = new JTextField(10);
        panelForm.add(txtSearch);

        JPanel panelTombol = new JPanel(new FlowLayout());
        btnSimpan = new JButton("Simpan");
        btnEdit = new JButton("Edit");
        btnHapus = new JButton("Hapus");
        btnClear = new JButton("Clear");
        btnSearch = new JButton("Search");

        panelTombol.add(btnSimpan);
        panelTombol.add(btnEdit);
        panelTombol.add(btnHapus);
        panelTombol.add(btnClear);
        panelTombol.add(btnSearch);

        JPanel panelAtas = new JPanel(new BorderLayout());
        panelAtas.add(panelForm, BorderLayout.CENTER);
        panelAtas.add(panelTombol, BorderLayout.SOUTH);
        add(panelAtas, BorderLayout.NORTH);

        model = new DefaultTableModel();
        model.addColumn("No");
        model.addColumn("Nama");
        model.addColumn("NIM");
        model.addColumn("Jurusan");

        tableMahasiswa = new JTable(model);
        add(new JScrollPane(tableMahasiswa), BorderLayout.CENTER);
    }
}