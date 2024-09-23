/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_manipnombresint_miance;

import java.util.Scanner;

/**
 *
 * @author alban
 */
public class TP1_manipNombresInt_MIANCE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          // Création d'un objet Scanner pour lire l'entrée utilisateur
        Scanner sc = new Scanner(System.in);

        // Demander à l'utilisateur de saisir deux entiers
        System.out.println("Entrez le premier entier:");
        int firstNumber = sc.nextInt();  // Lire le premier entier

        System.out.println("Entrez le deuxieme entier:");
        int secondNumber = sc.nextInt(); // Lire le second entier

        // Affichage des entiers saisis
        System.out.println("Le premier entier: " + firstNumber);
        System.out.println("Le deuxieme entier: " + secondNumber);
        
     // Calculs : somme, différence, produit
        int sum = firstNumber + secondNumber;
        int difference = firstNumber - secondNumber;
        int product = firstNumber * secondNumber;
        
        // Calculs : quotient entier et reste
        int quotient = firstNumber / secondNumber;  // Division entière
        int remainder = firstNumber % secondNumber;  // Reste de la division

        // Affichage des résultats
        System.out.println("La somme du" + firstNumber + " et " + secondNumber + " est: " + sum);
        System.out.println("La difference entre " + firstNumber + " et " + secondNumber + " est: " + difference);
        System.out.println("Le produit de " + firstNumber + " et " + secondNumber + " est: " + product);
         System.out.println("The quotient of " + firstNumber + " divided by " + secondNumber + " is: " + quotient);
        System.out.println("The remainder of " + firstNumber + " divided by " + secondNumber + " is: " + remainder);
    }
}
 