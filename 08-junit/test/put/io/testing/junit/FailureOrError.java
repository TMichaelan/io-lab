package put.io.testing.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FailureOrErrorTest {

    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void test1() {
        assertEquals(5, calculator.add(2,2), 0);
    }

    @Test
    public void test2() {
        assertEquals(5, calculator.addPositiveNumbers(7,-2), 0);
    }

    @Test
    public void test3() {
        try{
            assertEquals(5, calculator.multiply(2,2), 0);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}

/**
 * 4.1
 * test1 zostanie określony jako Failure, ponieważ próba porównania wyników zakończy się niepowodzeniem
 * test2 zostanie określony jako Error, ponieważ podajemy niepoprawne wartości do funkcji
 *
 * 4.2
 * Oczekuje na obiekt Failure typu description który zawiera opis testu, który się nie powiódł oraz wyjątek rzucony przez test
 */