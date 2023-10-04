package com.example.helloworld;

public class HondaCity extends FourWheeler{
    String carOwner;
    int yearofManufacture;
    String engineNo;
    String chassisNumber;
    String carModel;
    String registrationNo;
    public HondaCity()
    {
        carOwner="No name";
        engineNo="N/A";
        chassisNumber="No";
        carModel="N/A";
        registrationNo="Not yet registered";
    }
    public boolean vehicleRegistration(String owner, String engineN, String ChassisNo, String model, String regNo, int year)
    {
        carOwner=owner;
        engineNo=engineN;
        chassisNumber=ChassisNo;
        carModel=model;
        registrationNo=regNo;
        yearofManufacture=year;
        return true;
    }
    public void carDetails()
    {
        System.out.println("==========================================");
        System.out.println("Owner of the Car: "+carOwner);
        System.out.println("Car Engine Number : "+engineNo);
        System.out.println("Car Chassis Number : "+chassisNumber);
        System.out.println("Car Model : "+carModel);
        System.out.println("Car Registration No : "+registrationNo);
        System.out.println("Manufacturing year of the Car: "+yearofManufacture);
        System.out.println("Maximum speed of the Car: "+maxSpeed);
        System.out.println("Engine volume of the Car :"+ engineVolume);
        System.out.println("Seat capacity of the Car :"+ seats);
        System.out.println("Maximum speed of the Car :"+ price);
        System.out.println("Color of the Car :"+ color);
        System.out.println("==========================================");
    }

}
