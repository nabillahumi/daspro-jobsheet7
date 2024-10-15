import java.util.Scanner;

public class Nabillah1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, i ;
        System.out.print("Masukkan nilai n : ");
        n = sc.nextInt();

        for (i = n; i >= 1; i--) {
            System.out.println("i  " + i + " : ");
        }
    }
}