/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_convertisseur_miance;

import java.util.Scanner;

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

        // Demande de la valeur à convertir
        System.out.println("Bonjour, saisissez une valeur :");
        double value = sc.nextDouble();

        // Affichage du menu
        System.out.println("Saisissez la conversion que vous souhaitez effectuer :");
        System.out.println("1) De Celsius vers Kelvin");
        System.out.println("2) De Kelvin vers Celsius");
        System.out.println("3) De Celsius vers Fahrenheit");
        System.out.println("4) De Fahrenheit vers Celsius");
        System.out.println("5) De Kelvin vers Fahrenheit");
        System.out.println("6) De Fahrenheit vers Kelvin");

         int choice = sc.nextInt(); // Lire le choix de l'utilisateur

        // Traitement du choix
        switch (choice) {
            case 1:
                afficherResultat(value, CelciusVersKelvin(value), "Celsius", "Kelvin");
                break;
            case 2:
                afficherResultat(value, KelvinVersCelcius(value), "Kelvin", "Celsius");
                break;
            case 3:
                afficherResultat(value, CelciusVersFarenheit(value), "Celsius", "Fahrenheit");
                break;
            case 4:
                afficherResultat(value, FarenheitVersCelcius(value), "Fahrenheit", "Celsius");
                break;
            case 5:
                afficherResultat(value, KelvinVersFarenheit(value), "Kelvin", "Fahrenheit");
                break;
            case 6:
                afficherResultat(value, FarenheitVersKelvin(value), "Fahrenheit", "Kelvin");
                break;
            default:
                System.out.println("Choix invalide. Sélectionnez un numéro entre 1 et 6.");
        }
        
        sc.close(); // Fermer le scanner
    }

    // Méthode pour convertir Celsius en Kelvin
    public static double CelciusVersKelvin(double tCelcius) {
        return tCelcius + 273.15;
    }

    // Méthode pour convertir Kelvin en Celsius
    public static double KelvinVersCelcius(double tKelvin) {
        return tKelvin - 273.15;
    }

    // Méthode pour convertir Fahrenheit en Celsius
    public static double FarenheitVersCelcius(double tFarenheit) {
        return (tFarenheit - 32) * 5 / 9;
    }

    // Méthode pour convertir Celsius en Fahrenheit
    public static double CelciusVersFarenheit(double tCelcius) {
        return (tCelcius * 9 / 5) + 32;
    }

    // Méthode pour convertir Kelvin en Fahrenheit
    public static double KelvinVersFarenheit(double tKelvin) {
        double celsius = KelvinVersCelcius(tKelvin); // Convertir Kelvin à Celsius
        return CelciusVersFarenheit(celsius); // Convertir Celsius à Fahrenheit
    }

    // Méthode pour convertir Fahrenheit en Kelvin
    public static double FarenheitVersKelvin(double tFarenheit) {
        double celsius = FarenheitVersCelcius(tFarenheit); // Convertir Fahrenheit à Celsius
        return CelciusVersKelvin(celsius); // Convertir Celsius à Kelvin
    }

    private static void afficherResultat(double value, double CelciusVersKelvin, String celsius, String kelvin) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}