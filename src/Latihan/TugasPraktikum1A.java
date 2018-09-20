/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

/**
 *
 * @author Asus
 */
public class TugasPraktikum1A {
    private String namaSiswa;
    private String kelas;
    
    public TugasPraktikum1A(String namaSiswa, String kelas){
        this.kelas = kelas;
        this.namaSiswa = namaSiswa;
    }
    public void data (){
        System.out.println("Nama Siswa: "+this.namaSiswa);
        System.out.println("Kelas: "+this.kelas);
    }
}
