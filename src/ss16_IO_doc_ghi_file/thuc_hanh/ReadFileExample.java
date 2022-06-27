package ss16_IO_doc_ghi_file.thuc_hanh;

import java.io.*;

public class ReadFileExample {
    public void readFileText(String filePath){
        try {
            File file = new File(filePath);

            if (!file.exists()){
                throw new FileNotFoundException();
            }

            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            int sum = 0;
            while (true){
                String line = br.readLine();
                if (line == null){
                    break;
                }
                System.out.println(line);
                sum += Integer.parseInt(line);

            }
            System.out.println("sum = " + sum);
        } catch (IOException e) {
            System.out.println("không tìm thấy file");
        }
    }
}
