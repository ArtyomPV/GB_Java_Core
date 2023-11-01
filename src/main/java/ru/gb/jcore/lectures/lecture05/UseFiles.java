package ru.gb.jcore.lectures.lecture05;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

public class UseFiles {

    public static void runFiles() throws IOException {
        Path file = Files.createFile(Paths.get("./pics/file.txt"));
        System.out.println("Was the file captured successfully in pics directory? ");
        System.out.println(Files.exists(Paths.get("./pics/file.txt")));

        Files.createDirectory(Paths.get("./testing"));
        System.out.print("Was the test directory created successfully? ");
        System.out.println(Files.exists(Paths.get("./testing")));
        file = Files.move(file, Paths.get("./testing/file.txt"),
                REPLACE_EXISTING);
        System.out.print("Is our file still in the pics directory? ");
        System.out.println(Files.exists(Paths.get("./pics/file.txt")));
        System.out.print("Has our file been moved to testDirectory? ");
        System.out.println(Files.exists(Paths.get("./testing/file.txt")));
        Path copyFile = Files.copy(file, Paths.get("./pics/file.txt"),
                REPLACE_EXISTING);
        System.out.print("Has our file been copied to pics directory? ");
        System.out.println(Files.exists(Paths.get("./pics/file.txt")));
        Files.delete(file);
        System.out.print("Does the file exist in test directory? ");
        System.out.println(Files.exists(Paths.get("./testing/file.txt")));
        System.out.print("Does the test directory exist? ");
        System.out.println(Files.exists(Paths.get("./testing")));

    }

    public static  void useFiles() throws IOException {
        List<String> newLines = new ArrayList<>();
        List<String> lines = Arrays.asList(
                "The cats wants to play with you",
                "But you don't want to play with it"
        );
        Path file = Files.createFile(Paths.get("cat.txt"));
        if(Files.exists(file)){
            Files.write(file, lines, StandardCharsets.UTF_8);
            newLines = Files.readAllLines(
                    Paths.get("cat.txt"), StandardCharsets.UTF_8);

            for(String s : newLines) System.out.println(s);
        }
    }
}
