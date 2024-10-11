/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_bieres_miance;

/**
 *
 * @author alban
 */
public class BouteilleBiere {

    // Déclaration des attributs
    String nom;          // Le nom de la bière
    float degreAlcool;   // Le degré d'alcool de la bière
    String brasserie;    // Le nom de la brasserie qui produit la bière
    boolean ouverte;     // Indique si la bouteille est ouverte (true) ou fermée (false)

    // Méthode pour lire et afficher l'étiquette de la bouteille de bière
    public void lireEtiquette() {
        System.out.println("Bouteille de " + nom + " (" + degreAlcool +
                " degrés) \nBrasserie : " + brasserie);
    }
}
