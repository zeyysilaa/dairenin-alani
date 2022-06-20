import java.util.Scanner;
public class Daire {
    public static void main(String[] args) {
        double yaricap, merkezaci;
        Scanner girdi = new Scanner(System.in);

        System.out.println("Yarıçapı giriniz : ");
        yaricap = girdi.nextDouble();

        System.out.println("Merkez açıyı giriniz : ");
        merkezaci = girdi.nextDouble();

        double alan = (3.14 * yaricap * yaricap * merkezaci) / 360;

        System.out.println(alan);


    }
}
