/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

/**
 *
 * @author kunszekely.bence
 */
public class View {
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
