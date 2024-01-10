/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logikaioop;
import java.util.Scanner;

public class Leiras {

    public static Scanner sc = new Scanner(System.in);
    
    public Leiras() {
        Lada l1 = new Lada("Én rejtettem el a kincset!", "Arany", false);
        Lada l2 = new Lada("Nem én rejtettem el a kincset!", "Ezüst", true);
        Lada l3 = new Lada("Az arany hazudik!", "Bronz", false);
        
        kiir("Leírás: minden láda 1-1 állítást tartalmaz, csak az egyik igaz.");
        kiir(l1.toString());
        kiir(l2.toString());
        kiir(l3.toString());
        
        System.out.print("Melyikben van a kincs?");
        int s = sc.nextInt();
        kiir("");
        kiir(new Leiras().eredmenyjelzes(true));
        kiir(new Leiras().eredmenyjelzes(false));
    }
    
    public void kiir(String szoveg){
        System.out.println(szoveg);
    }
    
    public String eredmenyjelzes(boolean igaz) {
        if (igaz) {
            return "A válasz jó!";
        } else {
            return "A válasz rossz!";
        }
    }
}
