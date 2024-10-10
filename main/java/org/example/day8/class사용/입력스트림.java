package org.example.day8.class사용;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class 입력스트림 {
    public static void main(String[] args) {

        try {
            InputStream is = new FileInputStream("C:/data/imsi2.txt");

            byte[] data = new byte[100];

            while (true) {
                int num = is.read(data);
                if (num == -1) break;

                for(int i = 0; i < num; i++){
                    System.out.println(data[i]);
                }

            }

            is.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
