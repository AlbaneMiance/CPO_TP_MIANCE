/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_miance;

/**
 *
 * @author alban
 */
public class Arme {
  // Attributs de l'arme
    private String nom;
    private int niveauAttaque;

    // Constructeur pour initialiser le nom et le niveau d'attaque
    public Arme(String nom, int niveauAttaque) {
        this.nom = nom;
        // Assurez-vous que le niveau d'attaque est <= 100
        if (niveauAttaque > 100) {
            this.niveauAttaque = 100;
        } else {
            this.niveauAttaque = niveauAttaque;
        }
    }

    // Getter pour obtenir le niveau d'attaque de l'arme
    public int getNiveauAttaque() {
        return niveauAttaque;
    }

    // Getter pour obtenir le nom de l'arme
    public String getNom() {
        return nom;
    }

    // Redéfinition de la méthode toString pour afficher les détails de l'arme
    @Override
    public String toString() {
        return "Arme : " + nom + ", Niveau d'attaque : " + niveauAttaque;
    }
} 

