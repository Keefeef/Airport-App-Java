public enum Plane {
    Boeing747(50, easyJet, 40),
    Boeing123(40, ryanair, 30),
    Boeing321(30, flybe, 20);

    private final int capacity;
    private String airline;
    private final int passengers;

    Plane(int capacity, String airline, int passengers) {
        this.capacity = capacity;
        this.airline = airline;
        this.passengers = passengers;
    }

}
