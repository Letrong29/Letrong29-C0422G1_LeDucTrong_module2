package ss5_access_modifier_statisc_method_property.thuc_hanh;

public class Car {
    private String name;
    private String engine;

    public static int numberOfCars = 0;

    public Car(String name, String engine){
        this.name = name;
        this.engine = engine;
        numberOfCars++;
    }
}
