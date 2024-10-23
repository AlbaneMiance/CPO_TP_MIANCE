/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_miance;

/**
 *
 * @author alban
 */
public class TP2_convertisseurObjet_MIANCE {
public static void main(String[] args) {
        Convertisseur convertisseur = new Convertisseur();

        // Exemples de conversion
        System.out.println("25°C en Kelvin : " + convertisseur.CelciusVersKelvin(25));
        System.out.println("300 K en °C : " + convertisseur.KelvinVersCelcius(300));
        System.out.println("100°F en °C : " + convertisseur.FarenheitVersCelcius(100));
        System.out.println("0°C en °F : " + convertisseur.CelciusVersFarenheit(0));
        System.out.println("32°F en Kelvin : " + convertisseur.FarenheitVersKelvin(32));
        System.out.println("273.15 K en °F : " + convertisseur.KelvinVersFarenheit(273.15f));

        // Affichage du nombre total de conversions
        System.out.println(convertisseur);
    }
}

