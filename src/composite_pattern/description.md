# Composite (patron de conception)

En génie logiciel, un patron composite est un patron de conception (design pattern) structurel1. 
Ce patron permet de concevoir une structure arborescente, par exemple une représentation d'un dossier, ses sous-dossiers et leurs fichiers.

# Motivation
En programmation orientée objet, le patron composite propose une structure récursive permettant d'implémenter avec 
la même interface logicielle sur les feuilles et les composites afin qu'ils soient manipulés de la même manière1.

# Structure

- Composant : est l'abstraction pour tous les composants, y compris ceux qui sont composés déclare l'interface pour le comportement par défaut
- Feuille : représente un composant n'ayant pas de sous-éléments implémente le comportement par défaut
- Composite : représente un composant pouvant avoir des sous-élémentsstocke des composants enfants et permet d'y accéder implémente un comportement en utilisant les enfants
- Client :  manipule les objets de la composition à travers l'interface de la classe Composant
- 
La classe composant dérive "composite" et "feuille". Un composite a 0 composants ou plus.

![title]("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e9/Composite_UML_class_diagram_fr.svg/960px-Composite_UML_class_diagram_fr.svg.png")
