package ss12_map_and_tree.bai_tap;

import java.util.*;

public class ProductManager {

    static Scanner scanner = new Scanner(System.in);
    static List<Product> productList = new ArrayList<>();

    static {
        Product product1 = new Product(1, "Sữa", "vinamilk", 10.000);
        Product product2 = new Product(2, "dầu ăn", "Tường An", 15.000);
        Product product3 = new Product(3, "nước tương", "Chinshu", 12.000);
        Product product4 = new Product(4, "tương ớt", "Chinshu", 10.000);
        Product product5 = new Product(5, "bột canh", "Acecook", 5.000);

        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);
        productList.add(product5);
    }

    //hiển thị sản phẩm
    public static void Display(){
        for (int i = 0; i < productList.size(); i++) {
            System.out.println(productList.get(i));
        }
    }

    //thêm sản phẩm
    public static void creat(){

        System.out.println("nhập số serial");
        int newSerial = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập tên sản phẩm");
        String newNameProduct = scanner.nextLine();
        System.out.println("nhập nhà sản xuất");
        String newProducer = scanner.nextLine();
        System.out.println("nhập giá tiền");
        int newPrice = Integer.parseInt(scanner.nextLine());

        Product newProduct = new Product(newSerial, newNameProduct, newProducer, newPrice);

        productList.add(newProduct);

        System.out.println("thêm mới thành công");
    }

    //Sửa thông tin sản phẩm theo id
    public static void Edit(){

        boolean flag = true;
        int index = 0;

        do {
            System.out.println("nhập số serial");
            int serial = Integer.parseInt(scanner.nextLine());

            for (int i = 0; i < productList.size(); i++) {
                if (serial == productList.get(i).getSerial()){
                    flag = false;
                    index = i;
                }
            }
        }while (flag);

        System.out.println("nhập tên sản phẩm");
        productList.get(index).setNameProduct(scanner.nextLine());
        System.out.println("nhập nhà sản xuất");
        productList.get(index).setProducer(scanner.nextLine());
        System.out.println("nhập giá tiền");
        productList.get(index).setPrice(Integer.parseInt(scanner.nextLine()));

        System.out.println("cập nhật thành công");
    }

    //xóa phần tử theo id
    public static void delate(){
        boolean check = true;

        do {
            System.out.println("nhập số serial sản phẩm bạn muốn xóa");
            int serial = Integer.parseInt(scanner.nextLine());

            for (int i = 0; i < productList.size(); i++) {
                if (productList.get(i).getSerial() == serial){
                    productList.remove(i);
                    check = false;
                    break;
                }
            }

            if (check){
                System.out.println("không tìm thấy số serial");
            }

        }while(check);

        System.out.println("xóa thành công");

    }

    //tìm kiếm sản phẩm theo tên.
    public static void sherch(){

        System.out.println("nhập tên sản phẩm bạn muốn tìm");
        String nameProduct = scanner.nextLine();
        boolean check = true;

        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getNameProduct().equals(nameProduct)){
                System.out.println("sản phẩm bạn cần tìm là: " + productList.get(i));
                check = false;
                break;
            }
        }

        if (check){
            System.out.println("không tìm thấy sản phẩm có tên: " + nameProduct);
        }
    }

    //sắp xếp phần tử theo giá
    public static void sort(){
        Collections.sort(productList);
        Display();
    }
}
