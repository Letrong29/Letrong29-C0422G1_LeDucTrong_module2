package ss17_IO_Binary_File_and_Serialization.bai_tap.product_management_systeam.service.impl;

import ss17_IO_Binary_File_and_Serialization.bai_tap.product_management_systeam.util.WriteAndReadFile;
import ss17_IO_Binary_File_and_Serialization.bai_tap.product_management_systeam.model.Product;
import ss17_IO_Binary_File_and_Serialization.bai_tap.product_management_systeam.service.IProductService;

import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService {
    static Scanner scanner = new Scanner(System.in);
    String DATA_FILE = "src/ss17_IO_Binary_File_and_Serialization/bai_tap/product_management_systeam/data/Danh-sach-san-pham.txt";

    @Override
    public void search() {
        List<Product> productList = new WriteAndReadFile().readFile(DATA_FILE);
        System.out.println("nhập tên sản phẩm muốn tìm kiếm");
        String name = scanner.nextLine();

        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).equals(name)){
                System.out.println("đã tìm thấy sản phẩm " + name);
                System.out.println(productList.get(i));
                return;
            }
        }
        System.out.println("sản phẩm không tồn tại");
    }

    @Override
    public void creat() {
        List<Product> productList = new WriteAndReadFile().readFile(DATA_FILE);

        System.out.println("nhập mã sản phẩm");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.println("nhập tên sản phẩm");
        String name = scanner.nextLine();

        System.out.println("nhập nhà sản xuất");
        String producer = scanner.nextLine();

        System.out.println("nhập giá");
        int price = Integer.parseInt(scanner.nextLine());

        System.out.println("ghi chú sẩn phẩm");
        String note = scanner.nextLine();

        productList.add(new Product(id,name,producer,price,note));
        System.out.println("thêm mới thành công");

        new WriteAndReadFile().writeFile(DATA_FILE,productList);
    }

    @Override
    public void display() {
        List<Product> productList = new WriteAndReadFile().readFile(DATA_FILE);
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    @Override
    public void update() {
        List<Product> productList = new WriteAndReadFile().readFile(DATA_FILE);
        System.out.println("nhập tên sản phẩm muốn cập nhật");
        String name = scanner.nextLine();
        boolean check = false;
        int index = 0;

        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getName().equals(name)){
                index = i;
                check = true;
            }
        }

        if (check){
            System.out.println("cập nhật mã sản phẩm");
            int newId = Integer.parseInt(scanner.nextLine());

            System.out.println("cập nhật tên sản phẩm");
            String newName = scanner.nextLine();

            System.out.println("cập nhật nhà sản xuất");
            String newProducer = scanner.nextLine();

            System.out.println("câp nhật giá");
            int newPrice = Integer.parseInt(scanner.nextLine());

            System.out.println("cập nhật ghi chú sẩn phẩm");
            String newNote = scanner.nextLine();

            productList.get(index).setId(newId);
            productList.get(index).setName(newName);
            productList.get(index).setProducer(newProducer);
            productList.get(index).setPrice(newPrice);
            productList.get(index).setNote(newNote);
            System.out.println("cập nhật thành công " + productList.get(index));
        }else {
            System.out.println("không tìm thấy sản phẩm");
        }
        new WriteAndReadFile().writeFile(DATA_FILE,productList);
    }

    @Override
    public void delete() {
        List<Product> productList = new WriteAndReadFile().readFile(DATA_FILE);
        System.out.println("nhập tên sản phẩm muốn xóa");
        String name = scanner.nextLine();
        boolean check = true;
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getName().equals(name)){
                check = false;
                productList.remove(i);
            }
        }
        if (check){
            System.out.println("không tìm thấy tên sản phẩm");
        }else {
            System.out.println("xóa thành công");
        }
        new WriteAndReadFile().writeFile(DATA_FILE,productList);
    }

}
