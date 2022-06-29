package ss18_string_regex.bai_tap;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
/*
Bắt đầu bằng một ký tự chữ hoa C hoặc A hoặc P
Không chứa các ký tự đặc biệt
Theo sau ký tự bắt đầu là 4 ký tự số
Kết thúc phải là 1 trong những ký tự chữ hoa sau: G, H, I, K, L, M*/

    public static final String NAME_CLASS = "^[CAP]\\d{4}[GHIKLM]$";

    public RegularExpression() {

    }
    public boolean validate(String regex){
        Pattern pattern = Pattern.compile(NAME_CLASS);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public static void main(String[] args) {
        RegularExpression regularExpression = new RegularExpression();
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhập tên lớp");
        String nameClass = scanner.nextLine();

        boolean check = regularExpression.validate(nameClass);
        System.out.println(check);
    }
}
