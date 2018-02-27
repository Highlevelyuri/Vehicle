package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println( "Самолет");
	Plane plane = new Plane();

	plane.setPasager(670);
	plane.setHigh(5000);
        System.out.println( " Пассажировместимость: "+plane.getPasager());
        System.out.println( " Высота полета: " + plane.getHigh()+ " метра");
        System.out.println();
        System.out.println(" Машина");
    Car car =new Car() ;

    car.setModel(" Nisan");
    car.setColor(" Red");
        System.out.println("Модель: "+ car.getModel());
        System.out.println(" Цвет: " +car.getColor() );
        System.out.println();
        System.out.println("Корабль");
        Ship ship = new Ship();
        ship.setTeel(560);
        ship.setPaseg(3400);
        System.out.println("Длинна: "+ ship.getTeel()+ " метра");
        System.out.println(" Пассажировместимость: "+ ship.getPaseg());



    }
}
