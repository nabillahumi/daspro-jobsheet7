import java.util.Scanner;

public class Nabillah8 {
    
    public static void main(String[] args) {
        
        //inputan
        Scanner input = new Scanner(System.in);

        //variable
        int hasil = 0;

        //input bil 1 dan 2
        System.out.print("Masukkan bil 1 : ");
        int bil1 = input.nextInt();

        System.out.print("Masukkan bil 2 : ");
        int bil2 = input.nextInt();

        //logic
        for (int i = 1; i <= bil1; i++) {
            hasil += bil2;
        }

        System.out.println("Hasil perkalian menggunakan penambahan : " + hasil);

    }
}
