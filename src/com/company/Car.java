package com.company;

public class Car extends  Vehicle{
    private  String model;
    private String  color;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    Car(){
        super(32000, 320, 2001);
        System.out.println( " Цена: " + price + " долара");
        System.out.println( "Скорость: " + spr + " к/ч");
        System.out.println(  "Год выпуска:  " + year);
    }
}
