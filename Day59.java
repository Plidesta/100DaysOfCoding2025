import java.util.Scanner;
public class main{
    public static void main(String[] args) {
        Scanner v = new Scanner(System.in);
        System.out.print("Masukkan nilai N : ");
        int N = v.nextInt();
        
        
        System.out.println("=====ANGKA GANJIL 1-N====");
        for (int a=1;a<=N;a++){
            if (a%2==0){
                continue;
            }
                    System.out.print(a+" ,");
            }
        System.out.println("\n=====ANGKA GENAP 1-N=====");
        for (int b=1;b<=N;b++){
                if (b%2==1){
                    continue;
                }
                System.out.print(b+" ,");
            }

                       

        }
}
