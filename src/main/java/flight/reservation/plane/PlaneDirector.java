package flight.reservation.plane;

public class PlaneDirector {
    private PlaneInterface planeBuilder;
    // constructor 
    public PlaneDirector() {
    }

    public void setPlaneType(PlaneInterface planeBuilder) {
        this.planeBuilder = planeBuilder;
    }

    public void constructPlane() {
        planeBuilder.buildPassengerCapacity();
        planeBuilder.buildCrewCapacity();
    }
}
