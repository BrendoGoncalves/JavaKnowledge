package br.com.alura.knowledge06.module09;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Net {
    public static void main(String[] args) throws IOException {

        Socket s = new Socket();

        InputStream is = s.getInputStream();

        OutputStream os = s.getOutputStream();
    }
}
