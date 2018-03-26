/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4;

/**
 *

 */
public class Kolo {
   
       float p ;
       float k;
       float u;

    public Kolo(float p) { this.p = p;}
       public void  k(){this.k = (float) (2*3.14f*this.r);}
        public void  u() {this.u = (float) (3.14f*(this.r*this.r)); }

   
   public void kolo()
   {
        this.k();
        this.u();
        System.out.println("Koło");
        System.out.println("Pole wynosi = " + this.k );
        System.out.println("Obwód wynosi = " + this.u );
   }
   
   
    
}
       
  
    

