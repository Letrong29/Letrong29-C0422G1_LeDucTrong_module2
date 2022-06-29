package ss18_string_regex.bai_tap;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateNameClass {
/*
Bắt đầu bằng một ký tự chữ hoa C hoặc A hoặc P
Không chứa các ký tự đặc biệt
Theo sau ký tự bắt đầu là 4 ký tự số
Kết thúc phải là 1 trong những ký tự chữ hoa sau: G, H, I, K, L, M*/

    public static final String NAME_CLASS = "^[CAP]\\d{4}[GHIKLM]$";

    public ValidateNameClass() {

    }
    public static boolean validate(String regex){
       return regex.matches(NAME_CLASS);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhập tên lớp");
        String nameClass = scanner.nextLine();

        System.out.println(validate(nameClass));
    }
}
