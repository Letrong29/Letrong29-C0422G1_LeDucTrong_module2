package ss7_interface_abstruct_method.thuc_hanh.animal;

public class Chicken extends Animal implements Edible {

    @Override
    public String makeSound() {
        return "con gà thì gáy";
    }

    @Override
    public String howToEat() {
        return "con gà thì mổ thóc";
    }
}
