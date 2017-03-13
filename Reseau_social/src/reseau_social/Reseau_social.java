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
    Scanner sc = new Scanner(System.in);
        //Affiche L'identité depuis la class Identite
    Identite personne1 = new Identite("Sergio", "26");    
    personne1.AfficherId();
    
    
 
                
                boolean logout = false; //taper entrer pour quitter
                while (!(logout)){
                    
                    //Affiche le menu depuis une class Menu
                    Menu displayMenu = new Menu();
                    displayMenu.AfficherMenu();
                    
                    //Faire un choix
                    logout = displayMenu.ChoixMenu(sc, personne1);
                    
                } 
        System.out.println("Au revoir");
    
    }
    
}
