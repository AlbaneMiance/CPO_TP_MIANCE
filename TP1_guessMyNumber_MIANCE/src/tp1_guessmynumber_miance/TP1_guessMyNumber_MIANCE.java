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
        int nombreDevine = -1;
        int tentatives = 0;
        int maxTentatives = Integer.MAX_VALUE; // Par défaut, tentatives illimitées

        // Demander à l'utilisateur le niveau de difficulté
        System.out.println("Choisissez un niveau de difficulté :");
        System.out.println("1. Facile");
        System.out.println("2. Normal");
        System.out.println("3. Difficile");
        System.out.print("Votre choix (1, 2 ou 3) : ");
        int choixDifficulte = sc.nextInt();

        // Ajustement selon le niveau de difficulté
        switch (choixDifficulte) {
            case 1: // Facile
                System.out.println("Vous avez choisi le mode Facile.");
                break;
            case 2: // Normal
                System.out.println("Vous avez choisi le mode Normal.Vous avez 15 tentatives.");
                maxTentatives = 15; // Limitation des tentatives à 15
                break;
            case 3: // Difficile
                System.out.println("Vous avez choisi le mode Difficile.Vous avez 10 tentatives.");
                maxTentatives = 10; // Limitation des tentatives à 10
                break;
            default:
                System.out.println("Choix invalide. Mode Normal par défaut.");
        }

        // Boucle de jeu
        while (nombreDevine != nombreAleatoire && tentatives < maxTentatives) {
            System.out.print("Devinez un nombre entre 0 et 100 : ");
            nombreDevine = sc.nextInt();
            tentatives++;

            int ecart = Math.abs(nombreAleatoire - nombreDevine); // Calcul de l'écart

            // Comparaison du nombre deviné avec le nombre aléatoire
            if (nombreDevine < nombreAleatoire) {
                if (choixDifficulte == 1 && ecart > 20) {
                    System.out.println("Vraiment trop petit !");
                } else {
                    System.out.println("Trop petit !");
                }
            } else if (nombreDevine > nombreAleatoire) {
                if (choixDifficulte == 1 && ecart > 20) {
                    System.out.println("Vraiment trop grand !");
                } else {
                    System.out.println("Trop grand !");
                }
            } else {
                System.out.println("Gagné !");
                System.out.println("Vous avez trouvé le nombre en " + tentatives + " tentatives.");
            }

            // En mode Difficile, vérifier si les tentatives sont épuisées
            if (tentatives == maxTentatives && nombreDevine != nombreAleatoire) {
                System.out.println("Dommage, vous avez épuisé vos " + maxTentatives + " tentatives. Le nombre à deviner était " + nombreAleatoire + ".");
            }
        }

        // Fermeture du scanner
        sc.close();
    }
}