/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package logikaioop;

import java.util.Scanner;

/**
 *
 * @author szendefi.k.daniel
 */
public class LogikaiOOP {
    public static Scanner sc = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Leírás");
        Lada a1 = new Lada(1);
        System.out.println(a1.toString());
        Lada a2 = new Lada(2);
        System.out.println(a2.toString());
        Lada a3 = new Lada(3);
        System.out.println(a3.toString());
        
        System.out.println("Melyik:");
        int melyik = sc.nextInt();
        System.out.println("");
        System.out.println("A válasz jó | rossz");

    }

}
