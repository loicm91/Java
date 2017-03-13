/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reseau_social;


/**
 *
 * @author loic.maupin
 */
 
public class Identite {

//Attributs
    String prenom;
    String age;
    
    /**
    *Constructeur
    * Rempli les champs prénom et âge de l'utilisateur
    * @param val1 
    *   correspond au prénom 
    * @param val2 
    *   correspond à l'age
    */ 
    public Identite(String val1, String val2){ 
        prenom = val1;
        age = val2;
    }
    
    //Methode
    public void AfficherId(){
       System.out.println("Veuillez saisir un prénom et un nom : ");
       System.out.println("Bonjour " + prenom + "!");
    }
    
    //*************   MUTATEURS   *************
    //Getter et Setter
    public String getPrenom() {
        return prenom;
    }
  
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
