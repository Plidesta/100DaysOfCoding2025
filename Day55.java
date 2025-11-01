import java.util.Scanner;
public class main {
    
    public static void main(String[] args) {
        Scanner x =new Scanner(System.in);
        System.out.print("masukan batas bawah : ");
        int b = x.nextInt();
        System.out.print("masukan batas atas : ");
        int a = x.nextInt();
        System.out.print("masukan bilangan bulat : ");
        int bu = x.nextInt();
        
        if (bu>=b&&bu<=a) {
            System.out.println("YAYAYAYA");
        }else {
            System.out.println("NONONONO");
        }
    }
    
}
