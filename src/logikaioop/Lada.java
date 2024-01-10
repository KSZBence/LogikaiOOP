/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logikaioop;

/**
 *

 * @author kunszekely.bence
 */



public class Lada {

    private String allitas, anyag;
    private boolean kincs;

    public Lada(String allitas, String anyag, boolean kincs) {
        this.allitas = allitas;
        this.anyag = anyag;
        this.kincs = kincs;

    }

    public String getAllitas() {
        return allitas;
    }

    public void setAllitas(String allitas) {
        this.allitas = allitas;
    }

    public String getAnyag() {
        return anyag;
    }

    public void setAnyag(String anyag) {
        this.anyag = anyag;
    }

    public boolean isKincs() {
        return kincs;
    }

    public void setKincs(boolean kincs) {
        this.kincs = kincs;
    }

    @Override
    public String toString() {
        return anyag + " láda: " +allitas;
    }
}