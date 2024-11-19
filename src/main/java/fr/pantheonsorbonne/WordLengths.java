package fr.pantheonsorbonne;

import fr.pantheonsorbonne.cri.FileResource;

public class WordLengths {

    // Méthode pour compter les longueurs des mots
    public void countWordLengths(FileResource resource, int[] counts) {

      
    }

    // Méthode pour calculer la longueur d'un mot en excluant les caractères non
    // alphabétiques
    private int getWordLength(String word) {
        return 0;
    }

    // Méthode pour tester countWordLengths
    public void testCountWordLengths(String filename) {
        FileResource resource = new FileResource(filename); // Permet de sélectionner un fichier
        int[] counts = new int[31]; // Tableau pour les longueurs (jusqu'à 30 inclus)
        countWordLengths(resource, counts);
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > 0) {
                System.out.println("Longueur " + i + ": " + counts[i] + " mot(s)");
            }
        }
        int mostCommonLength = indexOfMax(counts);
        System.out.println("La longueur de mot la plus fréquente est : " + mostCommonLength);
    }

    // Méthode pour trouver l'index de la longueur la plus fréquente
    public int indexOfMax(int[] counts) {
        return 0;
    }

    // Méthode principale pour exécuter le programme
    public static void main(String[] args) {
        WordLengths wl = new WordLengths();
        wl.testCountWordLengths("java.txt");
    }
}