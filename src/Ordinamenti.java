import java.util.*;

public class Ordinamenti {
    public static void main(String[] args) {
        int elementi, max;
        long inizio, fine;
        int[] arr;
        Scanner scn = new Scanner(System.in);
        Random rdm = new Random();

        System.out.print("quanti elementi vuoi nel vettore ----------> ");
        elementi = scn.nextInt();
        System.out.printf("riempio il vettore con %d numeri fra 0 e --> ", elementi);
        max = scn.nextInt();

        arr = rdm.ints(elementi, 0, max).toArray();
        stampa(arr, elementi);

        System.out.println("partito ordinamento...");
        inizio = System.currentTimeMillis();

        //Togli dal commento il tipo di sort che vuoi utilizzare:
        quicksort(arr,0,elementi-1);
        //bubbleSort(arr);
        //bubbleSort(arr, elem);

        fine = System.currentTimeMillis();
        double tempo=((double)fine-inizio)/1000;
        System.out.printf("\nfinito ordinamento ( tempo = %.2fs ), premi INVIO...",tempo);

        stampa(arr, elementi);
    }

    private static void stampa(int[] arr, int elem) {
        System.out.println("\n__________________________________");
        for (int i = 0; i < elem; i++) {
            System.out.printf("v[%2d] = %10d\n", i, arr[i]);
        }
    }

    private static void scambia(int[] v, int px, int py) {
        int dep = v[px];
        v[px] = v[py];
        v[py] = dep;
    }

    private static void bubbleSort(int[] v) {
        boolean scambio;
        do {
            scambio = false;
            for (int i = 0; i < v.length - 1; i++)
                if (v[i] > v[i + 1]) {
                    scambia(v, i, i + 1);
                    scambio = true;
                }
        } while (scambio);
    }

    private static void bubbleSort(int[] v, int elem) {
        int i, j;
        for (i = 0; i < elem - 1; i++)
            for (j = i + 1; j < elem; j++)
                if (v[i] > v[j])
                    scambia(v, i, j);
    }

    private static void quicksort(int[] v, int sx, int dx) {
        int pivot = v[(sx+dx)/2], i =sx , j = dx;
        while(i <= j ) {
            while(v[i]<pivot)
                i++;
            while(v[j]>pivot)
                j--;
            if ( i <  j)
                scambia(v,i,j);
            if ( i <= j){
                i++;
                j--;
            }
        }
        if (sx < j  ) quicksort(v,sx,j);
        if (i  < dx ) quicksort(v,i,dx);
    }

}
