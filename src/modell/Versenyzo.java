/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modell;

import java.nio.file.Files;
import java.nio.file.Path;



public class Versenyzo {
    
    private String nev;
    private String email;
    private double pontszam;
    private int mez;

    public Versenyzo(String nev, String email, double pontszam, int mez) {
        this.setNev(nev);
        this.setEmail(email);
        this.setPontszam(pontszam);
        this.setMez(mez);
    }
    
    public Versenyzo(String sor) {
        String[] adatok = sor.split(" ");
        this.nev = adatok[0];
        this.email = adatok[1];
        this.pontszam = Double.parseDouble(adatok[2]);
        this.mez = Integer.parseInt(adatok[3]);
        
    }

    public String getNev() {
        return nev;
    }

    @Override
    public String toString() {
        return "Versenyzo{" + "nev=" + nev + ", email=" + email + ", pontszam=" + pontszam + ", mez=" + mez + '}';
    }

    public String getEmail() {
        return email;
    }

    public double getPontszam() {
        return pontszam;
    }

    public int getMez() {
        return mez;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPontszam(double pontszam) {
        this.pontszam = pontszam;
    }

    public void setMez(int mez) {
        this.mez = mez;
    }


    
    
}
