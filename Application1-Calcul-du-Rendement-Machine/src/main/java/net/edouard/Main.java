package net.edouard;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        final int MAX_PERCENT = 100;

        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));

        int nombrePiecesProduites = 0, nombrePiecesConformes = 0;

        // demander la saisie au clavier
        System.out.println("Veuillez saisir le nombre des pieces produites :->");
        nombrePiecesProduites = Integer.parseInt(rd.readLine());

        System.out.println("Veuillez saisir le nombre des pieces conformes :->");
        nombrePiecesConformes = Integer.parseInt(rd.readLine());

        // calculer le nombre des pieces rejetees
        int nombrePiecesRejetees = nombrePiecesConformes - nombrePiecesProduites;

        // calculer le taux de rendement
        double rendement = ((double) nombrePiecesProduites /nombrePiecesConformes)*100;

        // affichage claire
        System.out.println("Nombre de pieces produites -> "+nombrePiecesProduites);
        System.out.println("Nombre de pieces rejetees -> "+nombrePiecesRejetees);
        System.out.println("Nombre de pieces conformes -> "+nombrePiecesConformes);
        System.out.println("Taux de rendement -> "+rendement+" %");

    }
}