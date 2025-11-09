import java.util.Scanner;
public class main {
    
    public static void main(String[] args) {
        Scanner v = new Scanner(System.in);
        System.out.print("masukan nilai N : ");
        int n = v.nextInt();
        
        int x = 1;
        
        for (int a=1;a<=n;a++){
            x = x*a;
            System.out.println(a+", ");
        }
        System.out.println("jumlah perulangan 1-"+n+"="+x);
    }
    
}
