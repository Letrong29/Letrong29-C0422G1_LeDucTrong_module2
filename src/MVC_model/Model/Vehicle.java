package MVC_model.Model;

public abstract class Card {
    private int numberPlate;
    private String NameProducer;
    private int ManufacturingYear;
    private String owner;

    public Card() {
    }

    public Card(int numberPlate, String nameProducer, int manufacturingYear, String owner) {
        this.numberPlate = numberPlate;
        this.NameProducer = nameProducer;
        this.ManufacturingYear = manufacturingYear;
        this.owner = owner;
    }

    public int getNumberPlate() {
        return numberPlate;
    }

    public void setNumberPlate(int numberPlate) {
        this.numberPlate = numberPlate;
    }

    public String getNameProducer() {
        return NameProducer;
    }

    public void setNameProducer(String nameProducer) {
        NameProducer = nameProducer;
    }

    public int getManufacturingYear() {
        return ManufacturingYear;
    }

    public void setManufacturingYear(int manufacturingYear) {
        ManufacturingYear = manufacturingYear;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Card{" +
                "numberPlate=" + numberPlate +
                ", NameProducer='" + NameProducer + '\'' +
                ", ManufacturingYear=" + ManufacturingYear +
                ", owner='" + owner + '\'' +
                '}';
    }
}
