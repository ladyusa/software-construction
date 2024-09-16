package lec3interface.basic.keyboard;

// ElectricKeyboard เป็น subtype ของ Keyboard
// ElectricKeyboard เป็น implementation ของ Keyboard
public class ElectricKeyboard implements Keyboard {
    @Override
    public void pressWhiteKey(int i) {
        System.out.println("send electric signal to key "+i);
    }

    @Override
    public void pressBlackKey(int i) {
        System.out.println("send electric signal to key "+i+".5");
    }
}
