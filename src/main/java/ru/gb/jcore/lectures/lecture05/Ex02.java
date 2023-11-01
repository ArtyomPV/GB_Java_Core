package ru.gb.jcore.lectures.lecture05;

import java.io.IOException;
import java.net.URI;
import java.nio.file.*;

public class Ex02 {
    /**
     * Paths, Path, Files, FileSystem
     */

    /**
     *        🔥URI – Uniform Resource Identifier (унифицированный идентификатор
     *      * ресурса);
     *      * 🔥URL – Uniform Resource Locator (унифицированный определитель
     *      * местонахождения ресурса);
     *      * 🔥URN – Unifrorm Resource Name (унифицированное имя ресурса).
     */
public static void ex02(){
    Path filePath = Paths.get("pics/logo.png");

    Path fileName = filePath.getFileName();
    System.out.println("File name - " + fileName);

    Path parent = filePath.getParent();
    System.out.println("Parent directory: " + parent);

    boolean endWithTxt = fileName.endsWith("logo.png");
    System.out.println("Ends with filepath - " + endWithTxt);
    endWithTxt = fileName.endsWith("png");
    System.out.println("Ends with string - " + endWithTxt);
    boolean startWithPics = fileName.startsWith("pics");
    System.out.println("Starts with filepath: " + startWithPics);
}

public static void listing5(){
    Path path = Paths.get("./sources-draft/../pics/logo.png");
    System.out.println(path);
    System.out.println(path.normalize());

}
}
