package fr.pantheonsorbonne.cri;


import java.io.*;
import java.util.*;

/**
 * Write a description of class WordsInFiles here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WordsInFiles {
    // Création d'une variable privée pour stocker un HashMap qui mappe un mot à un
    // ArrayList de noms de fichiers
    private HashMap<String, ArrayList<String>> myMap;

    // Méthode pour initialiser la variable HashMap (constructeur)
    public WordsInFiles() {
        this.myMap = new HashMap<>();
    }

    /*
     * méthode private void addWordsFromFile ayant un paramètre f de type File.
     * Cette méthode devrait ajouter tous les mots de f dans map. Si un mot ne
     * figure pas dans map,
     * vous devez alors créer une nouvelle ArrayList de type String avec ce mot et
     * faire correspondre le mot à cet ArrayList.
     * Si un mot est déjà dans map, ajoutez le nom de fichier actuel à ArrayList,
     * sauf si le nom de fichier figure déjà ArrayList.
     * Vous pouvez utiliser la méthode getName de File pour obtenir le nom du
     * fichier.
     */
    private void addWordsFromFile(File f) {
        FileResource fr = new FileResource(f);
        for (String word : fr.words()) {
      
        }
    }

    /*
     * méthode void nommée buildWordFileMap sans paramètres. Cette méthode efface
     * d'abord map,
     * puis utilise un DirectoryResource pour sélectionner un groupe de fichiers.
     * Pour chaque fichier, il place tous ses mots dans map en appelant la méthode
     * addWordsFromFile.
     */
    private void buildWordFileMap() {
       
    }

    /*
     * Méthode maxNumber sans paramètres. Cette méthode renvoie le nombre maximal de
     * fichiers dans lesquels chaque mot apparaît,
     * en considérant tous les mots d'un groupe de fichiers. Dans l'exemple
     * ci-dessus, quatre fichiers sont pris en compte.
     * Aucun mot n'apparaît dans les quatre fichiers. Deux mots apparaissent dans
     * trois des fichiers,
     * ainsi maxNumber sur ces quatre fichiers renverrait 3.
     */
    private int maxNumber() {
        return 0;
    }

    /*
     * la méthode wordsInNumFiles qui a un paramètre entier appelé number. Cette
     * méthode retourne un ArrayList de mots
     * qui apparaissent exactement selon le nombre des fichiers. Dans l'exemple
     * ci-dessus,
     * l'appel wordsInNumFiles (3) renverrait un ArrayList avec les mots "cats" et
     * "and", et l'appel callInNumFiles (2)
     * renverrait un ArrayList avec les mots "love", "are" et "dogs", tous les mots
     * qui apparaissent dans exactement deux fichiers.
     */
    private ArrayList<String> wordsInNumFiles(int number) {
        return new ArrayList<>();
    }

    /*
     * Méthode void printFilesIn qui a seul un paramètre String nommé word. Cette
     * méthode affiche les noms des fichiers dans
     * lesquels ce mot apparaît. Nous aurons un nom de fichier par ligne. Par
     * exemple, l'appel printFilesIn («cats»)
     * imprimera les trois noms de fichier: brief1.txt, brief3.txt et brief4.txt,
     * chacun sur une ligne distincte.
     */
    private void printFilesIn(String word) {

    }

    /*
     * Méthode void tester qui n'a pas de paramètre. Cette méthode doit appeler
     * buildWordFileMap pour sélectionner un groupe
     * de fichiers et créer un HashMap de mots, , chaque mot étant mappé à un
     * ArrayList de noms de fichiers dans lesquels
     * ce mot apparaît, pour déterminer le nombre maximal de fichiers dans lequel se
     * trouve tout mot. Pour chaque mot, imprimez les
     * filenames des fichiers dans lesquels il se trouve.
     */
    public static void main(String... args) {
        // call buildWordFileMap
        WordsInFiles wif = new WordsInFiles();
        wif.buildWordFileMap();
        System.out.println(" ************* Total Words *************");
        System.out.println("total words: " + wif.myMap.size());

        System.out.println(" ************* Max Number *************");
        System.out.println("maxNumber: " + wif.maxNumber());

        System.out.println(" ************* wordsInNumFiles : words and size  *************");
        System.out.println("words in 1 files = " + wif.wordsInNumFiles(1).size());
        System.out.println("words in 1 files = " + wif.wordsInNumFiles(1).size());
        System.out.println("words in 2 files = " + wif.wordsInNumFiles(2).size());
        System.out.println("words in 3 files = " + wif.wordsInNumFiles(3).size());
        System.out.println("words in 4 files = " + wif.wordsInNumFiles(4).size());

        System.out.println(" ************* printFilesIn *************");
        System.out.println("word for example = cats");
        wif.printFilesIn("cats");
        System.out.println("word for example = Happy");
        wif.printFilesIn("Happy");

        System.out.println(" *************  for each word, print the filenames of the files it is in *************");
        System.out.println(wif.myMap.toString());
    }

}