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
    public void AfficherMenu(){
        
        System.out.println("Que souhaitiez-vous faire? \n (Taper 'entrer' pour quitter)");
        System.out.println("Mon profil");
        System.out.println("Modifier");
        System.out.println("Nouveau message");
        System.out.println("Afficher message");
        System.out.println("Ajouter ami");
        System.out.println("Nom ami");
        
    }
    
     public boolean ChoixMenu(Scanner sc, Identite personne1) {
    boolean logout = false;
    String choix;
    choix = sc.nextLine();
    switch (choix) {
        case "Mon profil":
            personne1.display();
            break;
        case "Modifier":
            personne1.update(sc);
            break;
        case "Nouveau message":
            personne1.createMessage(sc);
            break;
        case "Afficher message":
           personne1.displayMessage();
            break;
        case "Ajouter ami":
            personne1.addFriend(sc);
            break;
        case "Nom ami":
            personne1.displayFriend();
            break;   

        default: 
            logout = true;

     } 
    return logout;   
    
    }
}
