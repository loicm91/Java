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
public class AgeIdentiteException extends Exception{
    
    public AgeIdentiteException(){
        System.out.println("Vous essayez d'instancier une classe Identite avec un age négatif !");
    }
}
