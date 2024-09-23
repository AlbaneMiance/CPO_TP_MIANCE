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
                System.out.printf("%.2f degrés Celsius est égal à %.2f degrés Kelvin.%n", value, CelciusVersKelvin(value));
                break;
            case 2:
                System.out.printf("%.2f degrés Kelvin est égal à %.2f degrés Celsius.%n", value, KelvinVersCelcius(value));
                break;
            case 3:
                System.out.printf("%.2f degrés Celsius est égal à %.2f degrés Fahrenheit.%n", value, CelciusVersFarenheit(value));
                break;
            case 4:
                System.out.printf("%.2f degrés Fahrenheit est égal à %.2f degrés Celsius.%n", value, FarenheitVersCelcius(value));
                break;
            case 5:
                System.out.printf("%.2f degrés Kelvin est égal à %.2f degrés Fahrenheit.%n", value, KelvinVersFarenheit(value));
                break;
            case 6:
                System.out.printf("%.2f degrés Fahrenheit est égal à %.2f degrés Kelvin.%n", value, FarenheitVersKelvin(value));
                break;
            default:
                System.out.println("Choix invalide. Veuillez sélectionner un numéro de 1 à 6.");
        }
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
}