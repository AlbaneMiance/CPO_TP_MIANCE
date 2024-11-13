/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_miance;

/**
 *
 * @author alban
 */
public class TP3_Heroic_Fantasy_MIANCE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Création d'une épée
        Epee excalibur = new Epee("Excalibur", 90, 85);
        System.out.println(excalibur);

        // Création d'un bâton
        Baton batonMagique = new Baton("Bâton Magique", 70, 50);
        System.out.println(batonMagique);
    }
}

