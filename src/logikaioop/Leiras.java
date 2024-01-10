/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logikaioop;
import java.util.Scanner;

public class Leiras {

    public static Scanner sc = new Scanner(System.in);
    Lada[] ladak = new Lada[3];
    
    public Leiras() {
        Lada l1 = new Lada("Az 1. állitas", "anyag", false);
        Lada l2 = new Lada("Az 2. állitas", "anyag", false);
        Lada l3 = new Lada("Az 3. állitas", "anyag", true);
        ladak[0] = l1;
        ladak[1] = l2;
        ladak[2] = l3;
        
        kiir("Leírás");
        kiir(l1.toString());
        kiir(l2.toString());
        kiir(l3.toString());
        
        System.out.print("Melyik:");
        int valasztott = sc.nextInt();
        kiir("");
        kiir(new Leiras().eredmenyjelzes(valasztott));
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
