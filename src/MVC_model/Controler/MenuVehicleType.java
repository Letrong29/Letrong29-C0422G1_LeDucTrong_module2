package MVC_model.Controler;

import MVC_model.Service.impl.CarService;
import MVC_model.Service.impl.TruckService;

import java.util.Scanner;

public class SystemService  {

    static Scanner scanner = new Scanner(System.in);
    static TruckService truckService = new TruckService();
    static CarService carService = new CarService();

    public static void menuCreat() {
        System.out.println(
                "1. Thêm xe tải" + "\n" +
                        "2. thêm ô tô" + "\n" +
                        "3. thêm xe máy"
        );
        System.out.println("chọn loại phương tiện muốn thêm mới");
        int choose = Integer.parseInt(scanner.nextLine());

        switch (choose) {
            case 1:
                truckService.creatTruck();
                break;
            case 2:
                carService.creatCar();
                break;

        }
    }

    public static void menuDisplay() {
        System.out.println(
                "1. Hiển thị danh sách xe tải" + "\n" +
                        "2. Hiển thị danh sách ô tô" + "\n" +
                        "3. Hiển thị danh sách xe máy"
        );
        System.out.println("chọn loại phương tiện muốn hiển thị");
        int choose = Integer.parseInt(scanner.nextLine());

        switch (choose) {
            case 1:
                truckService.disPlayTruck();
            case 2:
                carService.disPlayCar();
        }
    }
}

