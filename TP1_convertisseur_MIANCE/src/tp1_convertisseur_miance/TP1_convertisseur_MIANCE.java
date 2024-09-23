/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_convertisseur_miance;

/**
 *
 * @author alban
 */
public class TP1_convertisseur_MIANCE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         // Création d'un objet Scanner pour lire l'entrée utilisateur
        Scanner sc = new Scanner(System.in);

        // Demander à l'utilisateur de saisir une valeur réelle
        System.out.println("Entrez un nombre réel:");
        double realNumber = sc.nextDouble();  // Lire la valeur réelle

        // Affichage de la valeur saisie
        System.out.println("You entered: " + realNumber);
    }
}