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
public class Latihan3B extends Latihan3A{
   
    public static void testClassMethod()
    {
        System.out.println("The class method in Hewan...");
    }
    //meng-override method pada class Animal
    public void testInstanceMethod()
    {
        System.out.println("The instance method in Gajah...");
    }
    public static void main(String[] args)
    {
        Latihan3B myGajah = new Latihan3B();
        Latihan3A myHewan = myGajah;
        Latihan3A.testClassMethod();
        myHewan.testInstanceMethod();
    }
}
