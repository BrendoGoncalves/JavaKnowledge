package br.com.alura.Knowledge06.module07;

import java.io.*;

public class ReadWrite {
    public static void main(String[] args) throws IOException {
        InputStream fis = System.in;
        Reader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        OutputStream fos = new FileOutputStream("breakfast4");
        Writer osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        String line = br.readLine();

        while(line != null && !line.isEmpty()){
            bw.write(line);
            bw.newLine();
            bw.flush();
            line = br.readLine();
        }

        br.close();
        bw.close();
    }
}
