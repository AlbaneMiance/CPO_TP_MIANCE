/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_stats_miance;

import java.util.Scanner;

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

        // Création d'un scanner pour lire l'entrée utilisateur
        Scanner sc = new Scanner(System.in);

        // Demander à l'utilisateur de saisir un nombre entier m
        System.out.print("Veuillez saisir un nombre entier m : ");
        int m = sc.nextInt();

        // Afficher la valeur de m (facultatif)
        System.out.println("Vous avez saisi : " + m);

        // Fermeture du scanner
        sc.close();
    }
}