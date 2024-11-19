package fr.pantheonsorbonne.cri;

import java.io.BufferedReader;
import java.io.File;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import java.util.List;

public class FileResource {
    private List<String> words = new ArrayList<>();

    public FileResource(String fileName) {
        this(new File(fileName));
    }

    public FileResource(File fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {

            String line = reader.readLine();
            while (line != null) {
                String[] words = line.split(" ");
                for (String word : words) {
                    //String filteredWord = word.replaceAll("[^a-zA-Z]", "");
                    String filteredWord = word;
                    if (filteredWord.length() > 0) {
                        this.words.add(filteredWord);
                    }
                }
                line = reader.readLine();
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public Iterable<String> words() {
        List<String> arrayList = new ArrayList<>();
        arrayList.addAll(this.words);
        return arrayList;
    }

}
