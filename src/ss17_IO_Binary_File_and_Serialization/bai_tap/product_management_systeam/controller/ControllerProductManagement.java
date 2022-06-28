package ss17_IO_Binary_File_and_Serialization.bai_tap.product_management_systeam.controller;

import ss17_IO_Binary_File_and_Serialization.bai_tap.product_management_systeam.service.impl.ProductService;

import java.util.Scanner;

public class ControllerProductManagement {
    static Scanner scanner =new Scanner(System.in);
    static ProductService productService = new ProductService();

    public static void menuProductManagementSystem(){
        do {
            System.out.println("HỆ THỐNG QUẢNG LÝ SẢN PHẨM" + "\n" +
                    "1. Thêm sản phẩm" + "\n" +
                    "2. Hiển thị sản phẩm" + "\n" +
                    "3. cập nhật sản phẩm" + "\n" +
                    "4. Xóa sản phẩm" + "\n" +
                    "5. Tìm kiếm thông tin sản phẩm" + "\n" +
                    "6. Thoát" + "\n" +
                    ">>> CHỌN CHỨC NĂNG <<<"
            );
            int choose = Integer.parseInt(scanner.nextLine());

            switch (choose){
                case 1:
                    productService.creat();
                    break;
                case 2:
                    productService.display();
                    break;
                case 3:
                    productService.update();
                    break;
                case 4:
                    productService.delete();
                    break;
                case 5:
                    productService.search();
                    break;
                case 6:
                    System.exit(0);
            }
        }while (true);
    }
}
