import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarEngineTest {
    private CarEngine engine;

    @BeforeEach
    public void setup() {
        engine = new CarEngine();
    }

    @Test
    public void testDefaultConstructor() {
        assertEquals("Unknown", engine.getCompanyName());
        assertEquals(0, engine.getHorsePower());
        assertEquals(0, engine.getEngineDisplacement());
        assertEquals(0, engine.getNumCylinders());
        assertEquals(0, engine.getTorque());
        assertEquals(0, engine.getBoreSize());
        assertEquals(0, engine.getStroke());
        assertEquals(0, engine.getSpeed());
    }

    @Test
    public void testOverloadedConstructor() {
        engine = new CarEngine("Company A", 200, 3000, 80, 90, 4);
        assertEquals("Company A", engine.getCompanyName());
        // Add assertions for other attributes based on your calculations
    }

    @Test
    public void testSetCompanyNameWithNull() {
        engine.setCompanyName(null);
        assertEquals("Unknown", engine.getCompanyName());
    }

    @Test
    public void testSetNumCylindersWithValidValue() {
        engine.setNumCylinders(4);
        assertEquals(4, engine.getNumCylinders());
    }

    @Test
    public void testSetNumCylindersWithInvalidValue() {
        engine.setNumCylinders(10); // Should be capped to 8
        assertEquals(8, engine.getNumCylinders());
    }

    // Add more test cases for other methods and edge cases as required
}

