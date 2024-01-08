/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logikaioop;

import java.util.Scanner;

/**
 *
 * @author szendefi.k.daniel
 */
public class Leiras {

    public static Scanner sc = new Scanner(System.in);

    public Leiras() {
        System.out.print("Melyik:");
        int s = sc.nextInt();
        System.out.println("");
        System.out.println(new Leiras().eredmenyjelzes(true));
        System.out.println(new Leiras().eredmenyjelzes(false));
    }

    public String eredmenyjelzes(boolean igaz) {
        if (igaz) {
            return "A válasz jó!";
        } else {
            return "A válasz rossz!";
        }
    }
}
