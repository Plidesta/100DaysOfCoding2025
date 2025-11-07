import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner v = new Scanner(System.in);
        System.out.print("Masukkan nilai M : ");
        int m = v.nextInt();
        System.out.print("Masukkan batas atas (N) : ");
        int n = v.nextInt();
        
        
        System.out.println("====ANGKA KELIPATAN "+m+" dari 1-"+n);
        for (int a=m;a<=n;a+=m){
            System.out.print(a+", ");
        }
        
    }
}
