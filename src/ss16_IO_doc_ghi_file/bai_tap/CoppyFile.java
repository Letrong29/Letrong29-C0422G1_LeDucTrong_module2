package ss16_IO_doc_ghi_file.bai_tap;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CoppyFile {
    public List<String> readFile(String sourceFile) {
        List<String> fileCoppy = new ArrayList<>();

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(sourceFile));

            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                fileCoppy.add(line);
            }
        } catch (IOException e) {
            System.out.println("không tìm thấy file nguồn");
        }
        return fileCoppy;
    }

    public void wirteFile(String targetFile, List<String> fileCoppy) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(targetFile,true));
            for (String line : fileCoppy) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("file đến đã tồn tại");
        }
    }

    public static void main(String[] args) {
        CoppyFile coppyFile = new CoppyFile();
        List<String> list = coppyFile.readFile("src/ss16_IO_doc_ghi_file/bai_tap/source file.txt");
        coppyFile.wirteFile("src/ss16_IO_doc_ghi_file/bai_tap/target file.txt",list);
    }
}
