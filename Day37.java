import java.util.Scanner;
public class main {
    
    public static void main(String[] args) {
        Scanner v = new Scanner(System.in);
        System.out.print("masukan angka > ");
        int angka = v.nextInt();
        
        if (angka==0) {
            System.out.println("angka netral");
        }else if (angka%2==0) {
            System.out.println("angka adalah genap");
        }else {
            System.out.println("angka adalah ganjil");
        }
    }
    
}
