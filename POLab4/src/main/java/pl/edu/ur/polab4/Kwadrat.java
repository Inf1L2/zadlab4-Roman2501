/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4;

/**
 *
 *
 */
public class Kwadrat {
   
    float x;
    float o1;
    float p1;

    public Kwadrat(float x) {this.x = x;}
       public void o1(){this.o1 =  this.x* this.x;}
        public void p1() {this.p1 = 4* this.x;}
  
     public void kwadrat()
   {
        this.p1();
        this.o1();
        System.out.println("Kwadrat");
        System.out.println("Pole wynosi = " + this.p1 );
        System.out.println("Obwód wynosi = " + this.o1 );
   }
 
}
 
    

