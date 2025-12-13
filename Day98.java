import java.util.Scanner;
public class main {
    public static void main(String[]args) {
      Scanner v = new Scanner(System.in);
        System.out.print("masukan batas : ");
        int n = v.nextInt();
        System.out.println("");
        System.out.println("DERET FIBONACCI DARI 0 - "+n);
        System.out.println("---------------------");
        System.out.println("");
        
        int suku1 = 0;
        int suku2 = 1;
        if (n>=1){
            System.out.print(suku1);
        }
        if (n>=2){
            System.out.print(", "+suku2);
        }
        for (int i = 2;i<n;i++){
            int lanjut = suku1 + suku2;
            System.out.print(" || "+lanjut);
            suku1 = suku2;
            suku2 = lanjut;
        }
        System.out.println("\n____________________________");
      
    }
    
    }
