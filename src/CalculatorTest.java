import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void suma() {
        Calculator c1 = new Calculator();
        c1.Suma(1,-4);
        assertEquals(-3,c1.getSuma());
    }

    @Test
    void suma2() {
        Calculator c1 = new Calculator();
        c1.Suma(-1564,-500);
        assertEquals(-2064,c1.getSuma());
    }



    @Test
    void resta() {
        Calculator c1 = new Calculator();
        c1.Resta(-1564,-500);
        assertEquals(-1064,c1.getResta());
    }

    @Test
    void resta2() {
        Calculator c1 = new Calculator();
        c1.Resta(1564,-500);
        assertEquals(2064,c1.getResta());
    }

    @Test
    void mult() {
        Calculator c1 = new Calculator();
        c1.Mult(25,-2);
        assertEquals(-50,c1.getMulti());
    }

    @Test
    void mult2() {
        Calculator c1 = new Calculator();
        c1.Mult(25,4);
        assertEquals(100,c1.getMulti());
    }

    @Test
    void div() {
        Calculator c1 = new Calculator();
        c1.Div(30,2);
        assertEquals(15,c1.getDiv());
    }

    @Test
    void div2() {
        Calculator c1 = new Calculator();
        c1.Div(30,2);
        assertEquals(15,c1.getDiv());
    }


}