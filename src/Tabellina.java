public class Tabellina {
    public static void main(String[] args) {
        if(args.length == 1){
            try {
                int n = Integer.parseInt(args[0]);
                for(int i = 0; i <= 10; i++)
                    System.out.printf("%d * %d = %d\n", n, i, n*i);
            } catch (NumberFormatException e){
                System.out.println("Errore nell'eseguire il programma: " + e.getMessage());
            }
        }
    }
}

