import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FlightTest {

    Flight flight;

    @Before

    public void before() {
        flight = new Flight("Boeing 747", 67, "Belfast")


    }

    @Test
    public void canGetPlane(){
        assertEquals("Boeing 747", flight.getPlane());
    }
}
