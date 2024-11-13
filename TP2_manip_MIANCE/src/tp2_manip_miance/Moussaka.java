/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_manip_miance;

/**
 *
 * @author alban
 */
public class Moussaka {
        public int nbCalories;
    
    //Constructeur 
    public Moussaka(int qtt){
        nbCalories =qtt;
    }//Fin Constructeur
    
    //ToString
    @Override
    public String toString() {
        return "Cette moussaka contient "+nbCalories +" calories.";
    }//Fin ToString

}//Fin Classe}
