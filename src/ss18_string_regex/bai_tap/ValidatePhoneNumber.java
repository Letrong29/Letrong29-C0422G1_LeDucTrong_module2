package ss18_string_regex.bai_tap;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePhoneNumber {
//    Số điện thoại hợp lệ cần đạt theo mẫu sau: (xx)-(0xxxxxxxxx)
//    x là ký tự số
//    Không chứa các ký tự đặc biệt
    public static final String PHONE_NUMBER_REGEX = "^\\(\\d{2}\\)-\\(0\\d{9}\\)$";

    public ValidatePhoneNumber() {

    }

    public static boolean validate(String regex){
       return regex.matches(PHONE_NUMBER_REGEX);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhập số đc theo mẫu (xx)-(0xxxxxxxxx)");
        String phoneNumber = scanner.nextLine();

        System.out.println(validate(phoneNumber));
    }
}
