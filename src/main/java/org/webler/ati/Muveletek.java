package org.webler.ati;

public class Muveletek {

    public Muveletek() {
    }

    public int getOsszeg(int a, int b) {
        return a+b;
    }
    public int getKulonbseg(int a, int b) {
        return a-b;
    }
    public int getSzorzat(int a, int b) {
        return a*b;
    }
    public int getHanyados(int a, int b) {
        return a/b;
    }
    public int getTeglalapKerulete(int a, int b) {
        return (a+b)*2;
    }
    public int getTeglalapTerulete(int a, int b) {
        return a*b;
    }


    public double getKorKerulet(int r) {
        return 2*r*Math.PI;
    }
    public double getKorTerulet(int r) {
        return Math.sqrt(r)*Math.PI;
    }
}
