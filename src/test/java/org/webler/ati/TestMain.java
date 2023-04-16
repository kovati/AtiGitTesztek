package org.webler.ati;

//import org.junit.Test;
import org.junit.jupiter.api.Test;
public class TestMain {
    @Test
    void osszeadasTest() {
        Muveletek muvelet = new Muveletek();
        assert muvelet.getOsszeg(5,6) == 11.0;
    }
    @Test
    void kivonasTest() {
        Muveletek muvelet = new Muveletek();
        assert muvelet.getKulonbseg(6,4) == 2.0;
    }
    @Test
    void szorzasTest() {
        Muveletek muvelet = new Muveletek();
        assert muvelet.getSzorzat(6,4) == 24.0;
    }
    @Test
    void osztasTest() {
        Muveletek muvelet = new Muveletek();
        assert muvelet.getHanyados(8,4) == 2.0;
    }
    @Test
    void keruletTest() {
        Muveletek muvelet = new Muveletek();
        assert muvelet.getTeglalapKerulet(8,4) == 24.0;
    }
    @Test
    void teruletTest() {
        Muveletek muvelet = new Muveletek();
        assert muvelet.getTeglalapTerulet(8,4) == 32.0;
    }
}
