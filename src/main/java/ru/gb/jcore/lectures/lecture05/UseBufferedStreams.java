package ru.gb.jcore.lectures.lecture05;

import java.io.*;

public class UseBufferedStreams {
    public static void compareOutStreams() {
        String fileName = "testSimple.txt";
        InputStream inStream = null;
        OutputStream outStream = null;

        try {
            long timeStart = System.currentTimeMillis();
            outStream = new BufferedOutputStream(new FileOutputStream(fileName));
            for (int i = 1000000; --i >= 0; ) {
                outStream.write(i);
            }
            long time = System.currentTimeMillis() - timeStart;
            System.out.println("Writing time: " + time + " millisec");
            outStream.close();
        } catch (IOException e) {
            System.out.println("IOExeption: " + e.toString());
            e.printStackTrace();
        }
    }

    public static void compareInStreams() {
        String fileName = "testSimple.txt";
        InputStream inStream = null;
        OutputStream outStream = null;

        try {
            long timeStart = System.currentTimeMillis();
            inStream = new FileInputStream(fileName);
            while (inStream.read() != -1) {
            }
            long time = System.currentTimeMillis() - timeStart;
            inStream.close();
            System.out.println("Direct read time: " + time + " millisec");
        } catch (IOException e) {
            System.out.println("IOExeption: " + e.toString());
            e.printStackTrace();
        }
        try {
            long timeStart = System.currentTimeMillis();
            inStream = new BufferedInputStream(new FileInputStream(fileName));
            while (inStream.read() != -1) {
            }
            long time = System.currentTimeMillis() - timeStart;
            inStream.close();
            System.out.println("Direct read time: " + time + " millisec");
        } catch (IOException e) {
            System.out.println("IOExeption: " + e.toString());
            e.printStackTrace();
        }
    }
}

