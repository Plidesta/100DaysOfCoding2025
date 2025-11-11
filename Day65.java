import java.util.Scanner;
public class main {
    
    public static long hitungFaktorial(int n) {
        if (n < 0) {
            System.out.println("Input harus bilangan non-negatif (0 atau positif).");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        long hasil = 1;
        for (int i = 2; i <= n; i++) {
            hasil = hasil * i;
            
        }

        return hasil;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan bulat (max 20) untuk dihitung faktorialnya: ");
        int angka = input.nextInt();
            long hasilFaktorial = hitungFaktorial(angka);
            
            System.out.println("----------------------------------------");
            System.out.println("Faktorial dari " + angka + " (" + angka + "!) adalah: " + hasilFaktorial);
            System.out.println("----------------------------------------");
        
    }
}

    
