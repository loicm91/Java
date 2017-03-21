/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reseau_social;

import java.util.Scanner;

/**
 *
 * @author loic.maupin
 */
public class Menu {
    
    //Methode Afficher le Menu
    public void afficherMenu(Utilisateur user){
        
        System.out.println("Que souhaitiez-vous faire? \n (Taper 'entrer' pour quitter)");
        System.out.println("Mon profil \t\t tapez A");
        System.out.println("Modifier \t\t tapez B");
        System.out.println("Nouveau message \t tapez C");
        System.out.println("Afficher message \t tapez D");
        System.out.println("Ajouter ami \t\t tapez E");
        System.out.println("Nom ami \t\t tapez F");
         
       if (user.getClass().getName().contains("Moderateur") && user.getLevel() == 1 || user.getLevel() == 2 )//Ici pas besoin de caster car le Moderateur connait l'Identité mais pas l'inverse...
           //Donc pour faire simple on met la méthode getLevel() dans Identité et on le met à Zéro.
            System.out.println("Modifier message \t tapez G");
            System.out.println("Supprimer message \t tapez H");
            
        //Ici on veut afficher la class du user créé 
        //System.out.println(user.getClass().getName());
        //Condition qui récupère le nom de la class du user créé, et le compare avec son niveau (getLevel())
        //Elle affiche cette option si et seulement si le modérateur est de niveau 2
       if (user.getClass().getName().contains("Moderateur") && ((Moderateur)user).getLevel() == 2)
            System.out.println("Supprimer users \t tapez I");    
    }
    
    
    public boolean ChoixMenu(Scanner sc, Utilisateur user) {
        boolean logout = false;
        String choix;
        choix = sc.nextLine();
        switch (choix) {
            case "A":
                System.out.println(user);
                break;
            case "B":
                user.update(sc);
                break;
            case "C":
                user.createMessage(sc);
                break;
            case "D":
                user.displayMessageUser();
                break;
            case "E":         
                user.addFriend(sc);
                break;
            case "F":
                user.displayFriend();
                break;
            case "G":
                user.updateMessage(sc);            
                break;
            case "H":
                if (user.getClass().getName().contains("Moderateur"))
                {
                    ((Moderateur)user).supprimerMessages(sc);
                }
                else
                {
                    user.deleteMessages(sc);
                }
                break;   
            case "I":
                if (user.getClass().getName().contains("Moderateur") && ((Moderateur)user).getLevel() == 2)
                {
                    ((Moderateur)user).deleteUser(sc);
                }
                break;

            default: 
                logout = true;

        } 

        System.out.println("\n");
        return logout;    
    }
 
     public char reStart(Scanner sc){
        System.out.println("Voulez vous recommencer? (O/N)");
        return sc.nextLine().charAt(0);
     }
     
     //Menu employé
     public void menuEmploye(){
        System.out.println("Vous êtes un développeur ? \t Tapez 1");
        System.out.println("Vous êtes un marketeur ? \t tapez 2");
        System.out.println("Vous êtes le directeur ? \t tapez 3");
        System.out.println("Sinon tapez 'entrer' si vous est un simple employé");         
     }
     
     //Menu du directeur
     public void menuDirecteur(){
        System.out.println("Embaucher \t Tapez 1");
        System.out.println("Virer \t\t tapez 2");
        System.out.println("Payer \t\t tapez 3");
        System.out.println("Quitter en appuyant '0' ");
     }
     

}
