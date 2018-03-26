package pl.edu.ur.polab4;

import java.util.Scanner;

public class Main {

   
    public static void main(String[] args) {
        // TODO zad 4, 5
          int wybor;
        int bokkwadratu,bokpr1,bokpr2,promkoła,promkuli,promstożka,hstożka,boksz,bokprost1 ,bokprost2 ;
        
    Scanner odczyt = new Scanner(System.in);
    System.out.println("Wubierz figure");
     System.out.println("1.kolo");
    System.out.println("2.kwadrat");
    System.out.println("3.prostokat");
    System.out.println("4.kula");
    System.out.println("5.stożek");
    System.out.println("6.szescian");
    System.out.println("7.prostopadłościan");
    wybor = odczyt.nextInt();
    
    switch(wybor){
            case 1:
                System.out.println("Podaj promień koła(r)");
                promkoła=odczyt.nextInt();
                Kolo kolo1 = new Kolo(promkoła);
                kolo1.kolo();
                break;
                
            case 2:
            System.out.println("Podaj bok kwadratu");
            bokkwadratu = odczyt.nextInt();  
            Kwadrat Kwadrat1 = new Kwadrat(bokkwadratu);
            Kwadrat1.kwadrat();
            break;
            
            case 3:
                System.out.println("Podaj 1 bok prostokąta");
                bokpr1=odczyt.nextInt();
                System.out.println("Podaj 2 bok prostokąta");
                bokpr2=odczyt.nextInt();
                Prostokąt prostokat1 = new  Prostokąt ( bokpr1,bokpr2);
                prostokat1.prostokąt();
                break;
            
             case 4:
                System.out.println("Podaj 1 bok prostopadłościanu : ");
                bokprost1=odczyt.nextInt();
                System.out.println("Podaj 2 bok prostopadłościanu : ");
                bokprost2=odczyt.nextInt();
                Prostopadłoscian prost = new Prostopadłoscian(bokprost1,bokprost2);
                prost.prostopadłoscian();
                break;
                           
            case 5:
                System.out.println("Podaj promień kuli(r)");
                promkuli=odczyt.nextInt();
                Kula Kula1 = new Kula(promkuli);
                Kula1.kula();
                break;
                
            case 6:
                System.out.println("Podaj promień podstawy stożka)");
                promstożka=odczyt.nextInt();
                System.out.println("Podaj promień podstawy stożka)");
                hstożka=odczyt.nextInt();
                Stożek Stozek1 = new Stożek(promstożka,hstożka);
                Stozek1.stożek();
                break;
                
            case 7:
                System.out.println("Podaj bok szesciany)");
                boksz=odczyt.nextInt();
                Sześcian Szescian1 = new Sześcian(boksz);
                Szescian1.sześcian();
                break;
                
             
           
        }  
    }
}