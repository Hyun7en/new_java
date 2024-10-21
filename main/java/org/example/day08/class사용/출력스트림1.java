package org.example.day08.class사용;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class 출력스트림1 {
    public static void main(String[] args) {

        try {
            OutputStream out = new FileOutputStream("C:/data/imsi.txt");

            byte a = 10;
            byte b = 20;
            byte c = 30;

            out.write(a);
            out.write(b);
            out.write(c);

            out.flush();
            out.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
