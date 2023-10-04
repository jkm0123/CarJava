package com.example.helloworld;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println(area(24.7f));
        HondaCity mycar=new HondaCity();
        mycar.vehicleRegistration("Krishna Mohan", "EQ12-2343-ERTMU", "B345-XER231-UTRUSA","City 4","TS09WE1925",2023);
        mycar.colorChange("Dark gray");
        mycar.carDetails();
    }
    private static float area(float radius){
        float area;
        area =  (22/7) * radius * radius;

        return area;}
}
