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
    String nom;             // Le nom de la bière
    double degreeAlcool;   // Le degré d'alcool de la bière
    String brasserie;      // Le nom de la brasserie qui produit la bière
    boolean ouverte;       // Indique si la bouteille est ouverte (true) ou fermée (false)

    // Constructeur avec paramètres
    public BouteilleBiere(String nom, double degreeAlcool, String brasserie) {
        this.nom = nom;
        this.degreeAlcool = degreeAlcool;
        this.brasserie = brasserie;
        this.ouverte = false; // Par défaut, la bouteille est fermée
    }

    // Méthode pour lire et afficher l'étiquette de la bouteille de bière
    public void lireEtiquette() {
        System.out.println("Bouteille de " + nom + " (" + degreeAlcool +
                " degrés) \nBrasserie : " + brasserie + "\nStatut : " + (ouverte ? "Ouverte" : "Non ouverte"));
    }
        public boolean Decapsuler() {
        if (!ouverte) {
            ouverte = true;
            System.out.println(nom + " a été décapsulée avec succès.");
            return true;
        } else {
            System.out.println("erreur : bière déjà ouverte");
            return false;
        }
    
    }  
}
