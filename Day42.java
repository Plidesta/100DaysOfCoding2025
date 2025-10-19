import java.util.Scanner;
public class main {
    
    public static void main(String[] args) {
        
        double gajipokok;
        double persenPajak;
        double pajak;
        double gajiBersih;
        
      Scanner c = new Scanner(System.in);
        System.out.print("masukan jumlah gaji pokok : ");
        int gajiP = c.nextInt();
        
        if (gajiP>=10000000) {
            persenPajak = 0.15;
            System.out.println("anda dikenakan pajak sebesar 15%");
        }else if (gajiP>=5000000&&gajiP<=10000000) {
            persenPajak = 0.10;
        System.out.println("anda dikenakan pajak sebesar 10%");
        }else {
            persenPajak = 0.5;
            System.out.println("anda dikenakan pajak sebesar 5%");
        }
        
        
        pajak = gajiP*persenPajak;
        gajiBersih = gajiP-pajak;
        
        System.out.println("jumlah pajak = "+pajak);
        System.out.println("jumlah gaji bersih = "+gajiBersih);
    }
    
    }
