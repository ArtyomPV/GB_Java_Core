package ru.gb.jcore.lectures.lecture05;

import java.io.*;

public class UseDataStream {
    static ByteArrayOutputStream out = new ByteArrayOutputStream();
    static DataOutputStream outStream = new DataOutputStream(out);

    public static void run(){
        writeDataStream();
        readDataStream();
        System.out.println("==================");
        System.out.println("wrong reading");
        readWrongDataStream();
    }
    private static void writeDataStream() {

        try {
            outStream.writeByte(128);
            outStream.writeInt(128);
            outStream.writeLong(128);
            outStream.writeDouble(128);
            outStream.close();
        } catch (IOException e) {
            System.out.println("Impossible IOException occurs: " + e.toString());
            e.printStackTrace();
        }
    }

    private static void readDataStream(){
        try {
            byte[] bytes = out.toByteArray();
            InputStream in = new ByteArrayInputStream(bytes);
            DataInputStream inData = new DataInputStream(in);

            System.out.println("Reading in the correct sequence: ");
            System.out.println("ReadByte: " + inData.readByte());
            System.out.println("ReadInt: " + inData.readInt());
            System.out.println("ReadLong: " + inData.readLong());
            System.out.println("ReadDouble: " + inData.readDouble());
            inData.close();
        } catch (IOException e) {
            System.out.println("Impossible IOException occurs: " + e.toString());
            e.printStackTrace();
        }
    }

    private static void readWrongDataStream() {
        try {
            byte[] bytes = out.toByteArray();
            InputStream in = new ByteArrayInputStream(bytes);
            DataInputStream inData = new DataInputStream(in);

            System.out.println("Reading in the modified sequence: ");
            System.out.println("ReadInt: " + inData.readInt());
            System.out.println("ReadDouble: " + inData.readDouble());
            System.out.println("ReadLong: " + inData.readLong());
            inData.close();
        } catch (IOException e) {
            System.out.println("Impossible IOException occurs: " + e.toString());
            e.printStackTrace();
        }
    }

}
