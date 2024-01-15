/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import model.Lada;
import view.View;

public class Leiras {

    
    Lada[] ladak = new Lada[3];
    
    public Leiras() {
        Lada l1 = new Lada("Én rejtettem el a kincset!", "Arany", false);
        Lada l2 = new Lada("Nem én rejtettem el a kincset!", "Ezüst", true);
        Lada l3 = new Lada("Az arany hazudik!", "Bronz", false);
        ladak[0] = l1;
        ladak[1] = l2;
        ladak[2] = l3;

        View v = new View(ladak);
        v.osszeallit();
        v.eldontes();

    }

}
