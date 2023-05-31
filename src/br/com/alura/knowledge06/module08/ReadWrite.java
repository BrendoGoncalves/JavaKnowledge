package br.com.alura.knowledge06.module08;

import java.io.*;

public class ReadWrite {
    public static void main(String[] args) throws IOException {
        InputStream fis = new FileInputStream("breakfast4");
        Reader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        OutputStream os = System.out;
        Writer osw = new OutputStreamWriter(os);
        BufferedWriter bw = new BufferedWriter(osw);

        String line = br.readLine();

        while(line != null){
            bw.write(line);
            bw.newLine();
            line = br.readLine();
            bw.flush();
        }
        br.close();
        bw.close();
    }
}
