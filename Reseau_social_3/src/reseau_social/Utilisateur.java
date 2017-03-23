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
public class Utilisateur extends Personne implements Relation, Salarie{

    ArrayList<String> amiList = new ArrayList<String>();
    ArrayList<String> listMessage = new ArrayList<String>();
    ArrayList<Utilisateur> listUsers;
    
    public void createUser(){
       Scanner sc = new Scanner(System.in);
       System.out.println("Veuillez saisir un prénom et un nom : ");
       this.prenom = sc.nextLine();
       System.out.println("Quel âge as-tu?");
       this.age = sc.nextInt();
       sc.nextLine();//Après un nextInt(), il faut repasser à la ligne manuellement avec le sc.nextLine()
       System.out.println("Définissez votre pseudo : ");
       this.pseudo = sc.nextLine();
       System.out.println("Bonjour " + this.prenom + "! \n Votre pseudo est : " + this.pseudo); 
    }
    
    public void ajouterPersonnel(String dureeContrat){};
    
    public void recevoirPaiement(){};
    
    //Mutateurs

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }
    
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
     
    
    //Methode
        public void update(Scanner sc)
    {
        //On demande si la personne veut modifier la saisie
        System.out.println("Modifier votre prénom :");
        String prenom = sc.nextLine();
        setPrenom(prenom);
    }

        
    //MESSAGES
        
    public ArrayList<String> getListMessage() {
        return listMessage;
    }

    public void setListMessage(ArrayList<String> listMessage) {
        this.listMessage = listMessage;
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
     
     public void deleteMessages(Scanner sc){
        //afficher la liste de mes messages
        displayMessageUser();
        //demander quel message il veut supprimer
        System.out.println("Quel message voulez-vous supprimer ?");
        // supprimer le message
        int indiceMessage = sc.nextInt();
        listMessage.remove(indiceMessage);
        sc.nextLine();
        System.out.println("\n Vous venez de supprimer un message !");
        displayMessageUser();
     }
   
    //AMI
    public ArrayList<String> getAmiList() {
        return amiList;
    }

    public void setAmiList(ArrayList<String> amiList) {
        this.amiList = amiList;
    }
    public void addFriend(Scanner sc)
    {
        System.out.println("Veuillez ajouter un ami");
        String ami = sc.nextLine();
        getAmiList().add(ami);
        System.out.println(ami);
        System.out.println(getAmiList().size());
    }
    public void searchFriend(Scanner sc)
    {
        //On demande de renseigner le nom de l'ami que l'on recherche
        System.out.println("Taper le nom de votre ami");
        String ami = sc.nextLine();
        //On parcourt le tableau des amis 
        for (String person : getAmiList()){
            //Si ce qu'on a tapé correspond à quelqu'un dans le tableau, on l'affiche
            if(person == ami){
                System.out.println(person);
            }
        }
        System.out.println(ami);
        System.out.println(getAmiList().size());
    }
    public void deleteFriend(Scanner sc){
        System.out.println("Voici la liste de vos amis :");
        for (String pote : getAmiList()){
            System.out.println(pote);
        }
        System.out.println("Qui voulez-vous supprimer ?");
        int indiceAmi = sc.nextInt();
        amiList.remove(indiceAmi);
        sc.nextLine();
        System.out.println("\n Vous venez de supprimer un ami !");
        displayFriend();
    }
     public void displayFriend()
     {
        System.out.println("Voici la liste de vos amis :");
        for (String pote : getAmiList()){
            System.out.println(pote);
        }
     }

    //USER
    public ArrayList<Utilisateur> getListUsers() {
        return listUsers;
    }

    public void setListUsers(ArrayList<Utilisateur> listUsers) {
        this.listUsers = listUsers;
    }
    public void displayUsers()
     {
        for (Utilisateur userList : getListUsers()){
            System.out.println(userList.getPrenom());
        }
     }

}

