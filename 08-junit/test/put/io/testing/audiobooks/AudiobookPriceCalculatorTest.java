package put.io.testing.audiobooks;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


//5.1 White-box
//5.2 4

class AudiobookPriceCalculatorTest {

    @Test
    public void testSubscriber(){
        Customer klient = new Customer("Ilya", Customer.LoyaltyLevel.SILVER,true);
        Audiobook audiobook = new Audiobook("Wiedzmin",200);
        AudiobookPriceCalculator kalkulator = new AudiobookPriceCalculator();
        assertEquals(0,kalkulator.calculate(klient,audiobook));
    }
    @Test
    public void testSilver(){
        Customer klient = new Customer("Heorhi", Customer.LoyaltyLevel.SILVER,false);
        Audiobook audiobook = new Audiobook("Ksiazka",100);
        AudiobookPriceCalculator kalkulator = new AudiobookPriceCalculator();
        assertEquals(90,kalkulator.calculate(klient,audiobook));
    }
    @Test
    public void testGold(){
        Customer klient = new Customer("Michal", Customer.LoyaltyLevel.GOLD,false);
        Audiobook audiobook = new Audiobook("Cos tam",100);
        AudiobookPriceCalculator kalkulator = new AudiobookPriceCalculator();
        assertEquals(80,kalkulator.calculate(klient,audiobook));
    }
    @Test
    public void testStandard(){
        Customer klient = new Customer("Ktos", Customer.LoyaltyLevel.STANDARD,false);
        Audiobook audiobook = new Audiobook("Cos tam",100);
        AudiobookPriceCalculator kalkulator = new AudiobookPriceCalculator();
        assertEquals(100,kalkulator.calculate(klient,audiobook));
    }
}