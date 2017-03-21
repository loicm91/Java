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
public class Employe extends Personne implements Relation{
    

    //Constructeur Methode
    public void createUser(ArrayList listUsers){
       Scanner sc = new Scanner(System.in);
       System.out.println("Veuillez saisir un prénom et un nom : ");
       this.prenom = sc.nextLine();
       System.out.println("Bonjour " + this.prenom + "!");
       System.out.println("Quel âge as-tu?");
       this.age = sc.nextInt();
       sc.nextLine();
       listUsers.add(this);
    }
    
    public void ajouterPersonnel(String dureeContrat){};
    
    //Mutateurs
  public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

}
