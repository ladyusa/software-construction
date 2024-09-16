package lec3interface.generic.measurer;

public class CountryAreaMeasurer implements Measurer<Country> {

    @Override
    public double measure(Country country) {

        // safe ไม่ต้อง down cast แล้ว
        // เพราะ compiler ตรวจเช็คให้แล้วว่า parameter
        // มี type เป็น Country แน่นอน
        return country.getArea();
    }
}
