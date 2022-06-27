package ss16_IO_doc_ghi_file.thuc_hanh;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ReadFileExample readFileExample = new ReadFileExample();
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhập đường dẫn file");
        String path = scanner.nextLine();
        readFileExample.readFileText(path);
    }
}
