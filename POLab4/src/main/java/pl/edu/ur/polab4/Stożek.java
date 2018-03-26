/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4;

/**

 */
public class Stożek {
    float l5;
    float r5;
    float h5;

    public Stożek(float l5, float r5) {
        this.l5 = l5;
        this.r5 = r5;
    }
    float pp5;
    float pb5;
    float pc5;
    float o5;

    
      public void pp5(){  this.pp5 = 3.14f*(this.r5*this.r5);}
      public void pb5() {  this.pb5 = 3.14f*this.l5*this.r5 ;}
      public void pc5() {  this.pc5 = this.pp5+ this.pb5;}
      public void o5()  {this.o5 = 1/3*3.14f*(this.r5*this.r5)+ this.h5 ;}
    

   
   public void stożek(){
        this.pp5();
         this.pb5();
         this.pc5();
         this.o5();
        System.out.println("Stożek");
        System.out.println("Pole wynosi = " + this.pp5 );
         System.out.println("Pole podstawy wynosi = " + this.pb5 );
          System.out.println("Pole powirzchni bocznej wynosi = " + this.pc5 );
        System.out.println("Obwód wynosi = " + this.o5 );
    }
}
