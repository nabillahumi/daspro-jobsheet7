import java.util.Scanner;

public class Tugas1Bioskop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahTiket, hargaTiket, diskon, totalTiket = 0, totalHarga = 0;
        String totalPenjualanTiket;
        boolean isLanjut = true;

        while(isLanjut) {
            System.out.print("Masukkan jumlah tiket : ");
            jumlahTiket = sc.nextInt();
            if (jumlahTiket <= 0) {
                System.out.println("");
                continue;
            } else {
                hargaTiket = jumlahTiket * 50000;
                if (jumlahTiket>10) {
                    diskon=(int) (0.15*hargaTiket);
                } else if (jumlahTiket>4) {
                    diskon=(int) (0.1*hargaTiket);
                } else {
                    diskon=0;
                }
                hargaTiket=hargaTiket-diskon;
                totalTiket=totalTiket-jumlahTiket;
                totalHarga=totalHarga+hargaTiket;
                System.out.print("Lanjut/(true/false) : ");
                isLanjut = sc.nextBoolean();
            }
            
        }
        System.out.println("Total tiket : " +totalTiket);
        System.out.println("totalHarga : " + totalHarga);
    }
}

            
