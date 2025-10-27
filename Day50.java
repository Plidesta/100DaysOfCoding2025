import java.util.Scanner;
public class main {
    
    public static void main(String[] args) {
        
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
        
        Scanner x = new Scanner(System.in);
        System.out.print("masukan angka: ");
        int sandi = x.nextInt();
        
        System.out.print("");
        System.out.println("^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("");
            
        String z = (sandi%2==0) ? "angka genap" : "angka ganjil";
        System.out.println(z);
            
       System.out.println("");
        System.out.println("^^^^^^^^^^^^^^^^^^");
    }
    
}
