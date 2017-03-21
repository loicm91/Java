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
public class Developpeur extends Employe implements Salarie{
    //Attribut
    
    
    //Constructeur
    public Developpeur(){
        
    }
    
    public Developpeur(String pPrenom, int pAge){
        this.prenom = pPrenom;
        this.age = pAge;
    }
    
    //Methode
   
    public void travailler(){
       System.out.println("Je suis un développeur, je débugge les bugs");
    }
    
    @Override
    public void recevoirPaiement(){
       System.out.println("Je suis payé !");
    }

}
