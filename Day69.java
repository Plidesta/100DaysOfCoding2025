import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int M = input.nextInt();
        int L = input.nextInt();
        System.out.println("");
        System.out.println("===LAMA WAKTU BELAJAR===");

        System.out.println((M + L) % 24);
        
    }
    
}
