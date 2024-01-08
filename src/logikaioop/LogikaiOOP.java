/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package logikaioop;

/**
 *
 * @author szendefi.k.daniel
 */
public class LogikaiOOP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Leírás");
        Allitas a1 = new Allitas(1);
        System.out.println(a1.toString());
        Allitas a2 = new Allitas(2);
        System.out.println(a2.toString());
        Allitas a3 = new Allitas(3);
        System.out.println(a3.toString());
        
        System.out.println("Melyik:");
        System.out.println("A válasz jó | rossz");
        
    }
    
}
