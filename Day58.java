import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner v = new Scanner(System.in);
        System.out.print("Masukkan nilai N : ");
        int N = v.nextInt();
        
        System.out.println("\n--- Urutan Naik (1 sampai " + N + ") ---");
        for (int a = 1; a <= N; a++) {
            System.out.print(a);
            if (a < N) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("\n--- Urutan Turun (" + N + " sampai 1) ---");
        for (int b = N; b >= 1; b--) {
            System.out.print(b);
            if (b > 1) {
                System.out.print(", ");
            }
        }
        System.out.println(); 
    
}
 
}
