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
public class Directeur extends Employe implements Relation{
    
    //Attribut
    
    
    //Constructeur
    public Directeur(){
        
    }
    
    public Directeur(String pPrenom, int pAge){
        this.prenom = pPrenom;
        this.age = pAge;
    }
    
    //Methode
    public void travailler(){
        System.out.println("Je suis un directeur, je m'occupe des employés");
    }

    public void choixDirecteur(ArrayList<Employe> listUsers){

        Scanner sc = new Scanner(System.in);
        int wish = sc.nextInt();
        sc.nextLine();
        switch(wish){
            case 1 :
                ajouterPersonnel(dureeContrat);
                break;
            case 2 :
                System.out.println("Virer un employé");
                break;
            case 3 :
                //Afficher les employés
                System.out.println("Choisissez un utilisateur :");
                //Choisir l'employé;
                displayEmploye(listUsers);
                String user = sc.nextLine();
                System.out.println("Vous venez de payer " + user);
                break;
            default :
                System.out.println("À bientôt");
        }
    }
    
    /**
     *
     * @param dureeContrat
     *      dureeContrat renvoie la durée du contrat saisie par le directeur
     */
    @Override
    public void ajouterPersonnel(String dureeContrat){
        Scanner sc = new Scanner(System.in);
        System.out.println("Embaucher pour une durée de ?");
        dureeContrat = sc.nextLine();
        System.out.println("J'embauche pour une durée de " + dureeContrat);
        
    }
    
    public void displayEmploye(ArrayList<Employe> listUsers){

        for (Employe workers : listUsers){
            System.out.println(workers.getPrenom());
       }             
    }

   
}

        