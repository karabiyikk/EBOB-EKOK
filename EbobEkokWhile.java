import java.util.Scanner;

public class EbobEkokWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, ebob = 1, ekok, i = 0;

        System.out.print("'a' sayısını giriniz : ");
        a = input.nextInt();
        System.out.print("'b' sayısını giriniz : ");
        b = input.nextInt();

        if (a > b) {
            while (i <= b) {
                i++;
                if (a % i == 0 && b % i == 0) {
                    ebob = i;
                }
            }
            System.out.println("Sayıların EBOB'u : " + ebob);
        } else {
            while (i <= a) {
                i++;
                if (a % i == 0 && b % i == 0) {
                    ebob = i;
                }
            }
            System.out.println("Sayıların EBOB'u : " + ebob);
        }
        while (i <= (a * b)) {
            i++;
            if (i % a == 0 && i % b == 0) {
                ekok = i;
                System.out.println("Sayıların EKOK'u : " + ekok);
                break;
            }
        }
    }
}
