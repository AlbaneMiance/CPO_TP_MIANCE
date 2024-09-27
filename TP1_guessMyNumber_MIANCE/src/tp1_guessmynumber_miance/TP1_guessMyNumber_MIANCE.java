/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_guessmynumber_miance;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alban
 */
public class TP1_guessMyNumber_MIANCE {

    /**
     * @param args the command line arguments
     */

     public static void main(String[] args) {
        // Création du générateur de nombres aléatoires
        Random generateurAleat = new Random();
        int nombreAleatoire = generateurAleat.nextInt(101); // Génère un nombre entre 0 et 100
        Scanner sc = new Scanner(System.in);
        int nombreDevine = -1; // Initialisation à une valeur qui ne peut pas être le nombre à deviner
        int tentatives = 0; // Initialisation du compteur de tentatives

        // Boucle pour demander à l'utilisateur de deviner le nombre
        while (nombreDevine != nombreAleatoire) {
            System.out.print("Devinez un nombre entre 0 et 100 : ");
            nombreDevine = sc.nextInt();
            tentatives++; // Incrémente le compteur à chaque tentative

            // Comparaison du nombre deviné avec le nombre aléatoire
            if (nombreDevine < nombreAleatoire) {
                System.out.println("Trop petit !");
            } else if (nombreDevine > nombreAleatoire) {
                System.out.println("Trop grand !");
            } else {
                System.out.println("Gagné !");
                System.out.println("Vous avez trouvé le nombre en " + tentatives + " tentatives.");
            }
        }

        // Fermeture du scanner
        sc.close();
    }
}