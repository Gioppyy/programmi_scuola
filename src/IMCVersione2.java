import java.util.InputMismatchException;
import java.util.Scanner;

public class IMCVersione2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        try {
            System.out.print("Inserisci il peso: ");
            double peso = scn.nextDouble();
            System.out.print("Inserisci l'altezza (x,xx): ");
            double altezza = scn.nextDouble();
            double imc = peso / (altezza * altezza);
            System.out.printf("Peso inserito:      %.2f\n", peso);
            System.out.printf("Altezza inserita:    %.2f\n", altezza);
            System.out.printf("IMC:                %.2f (%s)", imc, getRisultatoIMC(imc));
        } catch (InputMismatchException e) {
            System.out.println("Errore nell'eseguire il programma, inserisci un numero valido!");
        }
    }

    private static String getRisultatoIMC(double imc) {
        if (imc < 18.5) return "Sottopeso";
        else if (imc >= 18.5 && imc <= 25) return "Normopeso";
        else if (imc > 25 && imc <= 30) return "Sovrappeso";
        else if (imc > 30 && imc <= 40) return "Obesità";
        else return "Obesità grave";
    }
}
