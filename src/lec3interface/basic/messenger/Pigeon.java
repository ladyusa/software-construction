package lec3interface.basic.messenger;

import lec3interface.basic.things.Flyable;

public class Pigeon implements Messenger, Flyable {
    @Override
    public void fly() {
        System.out.println("--- fly with my wings ---");
    }

    @Override
    public void send(String message) {
        fly();
        System.out.println("Dropping message: " + message);
    }

    @Override
    public String receive() {
        return "";
    }
}
