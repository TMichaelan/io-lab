package put.io.testing.junit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }
    @Test
    public void testAdd() {
        assertEquals(2, calculator.add(1,1), 0);
        assertEquals(2, calculator.add(3, -1), 0);
        assertEquals(-5, calculator.add(-2, -3), 0);
    }

    @Test
    public void testMultiply() {
        assertEquals(2, calculator.multiply(1, 2), 0);
        assertEquals(-3, calculator.multiply(3, -1), 0);
        assertEquals(0, calculator.multiply(214786, 0), 0);
    }

    @Test
    public void testAddPositiveNumbers(){
        Assertions.assertThrows(IllegalArgumentException.class,() ->{
            calculator.addPositiveNumbers(-3,5);
        });

//Assertions.assertEquals("message", exception.getMessage());
    }
}

/**
 3.1 Testy przestałyby działać, ponieważ zmienna calculator byłaby przypisana tylko raz - przy wywołaniu klasy.
 */