package org.webler.ati;

//import org.junit.Test;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
        assert muvelet.getTeglalapKerulete(8,4) == 24.0;
    }
    @Test
    void teruletTest() {
        Muveletek muvelet = new Muveletek();
        assert muvelet.getTeglalapTerulete(8,4) == 32.0;
    }
    @Test
    void korKeruletTest() {
        Muveletek muvelet = new Muveletek();
        assertEquals(18.8495, muvelet.getKorKerulete(3), 0.0001);
    }
    @Test
    void korTeruletTest() {
        Muveletek muvelet = new Muveletek();
        assertEquals(5.441, muvelet.getKorTerulete(3), 0.001);
    }
}
