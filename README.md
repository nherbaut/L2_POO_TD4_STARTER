
# Exercices de Programmation en Java

## Exercice 1 : Longueur des mots

Le but est de concevoir un programme capable de déterminer la longueur de mot la plus fréquente dans un fichier. 
Pour ce faire, il faut compter le nombre de mots de chaque longueur présente dans le fichier. Les mots de 30 caractères ou plus doivent être regroupés. 
Les signes de ponctuation situés au début ou à la fin des mots doivent être ignorés dans le calcul de la longueur.

### Instructions

1. **Créer une classe**  
   Définissez une classe nommée `WordLengths`.

2. **Méthode `countWordLengths`**  
   Implémentez une méthode `void countWordLengths` acceptant deux paramètres :
   - un objet `FileResource` nommé `resource`,
   - un tableau d'entiers `counts`.

   La méthode doit :
   - Parcourir tous les mots du fichier fourni par `resource`.
   - Compter le nombre de mots pour chaque longueur et enregistrer ces valeurs dans le tableau `counts`.
   - Si un mot commence ou se termine par un caractère non alphabétique, ce caractère ne doit pas être pris en compte dans la longueur.
   - Les mots de longueur 30 ou plus doivent être comptabilisés dans la dernière case du tableau `counts`.
   - Utilisez `Character.isLetter` pour déterminer si un caractère est une lettre.

3. **Méthode `testCountWordLengths`**  
   Créez une méthode `void testCountWordLengths` pour tester la méthode précédente. Elle doit :
   - Permettre de sélectionner un fichier via un objet `FileResource`.
   - Initialiser un tableau `counts` d’entiers de taille 31.
   - Appeler `countWordLengths` avec le fichier sélectionné et le tableau `counts`.
   - Afficher les résultats, c'est-à-dire le nombre de mots pour chaque longueur.

4. **Méthode `indexOfMax`**  
   Implémentez une méthode `int indexOfMax` pour retourner l’index correspondant à la longueur de mot la plus fréquente dans le tableau `counts`.

---

## Exercice 2 : Mots dans les fichiers

Écrivez un programme pour déterminer quels mots figurent dans le plus grand nombre de fichiers et, pour chaque mot, 
dans quels fichiers ils apparaissent.

### Instructions

1. **Créer une classe** : Créez une nouvelle classe appelée `WordsInFiles`.

2. **Variable `myMap`** : Déclarez une variable privée `myMap` de type `HashMap<String, ArrayList<String>>` pour stocker 
   le mappage des mots aux noms de fichiers.

3. **Méthode `addWordsFromFile`** : Écrivez une méthode `private void addWordsFromFile(File f)` pour ajouter tous les 
   mots de `f` dans `myMap`.

4. **Méthode `buildWordFileMap`** : Écrivez une méthode `void buildWordFileMap()` qui efface `myMap`, puis utilise 
   `DirectoryResource` pour sélectionner un groupe de fichiers.

5. **Méthode `maxNumber`** : Écrivez la méthode `maxNumber()` pour renvoyer le nombre maximal de fichiers dans 
   lesquels chaque mot apparaît.

6. **Méthode `wordsInNumFiles`** : Écrivez une méthode `wordsInNumFiles(int number)` qui retourne une `ArrayList` 
   de mots apparaissant dans exactement `number` fichiers.

7. **Méthode `printFilesIn`** : Écrivez une méthode `void printFilesIn(String word)` pour afficher les noms des 
   fichiers dans lesquels `word` apparaît.

8. **Méthode `tester`** : Écrivez une méthode `void tester()` qui appelle `buildWordFileMap` pour sélectionner un 
   groupe de fichiers et créer `myMap`.

---
