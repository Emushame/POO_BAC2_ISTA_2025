package net.edouard;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        final double TAUX_CONVERSION = 1.0;
        // 1 kW * 1 heure = 1 kWh

        Scanner scan = new Scanner(System.in);

        // --- Saisie des données ---
        System.out.print("Entrez la puissance du moteur (kW) : ");
        double puissance = scan.nextDouble();

        System.out.print("Entrez la durée de fonctionnement (heures) : ");
        double duree = scan.nextDouble();

        System.out.print("Entrez le prix du kWh (monnaie locale) : ");
        double prixKwh = scan.nextDouble();


        // --- Calculs ---
        double energie = puissance * duree * TAUX_CONVERSION; // en kWh
        double coutTotal = energie * prixKwh;

        // --- Affichage ---
        System.out.println("\n===== RÉSULTATS =====");
        System.out.println("Puissance du moteur     : " + puissance + " kW");
        System.out.println("Durée de fonctionnement : " + duree + " h");
        System.out.println("Énergie consommée       : " + energie + " kWh");
        System.out.println("Coût total à payer      : " + coutTotal + " CDF");

        scan.close();
    }
}
