import java.util.ArrayList;

public class Airport {
    private ArrayList<Plane> hangars;
    private int airportCode;
}

public Airport(int airportCode){
    this.hangars = new ArrayList<>();
    this.airportCode = airportCode;
}