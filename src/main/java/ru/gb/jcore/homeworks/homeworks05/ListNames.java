package ru.gb.jcore.homeworks.homeworks05;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@NoArgsConstructor
@Getter
@Setter
public class ListNames {
    private List<String> names = new ArrayList<>();
    private List<String> maleNames;
    private List<String> femaleNames = new ArrayList<>();
    private String fileMaleName;
    private String fileFemaleName;

    public void add(String name){
        names.add(name);
    }

    private List<String> readFile(String path) throws IOException {
        return Files.readAllLines(Path.of(path));
    }

     public void getListOfNames(int size) throws IOException {
        maleNames = readFile(fileMaleName);
        femaleNames = readFile(fileFemaleName);

        Random random = new Random();
         for (int i = 0; i < size; i++) {
             if(random.nextBoolean()){
                 names.add(maleNames.get(random.nextInt(maleNames.size())));
             } else {
                 names.add(femaleNames.get(random.nextInt(femaleNames.size())));
             }
         }
         System.out.println(names);
    }
}
