package esercizio2;

import java.util.Scanner;

public class Esercizio2 {

    public static void main(String[] args) {

        try{

        Scanner scanner = new Scanner(System.in);
        System.out.println("Quanti km percorsi?");
        double kmPercorsi = scanner.nextInt();

        System.out.println("Quanti litri consumati?");
        double litriConsumati = scanner.nextInt();

        double risultato = kmPercorsi/litriConsumati;

        System.out.println(risultato);
        } catch (ArithmeticException e) {
            System.out.println("impossibile dividere per 0");
        }



    }

}
