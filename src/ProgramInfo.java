import java.util.Arrays;

public class ProgramInfo {
    public static void main(String[] args) {
        System.out.println("Nome programma: " + ProgramInfo.class.getName());
        System.out.println("Parametri d'ingresso: " + (args.length > 1 ? Arrays.toString(args) : "none"));
        System.out.println("Environment: " + System.getenv());
    }
}
