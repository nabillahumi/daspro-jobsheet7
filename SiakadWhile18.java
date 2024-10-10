import java.util.Scanner;

public class SiakadWhile18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nilai, jml, i=0;

        System.out.println("Masukkan jumlah mahasiswa : ");
        jml = sc.nextInt();

        while (i < jml) { 
            System.out.println("Masukkan nilai mahasiswa ke-" (i + 1) + ":");
            nilai = sc.nextInt();
        }
    }
}
