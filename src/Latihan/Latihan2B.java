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
public class Latihan2B extends Latihan2A{
    
    private String noKaryawan;
    //konstruktor
    public Latihan2B (String noKaryawan, String nama , int usia)
    {
        super(nama, usia);
        this.noKaryawan = noKaryawan;
    }
    //metode
    public void info()
    {
        System.out.println("No. Karyawan: "+ this.noKaryawan);
        super.info();
    }
}//akhir kelas Latihan2B
