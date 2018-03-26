/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4;

/**
 *

 */
public class Kula {
    
    float k4;
    float d4;
    float t4;

    public Kula(float k1) { this.k4 = k4;}
        public void d4(){  this.d4 = 4*3.14f*this.k4;}
        public void p4() { this.t4 = 4/3*3.14f*(this.d4*this.d4*this.d4);}
    

    Kula(int promkuli) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
     public void kula(){
         this.p4();
        this.o4();
        System.out.println("Kula");
        System.out.println("Pole wynosi = " + this.p4 );
        System.out.println("Obwód wynosi  = " + this.d4 );
    }
  
}
