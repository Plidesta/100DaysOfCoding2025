import java.util.Scanner;
public class main {
    
    public static void main(String[] args) {
        Scanner v = new Scanner(System.in);
        System.out.print("masukan nilai M : ");
        int m = v.nextInt();
        System.out.print("masukan nilai N : ");
        int n = v.nextInt();
        
        double x = m;
        
        for (int a=1;a<=n;a++){
            System.out.println(a+", ");
            x*=a;
        }
        System.out.println("hasil dari "+n+" pangkat "+m+" = "+x);
    }
    
}
