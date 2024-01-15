/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logikaioop;
import model.Lada;
import java.util.Scanner;

public class Leiras {

    public static Scanner sc = new Scanner(System.in);
    Lada[] ladak = new Lada[3];
    
    public Leiras() {
        Lada l1 = new Lada("Én rejtettem el a kincset!", "Arany", false);
        Lada l2 = new Lada("Nem én rejtettem el a kincset!", "Ezüst", true);
        Lada l3 = new Lada("Az arany hazudik!", "Bronz", false);
        ladak[0] = l1;
        ladak[1] = l2;
        ladak[2] = l3;

        kiir("Leírás: minden láda 1-1 állítást tartalmaz, csak az egyik igaz.");
        kiir(l1.toString());
        kiir(l2.toString());
        kiir(l3.toString());
        

        System.out.print("Melyikben van a kincs? ");

        int valasztott = sc.nextInt();
        kiir("");
        kiir(eredmenyjelzes(valasztott));
    }

}
