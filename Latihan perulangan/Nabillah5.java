import java.util.Scanner;

public class Nabillah5 {
    
    public static void main(String[] args) {
        
        //inputan
        Scanner input = new Scanner(System.in);
    
        //variable
        int a = 3;
        int tambah = 1;
    
        //input nilai n
        System.out.print("Masukkan n : ");
        int n = input.nextInt();
    
        //logic
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            a += tambah;
            tambah += 2;
        }
    }
}
