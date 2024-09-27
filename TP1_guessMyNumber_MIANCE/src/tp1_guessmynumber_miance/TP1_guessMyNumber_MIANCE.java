/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_guessmynumber_miance;

import java.util.Random;

/**
 *
 * @author alban
 */
public class TP1_guessMyNumber_MIANCE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        // Création du générateur de nombres aléatoires
        Random generateurAleat = new Random();

        // Affichage de 5 nombres aléatoires inférieurs ou égaux à 100
        for (int i = 0; i < 5; i++) {
            int n = generateurAleat.nextInt(101); // 101 pour inclure 100
            System.out.println("Nombre aléatoire " + (i + 1) + ": " + n);
        }
    }
}   // TODO code application logic here