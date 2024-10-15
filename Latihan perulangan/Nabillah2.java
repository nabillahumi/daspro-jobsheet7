import java.util.Scanner;

public class Nabillah2 {
    public static void main(String[] args) {
        
        //inputan
        Scanner input = new Scanner(System.in);
    
        //variable
        int n, kali = 1;
    
        //input n
        System.out.print("masukkan n : ");
        n = input.nextInt();
    
        //logic
        for (int i = 1; i <= n; i++) {
            kali *= i;
    
            System.out.println(kali);
        }

    }
}
