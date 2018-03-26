/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4;

/**
 *

 */
public class Prostopadłoscian {
    
    float a3;
    float b3;
    float h3;
    float o3;
    float p3;

    public Prostopadłoscian(float a3, float b3, float h3) {
        this.a3 = a3;
        this.b3 = b3;
        this.h3 = h3;}

    Prostopadłoscian(int bokprost1, int bokprost2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        public void o3(){ this.o3 =  this.a3* this.b3* this.h3;}
        public void p3(){ this.p3 = 2*this.a3*this.b3+2*this.a3*this.h3+2*this.b3*this.h3;}
    
    
     public void prostopadłoscian(){
        this.p3();
        this.o3();
        System.out.println("Prostopadłościan");
        System.out.println("Pole wynosi = " + this.p3 );
        System.out.println("Obwód wynosi = " + this.o3 );
    }
  
   
}
