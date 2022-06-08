package ss2_vong_lap_trong_java.bai_tap;

public class PrimeLessThanOneHundred {
    public static void main(String[] args) {
        int snt;
        snt = 2;

        while (snt < 100){
            boolean flag = true;
            for (int i = 2; i < snt; i++) {
                if (snt % i == 0){
                    flag = false;
                    break;
                }
            }
            if (flag){
                System.out.println(snt);
            }
            snt++;
        }
    }
}
