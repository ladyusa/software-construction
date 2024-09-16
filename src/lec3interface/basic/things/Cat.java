package lec3interface.basic.things;

public class Cat implements Living {

    @Override
    public void eat(String food) {
        System.out.println("--- แมวเลีย " + food + "---");
    }

    @Override
    public void move() {

    }
}
