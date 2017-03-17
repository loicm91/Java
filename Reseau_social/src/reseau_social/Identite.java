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
    protected String prenom;
    protected int age;
    protected int level = 0;
    
    
    ArrayList<String> allMessages = new ArrayList<String>(); 
    ArrayList<String> amiList = new ArrayList<String>();
    ArrayList<String> listMessage = new ArrayList<String>();
    //Pour récupérer les infos on doit stocker des objets, pour accéder à ses infos
    ArrayList<Identite> listUsers = new ArrayList<Identite>();

 
    /**
    *Constructeur
    * Rempli les champs prénom et âge de l'utilisateur
    * @param pPrenom 
    *   correspond au prénom 
    * @param pAge 
    *   correspond à l'age
    */ 
    public Identite(){
        
    }
    
    public Identite(String pPrenom, int pAge)  
        
        throws AgeIdentiteException{
                {
                    if(pAge < 0)
                        throw new AgeIdentiteException();
                    else
                    { 
                        
                        prenom = pPrenom;
                        age = pAge;
                        this.setListUsers(listUsers);
                    }
                }
        
    }
    
    //Methode
    public void createUser(Scanner sc){
        
       //Le bloc Try/catch interdit de mettre un âge négatif  
       try{
           
       System.out.println("Veuillez saisir un prénom et un nom : ");
       prenom = sc.nextLine();
       System.out.println("Bonjour " + prenom + "!");
       System.out.println("Quel âge as-tu?");
       age = sc.nextInt();
       Identite user1 = new Identite(prenom, age);
       this.getListUsers().add(user1);
       System.out.println(getListUsers().size());  

        } catch (AgeIdentiteException e){
            
        }
       
      
    }
    
    //*************   MUTATEURS   *************
    //Getter et Setter
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
    
    
    //USER
    public ArrayList<Identite> getListUsers() {
        return listUsers;
    }

    public void setListUsers(ArrayList<Identite> listUsers) {
        this.listUsers = listUsers;
    }
    public int getLevel() {
        return level;
    }

    /**
     *
     * @param level correspond au level tapé par utilisateur
     */
 
    public void setLevel(int level) {
        
    } 
    
    //MESSAGES
    public ArrayList<String> getAllMessages() {
        return allMessages;
    }

    public void setAllMessages(ArrayList<String> allMessages) {
        this.allMessages = allMessages;
    }
    
    public ArrayList<String> getListMessage() {
        return listMessage;
    }

    public void setListMessage(ArrayList<String> listMessage) {
        this.listMessage = listMessage;
    }
    
    
    //AMI
    public ArrayList<String> getAmiList() {
        return amiList;
    }

    public void setAmiList(ArrayList<String> amiList) {
        this.amiList = amiList;
    }
    
    public String toString()
    {
        //personne1.getPrenom() et personne1.getAge() permet de récupérer les informations de la class Identite
       return ( "Tu t'appelles " + this.getPrenom() + " et tu as " + this.getAge() + "ans.");
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
        System.out.println("Veuillez saisir un message :");
            String message = sc.nextLine();
            getListMessage().add(message);
            System.out.println(message);
            System.out.println(getListMessage().size());
    }
     
     public void updateMessage(Scanner sc)
    {
        System.out.println("Veuillez modifier votre message :");
            String message = sc.nextLine();
            getListMessage().add(message);
            System.out.println(message);
    }
    
    public void afficherMessages(String user)
    {
        for (String mess : getListMessage()){
            System.out.println(mess);
        }
    }
     
     public void displayMessageUser()
     {
          for (String mail : getListMessage()){
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
     
    public void displayUsers()
     {
         for (Identite userList : getListUsers()){
                 System.out.println(userList.getPrenom());
            }
     }
}
