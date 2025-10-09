import java.util.Scanner;
public class main{
    
    public static void main(String[] args) {
     Scanner x = new Scanner(System.in);
      System.out.print("masukan umur : ");  
        int umur = x.nextInt();
        System.out.print("masukan jumlah saldo anda : ");
        double saldo = x.nextDouble();
            
            String y = (umur>=20 || saldo>=10000000) ? "anda tamu VIP":"maaf anda blm memenuhi syarat";
                System.out.print(y);
    }
    
  }
