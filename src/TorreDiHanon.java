import java.util.Scanner;

public class TorreDiHanon {
    private static int mosse=1;

    public static void main(String[] args) {
        int dischi;
        Scanner scn = new Scanner(System.in);
        System.out.print("Quanti dischi: ");
        dischi = scn.nextInt();
        hanoi(dischi,1,3,2);
    }

    private static void hanoi(int dis, int p, int a, int d) {
        if (dis==1) {
            System.out.printf("Mossa [%d] - Muovi un disco da %d a %d\n", mosse++, p, a);
        } else {
            hanoi(dis-1,p,d,a);
            System.out.printf("Mossa [%d] - Muovi un disco da %d a %d\n",mosse++,p,a);
            hanoi(dis-1,d,a,p);
        }
    }

}
