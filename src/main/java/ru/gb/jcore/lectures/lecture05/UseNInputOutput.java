package ru.gb.jcore.lectures.lecture05;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class UseNInputOutput {

    public static void run() {
        try (RandomAccessFile catFile = new RandomAccessFile("cat.txt", "rw")) {
            FileChannel inChannel = catFile.getChannel();
            ByteBuffer buf = ByteBuffer.allocate(100);
            int bytesRead = inChannel.read(buf);

            while (bytesRead != -1) {
                System.out.println("Read " + bytesRead + " bytes");
//               Set read mode
                buf.flip();
                while (buf.hasRemaining()) {
                    System.out.println((char) buf.get());
                }
                buf.clear();
                bytesRead = inChannel.read(buf);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
