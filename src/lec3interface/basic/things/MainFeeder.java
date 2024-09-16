package lec3interface.basic.things;

public class MainFeeder {

    public static void main(String[] args) {
        MainFeeder feeder = new MainFeeder();
        feeder.feed( new Bird(), "worm");
        feeder.feed( new Cat(), "fish");

        // AirPlane ไม่ใช่ Living จึงส่งเข้าเมธอด feed ไม่ได้
        // feeder.feed( new AirPlane(), "worm");
    }

    public void feed(Living living, String food) {
        living.eat(food);  // polymorphism
    }
}
