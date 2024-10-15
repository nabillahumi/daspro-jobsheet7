import java.util.Scanner;

public class Nabillah3 {
    
    public static void main(String[] args) {
        
            //inputan
        Scanner input = new Scanner(System.in);
    
        //input nilai n
        System.out.print("Masukka n : ");
        int n = input.nextInt();
    
            //logic
        for (int i = 1; i <= n; i++) {
            System.out.print(i * i + " ");
        }
    }
}
