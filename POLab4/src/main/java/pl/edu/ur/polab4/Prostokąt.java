/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4;

/**
 *

 */
public class Prostokąt {
     int a1;
     int b1;
     int o2;
     int p2;

    public Prostokąt(int a1, int b1) {
        this.a1 = a1;
        this.b1 = b1;
    }
   
    public void o2(){    this.o2 = (2*this.a1)+(2*this.b1);}
    public void p2(){    this.p2 =this.a1*this.b1;}
   
    
      public void prostokąt(){
        this.p2();
        this.o2();
        System.out.println("Prostokąt");
        System.out.println("Pole wynosi = " + this.p2 );
        System.out.println("Obwód wynosi = " + this.o2 );
    }
  
    
}
