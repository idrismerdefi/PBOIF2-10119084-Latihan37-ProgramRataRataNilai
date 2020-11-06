/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119084.latihan37.programrataratanilai;
/**
 * @author  
 * Nama  : Muhammad Idris Merdefi
 * Kelas : PBOIF2
 * NIM   : 10119084
 * Deskripsi Program : Program ini berisi program Rata-Rata nilai
 **/
public class Mahasiswa {
        private double nilai = 0;
    private int jmlMahasiswa;

    public void setNilai(double nilai) {
        this.nilai = this.nilai + nilai;
    }

    public int getJmlMahasiswa() {
        return jmlMahasiswa;
    }

    public void setJmlMahasiswa(int jmlMahasiswa) {
        this.jmlMahasiswa = jmlMahasiswa;
    }
    
    public double hitungRataRata() {
        return nilai / jmlMahasiswa;
    }
}
