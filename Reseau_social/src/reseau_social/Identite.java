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
 
public class Identite {

//Attributs
    String prenom;
    String age;
    ArrayList<String> messageList = new ArrayList<String>();
     ArrayList<String> amiList = new ArrayList<String>();

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
    public ArrayList<String> getMessageList() {
        return messageList;
    }

    public void setMessageList(ArrayList<String> messageList) {
        this.messageList = messageList;
    }

    public ArrayList<String> getAmiList() {
        return amiList;
    }

    public void setAmiList(ArrayList<String> amiList) {
        this.amiList = amiList;
    }
    
    public void display()
    {
        //personne1.getPrenom() et personne1.getAge() permet de récupérer les informations de la class Identite
            System.out.println("Tu t'appelles " + getPrenom() + " et tu as " + getAge() + "ans.");
    }
    
    public void update(Scanner sc)
    {
        //On demande si la personne veut modifier la saisie
            System.out.println("Modifier votre prénom :");
            String prenom = sc.nextLine();
            setPrenom(prenom);
    }
    
     public void createMessage(Scanner sc)
    {
        System.out.println("Veuillez saisir un message");
            String message = sc.nextLine();
            getMessageList().add(message);
            System.out.println(message);
            System.out.println(getMessageList().size());
    }
     
     public void displayMessage()
     {
          for (String mail : getMessageList()){
                 System.out.println(mail);
            }
     }
     public void addFriend(Scanner sc)
     {
        System.out.println("Veuillez ajouter un ami");
            String ami = sc.nextLine();
            getAmiList().add(ami);
            System.out.println(ami);
            System.out.println(getAmiList().size());
     }
     
     public void displayFriend()
     {
         for (String pote : getAmiList()){
                 System.out.println(pote);
            }
     }
}
