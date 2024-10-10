package org.example.day8.class사용;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class 출력스트림 {
    public static void main(String[] args) {

        OutputStream out = null;
        try {
            out = new FileOutputStream("C:/data/imsi2.txt");

            byte[] array = {10,20,30,40,50};

            out.write(array,0,3);

            out.flush();
            out.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
