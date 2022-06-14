package ss5_access_modifier_statisc_method_property.thuc_hanh;

public class TestStaticProperty {
    public static void main(String[] args) {
        Car car = new Car("bycicleOfMe", "Rice");

        System.out.println(car.numberOfCars);

        Car car1 = new Car("G63","golf");

        System.out.println(Car.numberOfCars);

    }
}
