/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logikaioop;
import java.util.Scanner;

public class Leiras {

    public static Scanner sc = new Scanner(System.in);
    
    public Leiras() {
        Lada l1 = new Lada("Az 1. állitas", "anyag", false);
        Lada l2 = new Lada("Az 2. állitas", "anyag", false);
        Lada l3 = new Lada("Az 3. állitas", "anyag", true);
        
        kiir("Leírás");
        kiir(l1.toString());
        kiir(l2.toString());
        kiir(l3.toString());
        
        System.out.print("Melyik:");
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
