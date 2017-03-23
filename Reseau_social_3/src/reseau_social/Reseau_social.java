/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reseau_social;


import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author loic.maupin
 */
public class Reseau_social {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    
        ArrayList<Employe> listUsers = new ArrayList<Employe>();
        
        int level = 0;
        Scanner sc = new Scanner(System.in);
        char reponse = 'O';
        char answer = 'Y'; 
        Menu displayMenu = new Menu();
    
  do{
        System.out.println("Êtes-vous membre de l'entreprise ? (O/N)");
        char reponse1 = 'O';
        reponse1 = sc.nextLine().charAt(0);      

        if (reponse1 == 'O'){
            
            char reponse2 = 'O';
            do{
                displayMenu.menuEmploye();
                int choix = sc.nextInt();
                sc.nextLine();//Permet de réinitialiser la ligne après un nextInt pour que la boucle puisse fonctionner

                switch(choix){
                    case 1 :
                        Developpeur dev = new Developpeur();
                        dev.createUser(listUsers);
                        dev.travailler();
                        System.out.println("\nSouhaitez-vous recevoir votre paiement? (O/N)");
                        sc = new Scanner(System.in);
                        reponse = sc.nextLine().charAt(0);
                        dev.recevoirPaiement();
                        break;
                    case 2 : 
                        Marketeur market = new Marketeur();
                        market.createUser(listUsers);
                        market.travailler();
                        System.out.println("\nSouhaitez-vous recevoir votre paiement? (O/N)");
                        sc = new Scanner(System.in);
                        reponse = sc.nextLine().charAt(0);
                        market.recevoirPaiement();
                        break;
                    case 3 :
                        Directeur boss = new Directeur();
                        System.out.println("Bonjour Monsieur, \nQue souhaitez-vous faire?");
                        displayMenu.menuDirecteur();
                        boss.choixDirecteur(listUsers);
                        break;
                    default : 
                        System.out.println("Vous êtes un simple employé");
                }
            }while(reponse2 == 'O');  
        }else{
          do
          {         System.out.println("Êtes-vous modérateur? O/N");
                    sc = new Scanner(System.in);
                    reponse = sc.nextLine().charAt(0);
                    Utilisateur user;
                    if (reponse == 'O'){

                       System.out.println("Quel niveau êtes-vous? ");
                       level = sc.nextInt();
                       sc.nextLine();
                       user = new Moderateur(level); //On a un modérateur que l'on a casté
                       System.out.println("Vous êtes un modérateur de niveau " + level);

                    }else{
                        user = new Moderateur();              
                        //On a un user simple
                        System.out.println("Vous êtes un simple utilisateur");

                    }

                    do{
                        user.createUser();
                        System.out.println("Créer un autre utilisateur ? (Y/N)");
                        answer = sc.nextLine().charAt(0);
                    }
                    while (answer == 'Y');

                            boolean logout = false; //taper entrer pour quitter
                            while (!(logout)){

                                displayMenu.afficherMenu(user); //c'est le user créé qui accède au menu, d'où le personne1

                                //Faire un choix dans le menu

                                logout = displayMenu.ChoixMenu(sc, user);
                            } 



             }while(displayMenu.reStart(sc) == 'O' ); 

        }   
    }while(displayMenu.reStartAgain(sc) == 'O');
  
        System.out.println("Au revoir");
}
    
}
