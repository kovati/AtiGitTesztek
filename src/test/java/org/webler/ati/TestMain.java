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
}
