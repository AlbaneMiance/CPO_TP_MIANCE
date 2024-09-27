/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_stats_miance;

/**
 *
 * @author alban
 */
public class TP1_stats_MIANCE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Création d'un tableau de 6 entiers, chaque case correspondant à une face du dé
        int[] facesDe = new int[6]; // Toutes les cases sont initialisées à 0 par défaut

        // Affichage initial des valeurs du tableau (facultatif)
        System.out.println("Tableau initial :");
        for (int i = 0; i < facesDe.length; i++) {
            System.out.println("Face " + (i + 1) + ": " + facesDe[i]);
        }
    }
}
 