package ru.gb.jcore.lectures.lecture05;

import java.io.File;

public class Ex01 {
    private static String fileName = "resources/lecture05/lecture.txt";


    public static void example01(){
        File file = new File(fileName);
        File folder = new File(".");

        for(File f: folder.listFiles()){
            System.out.println(f.getName());
        }

        System.out.println("Is it a folder - " + folder.isDirectory());
        System.out.println("Is it a file - " + folder.isFile());
        file = new File("file0.txt");
        System.out.println("Length file - " + file.length());
        System.out.println("Absolute path - " + file.getAbsolutePath());
        System.out.println("Absolute file - " + file.getAbsoluteFile());

        System.out.println("Total space on disk - " + folder.getTotalSpace());
        System.out.println("File deleted - " + file.delete());
        System.out.println("file exists - " + file.exists());
        System.out.println("Free space on disk - " + folder.getFreeSpace());
    }

}
