package com.example.helloworld;

public class FourWheeler {
    String color;
    int maxSpeed;
    int engineVolume;
    int seats;
    double price;
   public FourWheeler()
    {
        maxSpeed=140;
        engineVolume=1000;
        seats=5;
        price=1500456.00D;
        color="red";

    }
    public boolean colorChange(String newColor)
    {
        if(!color.equals(newColor))
        {
            color=newColor;
            return true;
        }
        else
        {
            return false;
        }

    }
    public boolean changeInPrice(Double newPrice)
    {
        if (price!=newPrice)
        {
            price=newPrice;
            return true;

        }
        else {

            return false;
        }

    }
}
