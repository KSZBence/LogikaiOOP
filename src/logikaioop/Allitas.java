/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logikaioop;

/**
 *
 * @author kunszekely.bence
 */
public class Allitas {
    public int hanyadik;

    public Allitas(int hanyadik) {
        this.hanyadik = hanyadik;
    }

    public int getHanyadik() {
        return hanyadik;
    }

    @Override
    public String toString() {
        return "Az "+hanyadik+". állítás!";
    }
    
    
    
}
