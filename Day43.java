import java.util.Scanner;
public class main {
    
    public static void main(String[] args) {
        Scanner v = new Scanner(System.in);
        System.out.print("masukan angka : "); 
        int angka = v.nextInt();
        
        if (angka%3==0) {
            System.out.println(angka+" kelipatan 3");
        }else if (angka%5==0) {
            System.out.println(angka+" kelipatan 5");
        }else if (angka%3==0 && angka%5==0) {
            System.out.println(angka+" kelipatan 3 dan kelipatan 5");
        }else {
            System.out.println("bukan kelipatan 3 dan 5");
        }
    }
    
}
