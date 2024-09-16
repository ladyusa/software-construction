package lec3interface.basic.things;

public class AirPlane implements Flyable {
    private String id;
    private String origin, destination;

    @Override
    public void fly() {
        System.out.println("--- flying with engine ----");
    }
}
