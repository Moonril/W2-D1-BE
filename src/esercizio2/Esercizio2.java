package esercizio2;

import java.util.Scanner;

public class Esercizio2 {

    public static void main(String[] args) {

        try{

        Scanner scanner = new Scanner(System.in);
        System.out.println("Quanti km percorsi?");
        double kmPercorsi = scanner.nextDouble();

        System.out.println("Quanti litri consumati?");
        double litriConsumati = scanner.nextDouble();

        double risultato = kmPercorsi/litriConsumati;

        System.out.println(risultato);
        } catch (ArithmeticException e) {
            System.out.println("impossibile dividere per 0");
        } // il catch non prende la divisione per 0 come errore perchè la divisione per 0 esiste ed è infinity



    }

}
