import java.util.Scanner;
public class main{
    public static void main(String[] args) {
        Scanner v = new Scanner(System.in);
        System.out.print("Masukkan nilai N : ");
        int N = v.nextInt();
        
        System.out.println("====ANGKA GENAP DARI N-1====");
        for (int a=N;a>=1;a--){
            if (a%2!=0){
                continue;
            }
            System.out.print(a+", ");
        }
        System.out.println();
        System.out.println("====ANGKA GANJIL DARI N-1====");
        for (int b=N;b>=1;b--){
            if (b%2==0){
                continue;
            }
            System.out.print(b+", ");
        }
        System.out.println();
    }
              }
