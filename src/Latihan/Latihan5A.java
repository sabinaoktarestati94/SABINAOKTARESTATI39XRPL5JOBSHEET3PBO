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
public class Latihan5A {
   
    //the Truck class has three fields
    public int cadence;
    public int gear;
    public int speed;
    //the Truck class has one constructor
    public Latihan5A (int startCadence, int startSpeed, int startGear)
    {
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;
    }//the truck class has four mehtods
    public void setCadence (int newValue)
    {
        cadence = newValue;
    }
    public void setGear (int newValue)
    {
        gear = newValue;
    }
    public void applybrake (int decrement)
    {
        speed = decrement;
    }
    public void speedUp(int increment)
    {
        speed = increment;
    }
    }
