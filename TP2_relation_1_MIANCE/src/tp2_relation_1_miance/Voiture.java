/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_miance;

/**
 *
 * @author alban
 */
public class Voiture {

      public String Modele,Marque;
    public int PuissanceCV;
    public Personne Proprietaire;
    
    //Constructeur 
    public Voiture(String modl, String marc, int power){
        Modele = modl;
        Marque = marc;
        PuissanceCV = power;
        Proprietaire = null;
    }//Fin Constructeur
    
    //ToString
    @Override
    public String toString() {
        return Modele +" "+PuissanceCV+" chevaux fiscaux "+ "de la marque "+Marque+".";
    }//Fin ToString
}
