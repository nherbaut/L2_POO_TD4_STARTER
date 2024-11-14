
# Exercices de Programmation en Java

## Exercice 1 : Longueur des mots

Vous allez écrire un programme pour déterminer la longueur de mot la plus courante des mots d'un fichier. 
Pour résoudre ce problème, vous devez connaître le nombre de mots d'un fichier de chaque longueur possible. 
Vous devez regrouper tous les mots de longueur égale ou supérieure à 30 et ne pas compter les signes de 
ponctuation de base constituant le premier ou le dernier caractère d'un groupe de caractères.

### Instructions

1. **Créer une classe** : Créez une nouvelle classe appelée `WordLengths`.

2. **Méthode `countWordLengths`** : Écrivez une méthode `void`, `countWordLengths`, qui comporte deux paramètres :
   - un `FileResource` nommé `resource`
   - un tableau d'entiers nommé `counts`.

   Cette méthode doit lire les mots de la ressource et compter le nombre de mots de chaque longueur pour 
   tous les mots de la ressource, en enregistrant ces nombres dans le tableau `counts`.

   - Par exemple, après l'exécution de cette méthode, `counts[k]` doit contenir le nombre de mots de longueur `k`.
   - Si un mot a une non-lettre comme premier ou dernier caractère, il ne doit pas être compté dans la longueur du mot.
   - Comptez les mots de longueur égale ou supérieure à 30 comme la plus grande taille représentée dans le tableau `counts`.
   - Utilisez la méthode `Character.isLetter` pour vérifier si un caractère est une lettre.

3. **Méthode `testCountWordLengths`** : Écrivez une méthode `void testCountWordLengths` qui :
   - crée un `FileResource` pour sélectionner un fichier.
   - crée un tableau `counts` d'entiers de taille 31.
   - appelle `countWordLengths` avec un fichier, puis imprime le nombre de mots de chaque longueur.

4. **Méthode `indexOfMax`** : Écrivez une méthode `indexOfMax` qui retourne l'index de la longueur de mot la plus courante.

### Exemple

Pour le fichier `smallHamlet.txt` :
- Mots de longueur 2 : My, as
- Mots de longueur 3 : are, And, the
- Mots de longueur 4 : Laer, give
- Mots de longueur 5 : winds
- Mots de longueur 6 : sister
- Mots de longueur 7 : benefit
- Mots de longueur 8 : embark’d, Farewell
- Mots de longueur 11 : necessaries

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
