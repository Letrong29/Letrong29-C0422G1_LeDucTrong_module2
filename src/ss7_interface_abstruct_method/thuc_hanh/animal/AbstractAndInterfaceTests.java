package ss7_interface_abstruct_method.thuc_hanh.animal;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {

        //test Animal class, Tiger class and Chicken class;
        System.out.println("kiểm thử phương thức meakSoud cho 2 con của  lớp Động vật");

        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();

        for (Animal animal: animals) {
            System.out.println(animal.makeSound());
        }


        System.out.println();


        //test Fruit class
        System.out.println("kiểm thử interface Edible cho 2 lớp con của lớp Fruit");

        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Apple();
        fruits[1] = new Orange();

        for (Fruit fruit: fruits) {
            System.out.println(fruit.howToEat());
        }

    }
}
