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
public class TugasPraktikum1B extends TugasPraktikum1A{
    private String wasis;
    
    public TugasPraktikum1B(String namaSiswa, String kelas, String wasis){
        super(kelas, namaSiswa);
        this.wasis = wasis;
    }
    public void data(){
        System.out.println("Wali Siswa: "+this.wasis);
        super.data();
    }
}
