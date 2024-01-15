/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;
import java.util.Scanner;
import model.Lada;

/**
 *
 * @author kunszekely.bence
 */
public class View {
    public static Scanner sc = new Scanner(System.in);    
    Lada[] ladak;
    
    public View(Lada[] ladak) {
        this.ladak = ladak;
    }

    public void eldontes() {
        System.out.print("Melyikben van a kincs? ");
        int valasztott = sc.nextInt();
        kiir("");
        kiir(eredmenyjelzes(valasztott));
    }

    public void osszeallit() {
        kiir("Leírás: minden láda 1-1 állítást tartalmaz, csak az egyik igaz.");
        for (Lada lada : this.ladak) {
            kiir(lada.toString());
        }
    }
        
        
    public void kiir(String szoveg){
        System.out.println(szoveg);
    }
    
    public String eredmenyjelzes(int valasztott) {
        if (ladak[valasztott-1].isKincs()) {
            return "A válasz jó!";
        } else {
            return "A válasz rossz!";
        }
    }
}
