package esercizio1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EsercizioUno {
    public static void main(String[] args) {
        int[] numeri = new int[5];

        for (int i = 0; i < numeri.length; i++) {
            numeri[i] = (int) (Math.random()*10) +1;
        }

        for (int i = 0; i < numeri.length; i++) {
            System.out.println(numeri[i]);
        }

        Scanner scanner = new Scanner(System.in);

        try {



            System.out.println("scegli un numero");
            int scelta = scanner.nextInt();

            System.out.println("scegli una posizione");
            int posizione = scanner.nextInt();
            numeri[posizione] = scelta;



            for (int i = 0; i < numeri.length; i++) {
                System.out.println(numeri[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("la posizione deve essere tra 0 e 4");
        } catch (InputMismatchException e) { // questo mi chiedeva di importarlo perchè si trova in un altro package che non è importato automaticamente come Scanner etc
            System.out.println("simbolo non valido, inserire solo numeri");
        }

    }


}
