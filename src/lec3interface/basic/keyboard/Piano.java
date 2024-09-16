package lec3interface.basic.keyboard;

// Piano เป็น subtype ของ Keyboard
// Piano เป็น implementation ของ Keyboard
public class Piano implements Keyboard {

    @Override
    public void pressWhiteKey(int i) {
        System.out.println("soft hammer hits wire " + i);
    }

    @Override
    public void pressBlackKey(int i) {
        System.out.println("soft hammer hits wire " + i + ".5");
    }
}
