zMarkdown-Editor
================

Un éditeur **Hors ligne** pour les tutoriels de Zeste De Savoir.

### Fonctionnalités

- Navigation dans la structure d'un tutoriel (big ou mini)
- Edition avec prévisualisation instantanée du rendu markdown
- Support de la syntaxe [zMarkdown](https://github.com/zestedesavoir/Python-ZMarkdown)
- Style du site ZesteDeSavoir

### Dépendances logicielles
 - Python 2.7
 - Java 1.6 et plus

### Utilisation

Pour lancer l'application, allez dans le dossier dist du projet et :

- Sur Windows : lancez `run.bat`
- Sur Linux/MacOs : lancez `run.sh`

Ensuite pour découvrir,
- Télécharger l'archive d'un tutoriel en ligne sur [zestedesavoir](http://zestedesavoir.com), en allant sur le tutoriel en question, et dans la barre de gauche en bas, vous avez un lien "Archive".
- Dézippez l'archive que vous venez de télécharger
- Allez sur l'application et faites `Fichier` -> `Ouvrir` , puis sélectionnez le répertoire de votre tutoriel
- Vous voilà maintenant capable de parcourir votre document.

### Developpement

Le programme est réalisé essentiellement en langage Java, il s'appuie sur la bibliothèque Jython pour faire appel au parseur zMarkdown utilisé pour le site internet, pour éviter de le réecrire. L'avantage est donc que zMarkdown-Editor pourra bénéficier des mises à jour du dépot [zMarkdown](https://github.com/zestedesavoir/Python-ZMarkdown) automatiquement.

La partie interface est basé sur la bibliothèque **Swing** appelant le look and feel natif de votre système d'exploitation. On utilise aussi le *Pattern Observer* pour réaliser les mises à jour d'interface.

Bonne découverte.
