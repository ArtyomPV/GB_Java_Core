package ru.gb.jcore.lectures.lecture05;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

public class UseInOutStream {

    public static void byteArrayStream(){
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        out.write(1);
        out.write(0);
        out.write(-1);

        ByteArrayInputStream in = new ByteArrayInputStream(out.toByteArray());

        int value = in.read();
        System.out.println("First element is - " + value);
        value = in.read();
        System.out.println("Second element is - " + value + "\tIf (byte)value - " + (byte)value);
        value = in.read();
        System.out.println("Third element is - " + value);



    }
}
