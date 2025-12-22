/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.unpas.pp2_c_233040108.modul10.tugas;
import id.ac.unpas.pp2_c_233040108.modul10.Tugas.Controller.MahasiswaAppController;
import id.ac.unpas.pp2_c_233040108.modul10.Tugas.Model.MahasiswaAppModel;
import id.ac.unpas.pp2_c_233040108.modul10.tugas.view.MahasiswaAppView;

import javax.swing.SwingUtilities;
/**
 *
 * @author ASUS
 */
public class main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MahasiswaAppView view = new MahasiswaAppView();
            MahasiswaAppModel model = new MahasiswaAppModel();
            new MahasiswaAppController(view, model);
            view.setVisible(true);
        });
    }
}