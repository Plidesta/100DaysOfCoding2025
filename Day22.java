import java.util.Scanner;

public class main {
    public static void main(String[]args) {
     Scanner v = new Scanner(System.in);
        System.out.print("masukan panjang sisi 1 : ");
     int sisi = v.nextInt();   
        System.out.print("masukan panjang sisi 2 : ");
      int sisi2 = v.nextInt();
        
   System.out.println("luas persegi panjang X = "+(sisi*sisi2));
    }
    
}
