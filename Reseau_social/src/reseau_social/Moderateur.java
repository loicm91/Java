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
public class Moderateur extends Identite{
    
   private int level;

    //Constructeur d'initialisation du modérateur par défaut
     public Moderateur(){
        super();
    } 
    public Moderateur(int level){
        super();
        this.level = level;
        
    } 
    //Constructeur d'initialisation du modérateur
    public Moderateur(String pPrenom, int pAge, int pLevel ) 
        throws AgeIdentiteException{
            super(pPrenom,pAge);
            level = pLevel;
    }
    
   

    public int getLevel() {
        return level;
    }

    /**
     *
     * @param level correspond au level tapé par utilisateur
     */
 
    public void setLevel(int level) {
        this.level = level;
    } 
    
    public String toString()
    {
        //personne1.getPrenom() et personne1.getAge() permet de récupérer les informations de la class Identite
        return (super.toString() + "\n Tu es un modérateur de niveau" + level);
    }
}
