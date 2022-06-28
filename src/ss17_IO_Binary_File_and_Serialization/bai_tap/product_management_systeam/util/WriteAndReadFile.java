package ss17_IO_Binary_File_and_Serialization.bai_tap.product_management_systeam.util;

import ss17_IO_Binary_File_and_Serialization.bai_tap.product_management_systeam.model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteAndReadFile {

    public void writeFile(String pathFile, List<Product> productList) {
        File file = new File(pathFile);
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {
            fos = new FileOutputStream(file);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(productList);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fos.close();
                oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public List<Product> readFile(String filePath) {
        List<Product> productList = new ArrayList<>();

        File file = new File(filePath);
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {
            if (file.length() > 0) {
                fis = new FileInputStream(file);
                ois = new ObjectInputStream(fis);
                productList = (List<Product>) ois.readObject();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (file.length() > 0){
                    fis.close();
                    ois.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return productList;
    }
}
