package ss16_IO_doc_ghi_file.thuc_hanh;

import java.util.ArrayList;
import java.util.List;

public class FindMaxValue {
    public static int findMax(List<Integer> list){
        int max = list.get(0);
        for (Integer number: list){
            if (number > max){
                max = number;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> number = readAndWriteFile.readFile("src/ss16_IO_doc_ghi_file/thuc_hanh/abc.txt");
        int maxVlue = findMax(number);
        readAndWriteFile.writeFile("src/ss16_IO_doc_ghi_file/thuc_hanh/result.txt",maxVlue);
    }
}
