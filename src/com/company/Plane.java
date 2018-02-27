package com.company;

 class Plane extends Vehicle {
      private int high;
      private int pasager;

     public int getHigh() {
         return high;
     }

     public void setHigh(int high) {
         this.high = high;
     }

     public int getPasager() {
         return pasager;
     }

     public void setPasager(int pasager) {
         this.pasager = pasager;
     }

     Plane (){
        super(30000000, 1200, 2012 );

         System.out.println( " Цена: " + price + " долара");
         System.out.println( "Скорость: " + spr + " к/ч");
         System.out.println(  "Год выпуска:  " + year);

    }
}
