public class Flight {
    private String plane;
    private int flightNo;
    private String destination;
}

public Flight(String plane, int flightNo, String destination){
    this.plane = plane;
    this.flightNo = flightNo;
    this.destination = destination;
}

public String getPlane(){
    return this.plane;
}