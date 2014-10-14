zMarkdown-Editor
================

Un éditeur **Hors ligne** et multiplateforme pour les tutoriels de Zeste De Savoir.

### Fonctionnalités

- La rédaction de vos tutoriels en <strong>hors ligne</strong>, c'est à dire sans avoir besoin d'une connexion internet
- Support de la syntaxe [zMarkdown](https://github.com/zestedesavoir/Python-ZMarkdown)
- La prévisualisation instantanée des modifications du texte
- La navigation dans le sommaire d'un tutoriel sous forme d'arbre
- La personnalisation de l'éditeur selon vos gouts(police d'écriture, couleur de texte, couleur de fond, look and feel)
- Les boutons d'aide à la rédaction (gras, italique, listes, touches, etc.)
- Le téléchargement des archives des tutoriels publiés

### Dépendances logicielles
 - Java 1.6 et plus


### Utilisation

Pour lancer l'application, allez dans le dossier store du projet et double-cliquez sur `ZestEditor.jar`

![](http://zestedesavoir.com/media/galleries/817/c80d5aa4-a0e0-481e-8e57-9c716beb83b2.png)
![](http://zestedesavoir.com/media/galleries/817/81909c77-21c8-44fd-a832-458d4cfa414d.png)
![](http://zestedesavoir.com/media/galleries/817/580475cd-cf19-4b66-ab11-217129343161.png)

Ensuite pour découvrir,
- Télécharger l'archive d'un tutoriel en ligne sur [zestedesavoir](http://zestedesavoir.com), en allant sur le tutoriel en question, et dans la barre de gauche en bas, vous avez un lien "Archive".
- Dézippez l'archive que vous venez de télécharger
- Allez sur l'application et faites `Fichier` -> `Ouvrir` , puis sélectionnez le répertoire de votre tutoriel
- Vous voilà maintenant capable de parcourir votre document.

### Developpement

Le programme est réalisé essentiellement en langage Java, il s'appuie sur la bibliothèque Jython pour faire appel au parseur zMarkdown utilisé pour le site internet, pour éviter de le réecrire. L'avantage est donc que zMarkdown-Editor pourra bénéficier des mises à jour du dépot [zMarkdown](https://github.com/zestedesavoir/Python-ZMarkdown) automatiquement.

La partie interface est basé sur la bibliothèque **Swing** appelant le look and feel natif de votre système d'exploitation. On utilise aussi le *Pattern Observer* pour réaliser les mises à jour d'interface.

Bonne découverte.
