public class IMC {
    public static void main(String[] args) {
        if (args.length == 2) {
            try {
                double peso = Double.parseDouble(args[0]);
                double altezza = Double.parseDouble(args[1]);
                double imc = peso / (altezza * altezza);
                System.out.printf("Peso inserito:    %.2f\n", peso);
                System.out.printf("Altezza inserita:  %.2f\n", altezza);
                System.out.printf("IMC:              %.2f (%s)", imc, getRisultatoIMC(imc));
            } catch (NumberFormatException e) {
                System.out.println("Errore nell'eseguire il programma: " + e.getMessage());
            }
        }
    }

    private static String getRisultatoIMC(double imc){
        if (imc < 18.5) return "Sottopeso";
        else if (imc >= 18.5 && imc <= 25) return "Normopeso";
        else if (imc > 25 && imc <= 30) return "Sovrappeso";
        else if (imc > 30 && imc <= 40) return "Obesità";
        else return "Obesità grave";
    }
}
