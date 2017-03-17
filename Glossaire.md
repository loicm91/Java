# Glossaire :

## Class Main :
La class principale qui ne possède qu'une méthode pour un nouveau projet.

## Constructeur:
Le constructeur est une méthode d'instance qui va se charger de créer un objet et, 
le cas échéant, d'initialiser ses variables de classe ! Cette méthode a pour rôle de signaler à la JVM (Java Virtual Machine) 
qu'il faut réserver de la mémoire pour notre futur objet et donc, par extension, d'en réserver pour toutes ses variables.

Exemple :

```
public class Ville {
 
  //Stocke le nom de notre ville
  String nomVille;
  //Stocke le nom du pays de notre ville
  String nomPays;
  //Stocke le nombre d'habitants de notre ville
  int nbreHabitants;
 
  //Constructeur par défaut
  public Ville(){
    System.out.println("Création d'une ville !");          
    nomVille = "Inconnu";
    nomPays = "Inconnu";
    nbreHabitants = 0;
  }
 
  //Constructeur avec paramètres
  //J'ai ajouté un « p » en première lettre des paramètres.
  //Ce n'est pas une convention, mais ça peut être un bon moyen de les repérer.
  public Ville(String pNom, int pNbre, String pPays)
  {
    System.out.println("Création d'une ville avec des paramètres !");
    nomVille = pNom;
    nomPays = pPays;
    nbreHabitants = pNbre;
  }        
```
## Javadoc :
La Javadoc permet en commentant son code, de pouvoir le partager à d'autres personnes avec des instructions et des définitions qui facilitent la compréhension du programme/projet.

====>[Javadoc OpenClassRooms](https://openclassrooms.com/courses/presentation-de-la-javadoc)

Pour Générer la Javadoc sous NetBeans : cliquez sur Run->Generate Javadoc (nom du projet).
Cela ouvre une page internet avec la javadoc interprétée.

Exemple : 

```
 /**
    *Constructeur
    * Rempli les champs prénom et âge de l'utilisateur
    * @param pPrenom 
    *   correspond au prénom 
    * @param pAge 
    *   correspond à l'age
    */ 
    public Identite(){
        
    }
    
    public Identite(String pPrenom, String pAge){ 
        prenom = pPrenom;
        age = pAge;
    }
```
## Public / Private

#### Mettre en private les attributs permet de gérer les entrées données, sinon les attributs sont manipulables n'importe comment.
Ainsi, grâce aux accesseurs (getter et setter), on passe les données entrées dans des méthodes qui les vérifient.

Aussi pour éviter de tout changer, on va solliciter la "modularisation", qui permet de faire de modifications indépendantes.

## Héritage
La notion d'héritage est un des fondements de la programmation orienté objet. On peut créer des classes héritées qui vont prendre toutes les propriétés des classes mères. Autrement dit, elle va hériter du comportement de sa mère.
Tout ça grâce à "extends" et peut aussi faire appel aux variables de la classe mère dans nos constructeurs grâce au mot clé "super": 

```
class Capitale extends Ville {
 
  private String monument;
 
  //Constructeur par défaut
  public Capitale(){
    //Ce mot clé appelle le constructeur de la classe mère  
    super();
    monument = "aucun";
  }
}
```

## Void :
Utiliser dans la déclaration d'une méthode qui ne renvoi rien.
