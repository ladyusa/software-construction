package lec3interface.measurer;

public class Data {

    /**
     * This method can be used to calculate average of any values
     * of any class as long as Measurer object is specified in
     * the parameter of the method.
     *
     * --- <b>object meas is an encapsulation of a method to be called
     * by average so that it can find appropriate data to compute
     * average.</b>
     *
     * @param elements contains data needed to calculate average
     * @param meas ตัววัดค่า/คืนค่าที่ต้องการจาก object ใน elements
     * @return average value of elements measured by meas
     */
    public static double average(Object[] elements, Measurer meas) {
        double result = 0;
        for (Object e : elements) {
            result += meas.measure(e);  // polymorphism
        }
        if (elements.length != 0) {
            return result/elements.length;
        }
        return 0;

        // polymorphism
        // ถ้าส่ง parameter เป็นอ๊อบเจ็กต์ของ BalanceMeasurer
        //    meas.measure(e) จะเลือกใช้เมทอด measure() ของ BalanceMeasurer
        // ถ้าส่ง parameter เป็นอ๊อบเจ็กต์ของ CountryAreaMeasurer
        //    meas.measure(e) จะเลือกใช้เมทอด measure() ของ CountryAreaMeasurer
    }
}

