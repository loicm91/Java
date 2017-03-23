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
public class Marketeur extends Employe implements Salarie{
 
    //Attribut
    
    
    //Constructeur
    public Marketeur(){
        
    }
    
    public Marketeur(String pPrenom, int pAge){
        this.prenom = pPrenom;
        this.age = pAge;
    }
    
    //Methode
    public void travailler(){
       System.out.println("Je suis un marketeur, je vends du rêve");
    }
    
    @Override
    public void recevoirPaiement(){
       System.out.println("Je suis payé !");
    }
}
