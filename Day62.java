import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner v = new Scanner(System.in);
        System.out.print("Masukkan batas atas (N) : ");
        int n = v.nextInt();
        int x = 0;
        
        System.out.println("====MENJUMLAHKAN ANGKA DARI 1-"+n);
        for (int a=1;a<=n;a++){
            x=x+a;
            System.out.print(a+", ");
        }
        System.out.println("");
        System.out.println("\njumlah perulangan dari 1-"+n+"="+x);
    }
          }
