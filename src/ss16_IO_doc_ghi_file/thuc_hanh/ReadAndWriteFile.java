package ss16_IO_doc_ghi_file.thuc_hanh;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {

    // method 1 đọc file được truyền vào
    public List<Integer> readFile(String filePath){
        List<Integer> list = new ArrayList<>();

        try {
            File file = new File(filePath);

            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            while (true){
                String line = br.readLine();
                if (line == null){
                    break;
                }
                list.add(Integer.parseInt(line));
            }
            br.close();
        } catch (IOException e) {
            System.out.println("không tìm thấy file");
        }
        return list;
    }

    // method 2 ghi dữ liệu vào file chỉ định
    public void writeFile(String filePath, int max){
        try {
            FileWriter fileWriter = new FileWriter(filePath, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("gái trị lớn nhất là " + max);
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
