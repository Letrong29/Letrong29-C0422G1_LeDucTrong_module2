package ss16_IO_doc_ghi_file.bai_tap;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CoppyFile {

    public void coppy(String sourcFile, String targetFile){
        List<String> fileCoppy = new ArrayList<>();

        try {
            // đọc file gốc
            BufferedReader bufferedReader = new BufferedReader(new FileReader(sourcFile));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                fileCoppy.add(line);
            }

            // ghi file gốc vào file mới
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(targetFile,true));
            for (String line : fileCoppy) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (FileNotFoundException e) {
            System.out.println("không tìm thấy file gốc");
        } catch (IOException e) {
            System.out.println("file đến đã tồn tại");
        }
    }


    public static void main(String[] args) {
        CoppyFile coppyFile = new CoppyFile();
        coppyFile.coppy("src/ss16_IO_doc_ghi_file/bai_tap/source file.txt","src/ss16_IO_doc_ghi_file/bai_tap/target file.txt");
    }
}
