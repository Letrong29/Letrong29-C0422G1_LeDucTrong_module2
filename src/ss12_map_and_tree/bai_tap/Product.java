package ss12_map_and_tree.bai_tap;

import java.util.Comparator;

public class Product implements Comparable<Product> {
    private int serial;
    private String nameProduct;
    private String producer;
    private double price;

    public Product(int serial, String nameProduct, String producer, double price) {
        this.serial = serial;
        this.nameProduct = nameProduct;
        this.producer = producer;
        this.price = price;
    }

    public Product() {

    }

    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "serial=" + serial +
                ", nameProduct='" + nameProduct + '\'' +
                ", producer='" + producer + '\'' +
                ", price=" + price +
                '}';
    }


    @Override
    public int compareTo(Product o) {
        if (this.getPrice() > o.getPrice()){
            return 1;
        }else{
            return -1;
        }
    }
}
