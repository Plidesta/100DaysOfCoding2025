import java.util.Scanner;
public class main {
    public static void main(String[]args) {
     final double PHI = 3.14;
      Scanner v = new Scanner(System.in);
        System.out.print("masukan nilai jari-jari lingkaran : ");
        double d = v.nextDouble();
        
        System.out.println("luas dari lingkaran X = "+(PHI*d*d));
    }
    
}
