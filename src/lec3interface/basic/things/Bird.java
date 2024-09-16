package lec3interface.basic.things;

// IS-A relationship
// Bird is flyable
public class Bird implements Flyable, Living {
    private String name;
    private String type;

    @Override
    public void fly() {
        System.out.println("--- fly with my wings ---");
    }

    public void eat(String food) {
        System.out.println("--- นกจิก " + food + "---");
    }

    public void move() {

    }
}
