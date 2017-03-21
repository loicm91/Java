/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reseau_social;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author loic.maupin
 */
public class Moderateur extends Utilisateur implements Relation{
    
   private int level;

    //Constructeur d'initialisation du modérateur par défaut
     public Moderateur(){
        super();
    } 
     
    //Constructeur d'initialisation du modérateur
    public Moderateur(String pPrenom, int pAge, int pLevel ) 
    {
            this.prenom = pPrenom;
            this.age = pAge;
            level = pLevel;
    }

    Moderateur(int level) {
    }
    
   

    public int getLevel() {
        return level;
    }

    /**
     *
     * @param level correspond au level tapé par utilisateur
     */
 
    public void setLevel(int level) {
        this.level = level;
    } 
    
    public String toString()
    {
        //personne1.getPrenom() et personne1.getAge() permet de récupérer les informations de la class Identite
        return (super.toString() + "\n Tu es un modérateur de niveau" + level);
    }

     /*public void seConnecter(Scanner sc) {
        System.out.println("Souhaitez-vous vous connecter ? (O/N)");
        String reponse = sc.nextLine();
    }

    public void seDeconnecter(Scanner sc) {
        System.out.println("Souhaitez-vous vous déconnecter ? (O/N)");
        String reponse = sc.nextLine();
    }*/

    public void supprimerMessages(Scanner sc){
        System.out.println("Voici la liste des utilisateur:");
        //afficher tous les users
        displayUsers();
        //demander choisir l'utilisateur pour lequel il veut supprimer un message
        System.out.println("Choisissez un utilisateur :");
        sc.nextLine();
        String user1 = sc.nextLine(); //reparcourir le tableau des users avec les indices
        //afficher la liste des messages de cet utilisateur
        afficherMessages(user1);
        //demander quel message il veut supprimer
        System.out.println("Quel message voulez-vous supprimer ?");
        //supprimer le message
        displayMessageUser();
        int indiceMessage = sc.nextInt();
        listMessage.remove(indiceMessage);
        System.out.println("\n Vous venez de supprimer un message !");
        displayMessageUser();          
       
    }
    
    public void deleteUser(Scanner sc){
        System.out.println("Voici la liste des utilisateur:");
        //afficher tous les users
        displayUsers();

        // demander choisir lequel il veut supprimer
        System.out.println("Choisissez un utilisateur :");
        sc.nextLine();
        String user1 = sc.nextLine();

        // supprimer le user choisi               
        int indiceUser = sc.nextInt();
        listUsers.remove(indiceUser);
        System.out.println("\n Vous venez de supprimer un utilisateur !");
        displayUsers();
    }
    
}
