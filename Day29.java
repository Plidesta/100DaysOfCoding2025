import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        
       Scanner z = new Scanner(System.in);
        System.out.print("masukan umur anda >> ");
       int umur = z.nextInt();
        
        if (umur>18 || umur ==18){
          System.out.println("anda sudah dewasa");
        }else if (umur<18 || umur ==18){
            System.out.println("anda masih bocah");
        }
        
        
      System.out.println("terima kasih :) ");  
        
    }
    
        }
