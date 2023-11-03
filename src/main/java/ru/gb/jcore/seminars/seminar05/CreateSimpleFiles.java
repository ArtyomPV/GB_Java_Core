package ru.gb.jcore.seminars.seminar05;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class CreateSimpleFiles {
    private static final Random random = new Random();
    private static final int CHAR_BOUND_L = 65;
    private static final int CHAR_BOUND_H = 90;
    private static final int FILES_AMOUNT = 10;
    private static final int WORDS_AMOUNT = 5;
    private static final int WORD_LENGTH = 10;
    private static final String WORD_TO_SEARCH = "geekbrains";

    static String[] fileNames = new String[FILES_AMOUNT];

    public static void run() {
        for (int i = 0; i < fileNames.length; i++) {
            fileNames[i] = "file" + i + ".txt";
        }

        try {
            for (int i = 0; i < fileNames.length; i++) {
                if (i < 2) {
                    writeFileContent(fileNames[i], 100);
                } else {
                    writeFileContent(fileNames[i], WORDS_AMOUNT);
                    System.out.println("First task results are in file_0 and file_1");
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try{
            concatenate(fileNames[0], fileNames[1], "FILE_OUT.txt" );
            System.out.println("Second task result is in FILE_OUT");
        } catch(IOException e){
            throw new RuntimeException(e);
        }
    }

    public static String generateSymbol(int amount) {
        StringBuilder sequence = new StringBuilder();
        for (int i = 0; i < amount; i++) {
            sequence.append((char) CHAR_BOUND_L + random.nextInt(CHAR_BOUND_H - CHAR_BOUND_L));
        }
        return sequence.toString();
    }

    private static void writeFileContent(String fileName, int length) throws IOException {
        FileOutputStream fos = new FileOutputStream(fileName);
        fos.write(generateSymbol(length).getBytes());
        fos.flush();
        fos.close();
    }

    private static void concatenate(String file_in1, String file_in2,String file_out) throws IOException {
        FileOutputStream fos = new FileOutputStream(file_out);
        int ch;
        FileInputStream fis = new FileInputStream(file_in1);
        while((ch=fis.read()) != -1){
            fos.write(ch);
        }
        fis.close();

        fis = new FileInputStream(file_in2);
        while((ch=fis.read()) != -1){
            fos.write(ch);
        }
        fis.close();

        fos.flush();
        fos.close();
    }


}
