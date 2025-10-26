import java.util.Scanner;
public class main {
    
    public static void main(String[] args) {
        
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
        
        final String pw = "Anjayy";
        
        Scanner x = new Scanner(System.in);
        System.out.print("masukan sandi : ");
        String sandi = x.nextLine();
        
        System.out.println("^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("");
            
        String z = (sandi.equals(pw)) ? "sandi benar" : "sandi salah";
        System.out.println(z);
            
       System.out.println("");
        System.out.println("^^^^^^^^^^^^^^^^^^");
    }
    
}
