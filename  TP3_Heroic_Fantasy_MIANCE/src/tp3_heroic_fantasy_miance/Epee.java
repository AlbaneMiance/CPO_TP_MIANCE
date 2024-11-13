/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_miance;

/**
 *
 * @author alban
 */
 public class Epee extends Arme {
    // Attribut propre à l'épée : indice de finesse (< 100)
    private int indiceFinesse;

    // Constructeur pour initialiser l'épée
    public Epee(String nom, int niveauAttaque, int indiceFinesse) {
        super(nom, niveauAttaque);
        // S'assurer que l'indice de finesse est < 100
        if (indiceFinesse >= 100) {
            this.indiceFinesse = 99; // Limite à 99 si la valeur dépasse 100
        } else {
            this.indiceFinesse = indiceFinesse;
        }
    }

    // Getter pour obtenir l'indice de finesse
    public int getIndiceFinesse() {
        return indiceFinesse;
    }

    // Redéfinition de la méthode toString pour inclure l'indice de finesse
    @Override
    public String toString() {
        return super.toString() + ", Indice de finesse : " + indiceFinesse;
    }
}   
