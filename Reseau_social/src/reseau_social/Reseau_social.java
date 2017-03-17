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
public class Reseau_social {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
  
      int level = 0;
      Scanner sc = new Scanner(System.in);
      char reponse = 'O';
      char answer = 'Y';
      Menu displayMenu = new Menu();
      
      do
      {         System.out.println("Êtes-vous modérateur? O/N");
                sc = new Scanner(System.in);
                reponse = sc.nextLine().charAt(0);
                Identite personne1;
                if (reponse == 'O'){

                   System.out.println("Quel niveau êtes-vous? ");
                   level = sc.nextInt();
                   sc.nextLine();
                   personne1 = new Moderateur(level); //On a un modérateur que l'on a casté
                   System.out.println("Vous êtes un modérateur de niveau " + level);

                }else{
                    personne1 = new Identite();//On a un user simple
                    System.out.println("Vous êtes un simple utilisateur");

                }
                
                do{
                    personne1.createUser(sc);
                    System.out.println("Créer un autre utilisateur ? (Y/N)");
                    answer = sc.nextLine().charAt(0);
                }
                while (answer == 'Y');
                
                        boolean logout = false; //taper entrer pour quitter
                        while (!(logout)){
                            
                            displayMenu.afficherMenu(personne1); //c'est le user créé qui accède au menu, d'où le personne1
                          
                            //Faire un choix dans le menu
                            
                            logout = displayMenu.ChoixMenu(sc, personne1);
                        } 

                
                
         }while(displayMenu.newUser(sc) == 'O' ); 
         
        
                
         System.out.println("Au revoir");
    }
    
}
