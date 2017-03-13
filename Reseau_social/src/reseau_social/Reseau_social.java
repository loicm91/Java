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
public class Reseau_social {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    Identite personne1 = new Identite("Sergio", "26");    
    personne1.AfficherId();
    
    Scanner sc = new Scanner(System.in);
    ArrayList<String> messageList = new ArrayList<String>();
    ArrayList<String> amiList = new ArrayList<String>();
 
                String choix;
                boolean logout = false; //taper entrer pour quitter
                while (!(logout)){
                    
                    System.out.println("Que souhaitiez-vous faire? \n (Taper 'entrer' pour quitter)");
                    System.out.println("Mon profil");
                    System.out.println("Modifier");
                    System.out.println("Nouveau message");
                    System.out.println("Afficher message");
                    System.out.println("Ajouter ami");
                    System.out.println("Nom ami");
                    
                    choix = sc.nextLine();
                    switch (choix) {
                        case "Mon profil":
                            //personne1.getPrenom() et personne1.getAge() permet de récupérer les informations de la class Identite
                            System.out.println("Tu t'appelles " + personne1.getPrenom() + " et tu as " + personne1.getAge() + "ans.");
                            break;
                        case "Modifier":
                            //On demande si la personne veut modifier la saisie
                            System.out.println("Modifier votre prénom :");
                            String prenom = sc.nextLine();
                            personne1.setPrenom(prenom);
                            break;
                        case "Nouveau message":
                            System.out.println("Veuillez saisir un message");
                            String message = sc.nextLine();
                            messageList.add(message);
                            System.out.println(message);
                            System.out.println(messageList.size());
                            break;
                        case "Afficher message":
                            for (String mail : messageList){
                                 System.out.println(mail);
                            }
                           
                            break;
                        case "Ajouter ami":
                            System.out.println("Veuillez ajouter un ami");
                            String ami = sc.nextLine();
                            amiList.add(ami);
                            System.out.println(ami);
                            System.out.println(amiList.size());
                            break;
                        case "Nom ami":
                            for (String pote : amiList){
                                 System.out.println(pote);
                            }
                            break;   

                        default: 
                            logout = true;

                     } 
                } 
        System.out.println("Au revoir");
    
    }
    
}
