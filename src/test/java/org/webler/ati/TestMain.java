package org.webler.ati;

//import org.junit.Test;
import org.junit.jupiter.api.Test;
public class TestMain {
    @Test
    void osszeadasTest() {

        Muveletek muvelet = new Muveletek();

        muvelet.getOsszeg(5,6);

        assert muvelet.getOsszeg(5,6) == 11.0;
        //assert rectangle.getWidth() == 6.0;
    }
}
