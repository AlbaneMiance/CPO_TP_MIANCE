/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_manip_miance;

/**
 *
 * @author alban
 */
public class Tartiflette {
        public int nbCalories;


    //Constructeur 
    public Tartiflette(int qtt){
        nbCalories =qtt;
    }//Fin Constructeur
    
    //ToString

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Cette tartiflette contient "+nbCalories +" calories.";
    }//Fin ToString
}