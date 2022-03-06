package com.linio.certification.test.utils;

import com.linio.certification.test.models.Product;

import java.io.*;
import java.util.List;

public class SaveFile {

    private static File file;

    public void writeFile(List<Product> products) {
        file = new java.io.File("products");
        if (!file.exists()) {
            try {
                file.createNewFile();
                write(products);
            } catch (IOException exception) {
                exception.printStackTrace();
            }
        } else {
            write(products);
        }
    }

    private void write(List<Product> products) {
        try {
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            for (Product product : products) {
                bw.write(product.getAmount() + "\t" + product.getPrice() + "\t" + product.getTotal_price() + "\n");
            }
            bw.close();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    public String readFile() {
        String price_total = "";
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line, fields[];

            while ((line = br.readLine()) != null) {
                fields = line.split("\t");
                price_total = fields[2];
            }
            br.close();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        return price_total;
    }

}













