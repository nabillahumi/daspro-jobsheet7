import java.util.Scanner;

public class Tugas2Parkir {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jenis, durasi, total = 0;
        jenis = sc.nextInt();
        durasi = sc.nextInt();
        
        do { 
        System.out.print("Jenis-jenis kedndaraan ");
        System.out.print("1. Mobil ");
        System.out.print("2. Motor ");
        System.out.print("0. Keluar ");
        System.out.print("Masukkan jenis kendaraan : ");
        
            if (jenis == 1 || jenis == 2) {
                System.out.println("Masukkan durasi : ");
                if (durasi > 5) {
                    total = 12500;
                } else {
                    if (jenis == 1) {
                        total += durasi * 3000;
                    } else {
                        total += durasi * 2000;
                    }
                }
            } 
        } while (jenis == 0) ;
        System.out.println("Total : " + total);
    } 
}
