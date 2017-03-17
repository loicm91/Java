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
    public void afficherMenu(Identite user){
        
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
    
    public boolean ChoixMenu(Scanner sc, Identite personne1) {
    boolean logout = false;
    String choix;
    choix = sc.nextLine();
    switch (choix) {
        case "A":
            System.out.println(personne1);
            break;
        case "B":
            personne1.update(sc);
            break;
        case "C":
            personne1.createMessage(sc);
            break;
        case "D":
            personne1.displayMessageUser();
            break;
        case "E":         
            personne1.addFriend(sc);
            break;
        case "F":
            personne1.displayFriend();
            break;
        case "G":
            personne1.updateMessage(sc);            
            break;
        case "H":
            String user;          
            if (personne1.getClass().getName().contains("Moderateur"))
            {
                System.out.println("Voici la liste des utilisateur:");
                //afficher tous les users
                personne1.displayUsers();
                //demander choisir l'utilisateur pour lequel il veut supprimer un message
                System.out.println("Choisissez un utilisateur :");
                sc.nextLine();
                user = sc.nextLine();//reparcourir le tableau des users avec les indices
                //afficher la liste des messages de cet utilisateur
                personne1.afficherMessages(user);
                //demander quel message il veut supprimer
                System.out.println("Quel message voulez-vous supprimer ?");
                //supprimer le message
                personne1.displayMessageUser();
                int indiceMessage = sc.nextInt();
                personne1.allMessages.remove(indiceMessage);
                System.out.println("\n Vous venez de supprimer un message !");
                personne1.displayMessageUser();   
            }
            else
            {
                //afficher la liste de mes messages
                personne1.displayMessageUser();
                //demander quel message il veut supprimer
                System.out.println("Quel message voulez-vous supprimer ?");
                // supprimer le message
                int indiceMessage = sc.nextInt();
                personne1.listMessage.remove(indiceMessage);
                System.out.println("\n Vous venez de supprimer un message !");
                personne1.displayMessageUser();
                
            }
            break;   
        case "I":
            if (personne1.getClass().getName().contains("Moderateur") && ((Moderateur)personne1).getLevel() == 2)
            {
                 System.out.println("Voici la liste des utilisateur:");
                //afficher tous les users
                personne1.displayUsers();
                
                // demander choisir lequel il veut supprimer
                System.out.println("Choisissez un utilisateur :");
                sc.nextLine();
                user = sc.nextLine();
                
                // supprimer le user choisi               
                int indiceUser = sc.nextInt();
                personne1.listUsers.remove(indiceUser);
                System.out.println("\n Vous venez de supprimer un utilisateur !");
                personne1.displayUsers();
            }
            break;
        
        default: 
            logout = true;

    } 
    
    System.out.println("\n");
    return logout;    

    }
 
     public char newUser(Scanner sc){
        System.out.println("Voulez vous recommencer? (O/N)");
        return sc.nextLine().charAt(0);
     }
}
