import java.util.InputMismatchException;
import java.util.Scanner;

public class TabellinaVersione2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        try {
            System.out.print("Inserisci il numero di cui vuoi fare la tabellina: ");
            int n = scn.nextInt();
            for (int i = 0; i <= 10; i++)
                System.out.printf("%d * %d = %d\n", n, i, n * i);
        } catch (InputMismatchException e) {
            System.out.println("Errore nell'eseguire il programma, inserisci un numero valido!");
        }
    }
}
