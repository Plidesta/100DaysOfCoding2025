import java.util.Scanner;
public class main {
    
    public static void main(String[] args) {
  Scanner x = new Scanner(System.in);
        System.out.print("masukan nilai anda : "); 
        int nilai = x.nextInt();
        
      if (nilai>=90&&nilai<=100) {
        System.out.println("lulus\npredikat A");
        if (nilai==100) {
          System.out.println(" sempurna");
        }
      }else if (nilai <90&&nilai>=80) {
        System.out.println("lulus\npredikat B");
      }else if (nilai <80&&nilai>=70) {
        System.out.println("lulus\npredikat C");
      }else if (nilai <70&&nilai>=50) {
        System.out.println("lulus\npredikat D");
      }else {
        System.out.println("anda tidak lulus");
      }
    }
    
}
