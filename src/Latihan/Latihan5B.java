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
public class Latihan5B extends Latihan5A{
   
    //the Latihan5B subclass adds one field
    public int seatHeight;
    //the Latihan5B subclass has one contuctor
    public Latihan5B (int startHeight, int startCadence, int startSpeed, int startGear)
    {
      super (startCadence, startSpeed, startGear);
      seatHeight = startHeight;
    }
    // the latihan5b subclass adds one method
    public void setHeight (int newValue)
    {
        seatHeight = newValue;
    }
    public static void main (String[] aku)
    {
        System.out.println("Mulai Berjalan");
        Latihan5B MB = new Latihan5B(0,0,0,0);
        System.out.println("gear="+ MB.gear);
        System.out.println("speed="+ MB.speed);
        MB.setGear(2);
        MB.speedUp(2);
        System.out.println("gear="+ MB.gear);
        System.out.println("speed="+ MB.speed);
        MB.speedUp(2);
        System.out.println("gear="+ MB.gear);
        System.out.println("speed="+ MB.speed);
        
    }
}
