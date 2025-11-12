import java.util.Scanner;
public class day66 {
    
    public static void main(String[] args) {
        Scanner v = new Scanner(System.in);
        System.out.print("masukan batas >> ");
        int batas = v.nextInt();
  
        for (int a = 1;a<=batas;a++){
            System.out.print(a+", ");
            System.out.println(a);
            
        }
    }
}
