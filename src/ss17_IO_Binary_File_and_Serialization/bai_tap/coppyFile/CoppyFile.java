package ss17_IO_Binary_File_and_Serialization.bai_tap.coppyFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class CoppyFile {
    public static void coppyAndPath(File sourceFile, File targetFile) throws IOException {
        Files.copy(sourceFile.toPath(),targetFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }

    public static void main(String[] args) {
        String SOURCE_FIlE = "src/ss17_IO_Binary_File_and_Serialization/bai_tap/coppyFile/source_file.txt";
        String TARGET_FILE ="src/ss17_IO_Binary_File_and_Serialization/bai_tap/coppyFile/target_file.txt";

        File fileSource = new File(SOURCE_FIlE);
        File fileTarget = new File(TARGET_FILE);

        try {
            coppyAndPath(fileSource,fileTarget);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
