package com.company;

public class Ship  extends  Vehicle{
    private  int paseg;
    private  int teel;

    public int getPaseg() {
        return paseg;
    }

    public void setPaseg(int paseg) {
        this.paseg = paseg;
    }

    public int getTeel() {
        return teel;
    }

    public void setTeel(int teel) {
        this.teel = teel;
    }
    Ship(){
        super(2000000, 150, 1999);
        System.out.println( " Цена: " + price + " долара");
        System.out.println( "Скорость: " + spr + " к/ч");
        System.out.println(  "Год выпуска:  " + year);
    }
}
