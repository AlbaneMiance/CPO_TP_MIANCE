/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_miance;

/**
 *
 * @author alban
 */    
public class Baton extends Arme {
    // Attribut propre au bâton : âge (< 100)
    private int age;

    // Constructeur pour initialiser le bâton
    public Baton(String nom, int niveauAttaque, int age) {
        super(nom, niveauAttaque);
        // S'assurer que l'âge est < 100
        if (age >= 100) {
            this.age = 99; // Limite à 99 si la valeur dépasse 100
        } else {
            this.age = age;
        }
    }

    // Getter pour obtenir l'âge du bâton
    public int getAge() {
        return age;
    }

    // Redéfinition de la méthode toString pour inclure l'âge
    @Override
    public String toString() {
        return super.toString() + ", Age : " + age;
    }
}
