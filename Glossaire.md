#Glossaire :

##Class Main :
La class principale qui ne possède qu'une méthode pour un nouveau projet.

##Constructeur:
Le constructeur est une méthode d'instance qui va se charger de créer un objet et, 
le cas échéant, d'initialiser ses variables de classe ! Cette méthode a pour rôle de signaler à la JVM (Java Virtual Machine) 
qu'il faut réserver de la mémoire pour notre futur objet et donc, par extension, d'en réserver pour toutes ses variables.

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
##Javadoc :
La Javadoc permet en commentant son code, de pouvoir le partager à d'autres personnes avec des instructions et des définitions qui facilitent la compréhension du programme/projet.

====>["Javadoc OpenClassRooms"](https://openclassrooms.com/courses/presentation-de-la-javadoc)
