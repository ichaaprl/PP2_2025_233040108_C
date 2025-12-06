/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.unpas.pp2_c_233040108.modul08.model;

/**
 *
 * @author ASUS
 */
public class PersegiPanjangModel {
    
    private double panjang;
    private double lebar;
    private double luas;
    private double keliling; //Modifikasi tambah variabel keliling
    
    // Menghitung luas (Logika Bisnis)
    public void hitungLuas() {
        this.luas = this.panjang * this.lebar;
    }
    
    // Modifikasi Metode untuk menghitung keliling
    public void hitungKeliling() {
        this.keliling = 2 * (this.panjang + this.lebar);
    }
    
    // Getters dan Setters
    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }
    
    public void setLebar(double lebar) {
        this.lebar = lebar;
    }
    
    public double getLuas() {
        return luas;
    }
    
    // Modifikasi Metode untuk mengambil nilai keliling
    public double getKeliling() {
        return keliling;
    }
}