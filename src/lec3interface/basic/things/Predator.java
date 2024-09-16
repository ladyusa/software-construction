package lec3interface.basic.things;

public abstract class Predator implements Living {

    // หากเรา implement method ของ interface ไม่ครบ
    // เราต้องประกาศคลาสให้เป็น abstract
    // เนื่องจาก method ที่เรายังไม่ได้ implement จะยังคงเป็น abstract
    // คลาสจังต้องเป็น abstract

    @Override
    public void eat(String food) {

    }
}
