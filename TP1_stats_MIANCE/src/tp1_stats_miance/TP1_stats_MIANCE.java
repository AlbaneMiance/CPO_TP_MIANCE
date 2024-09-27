/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_stats_miance;

import java.util.Random;
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
  System.out.print("Veuillez saisir un nombre entier m (nombre de lancers de dés) : ");
        int m = sc.nextInt();

        // Création du générateur de nombres aléatoires
        Random generateurAleat = new Random();

        // Boucle de m itérations
        for (int i = 0; i < m; i++) {
            // Tirer un nombre aléatoire entre 0 et 5
            int face = generateurAleat.nextInt(6); // Nombre aléatoire entre 0 et 5
            facesDe[face]++; // Incrémenter la case correspondante dans le tableau
        }

        // Affichage des résultats sous forme de pourcentages
        System.out.println("Résultats après " + m + " lancers de dé (en pourcentages) :");
        for (int i = 0; i < facesDe.length; i++) {
            // Calcul du pourcentage
            double pourcentage = (facesDe[i] * 100.0) / m;
            // Afficher le résultat avec 2 décimales
            System.out.printf("Face %d: %.2f%%\n", (i + 1), pourcentage);
        }
        // Fermeture du scanner
        sc.close();
    }
}