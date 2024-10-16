/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_miance;

/**
 *
 * @author alban
 */
public class TP2_Bieres_MIANCE {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
    
        // Création de la première bière : "Cuvée des trolls" de "Dubuisson" avec 7.0 degrés
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls", 7.0, "Dubuisson");
        uneBiere.lireEtiquette();
        System.out.println(); // Ligne vide pour séparer les étiquettes

        // Création de la deuxième bière : "Leffe" de "Abbaye de Leffe" avec 6.6 degrés
        BouteilleBiere deuxBiere = new BouteilleBiere("Leffe", 6.6, "Abbaye de Leffe");
        deuxBiere.lireEtiquette();
        System.out.println();

        // Création de la troisième bière : "Heineken" de "Heineken International" avec 5.0 degrés
        BouteilleBiere troisBiere = new BouteilleBiere("Heineken", 5.0, "Heineken International");
        troisBiere.lireEtiquette();
        System.out.println();

        // Création de la quatrième bière : "Guinness" de "Guinness Brewery" avec 4.2 degrés
        BouteilleBiere quatreBiere = new BouteilleBiere("Guinness", 4.2, "Guinness Brewery");
        quatreBiere.lireEtiquette();
        System.out.println();
    }
}
