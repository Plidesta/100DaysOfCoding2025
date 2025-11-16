import java.util.Scanner;

public class  {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("lebar harus lebih besar dari pada panjang");
        System.out.print("Masukkan Tinggi Persegi Panjang: ");
        int n = scanner.nextInt();
        System.out.print("Masukkan Lebar Persegi Panjang: ");
        int m = scanner.nextInt();
        
        if (m<n){
            System.out.print("eror");
        }else{
        
        for (int a = 0; a < n; a++) {
            for (int b = 0; b < m; b++) {
                System.out.print("01"); 
            }
            System.out.println(); 
        }
        }

    }
}
