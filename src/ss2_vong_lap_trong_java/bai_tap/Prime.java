package ss2_vong_lap_trong_java.bai_tap;

public class Prime {
    public static void main(String[] args) {
        int snt = 2;
        int countSnt = 0;

        while (countSnt < 20){                  // kiểm tra số nguyên tố đến khi số lượng snt = 20 thì dừng
            boolean flag = true;                // tất cả đều là số nguyên tố
            for (int i = 2; i < snt ; i++) {    //lấy snt chia cho khoản từ 2 đến số nhỏ hơn chính nó
                if (snt % i == 0){              //nếu có số nào chia hết cho 1 số nào bất kỳ trong khoản đó
                    flag = false;               //thì số đó ko phải snt
                    break;                      //và thoát vòng lặp
                }
            }
            if (flag){                          //nếu số đó là snt
                System.out.println(snt);        //thì in snt đó ra
                countSnt++;                     //biến đếm số lượng snt tăng lên 1
            }
            snt++;                              // snt tăng lên 1
        }
    }
}
