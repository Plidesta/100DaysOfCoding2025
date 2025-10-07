import java.util.Scanner;
public class main {
    public static void main(String[]args) {
      Scanner v = new Scanner(System.in);
       System.out.print("masukan suhu ");
       int suhu = v.nextInt();
        if (suhu>=25){
            System.out.println("cuaca sangat panas");
        }else if (suhu<=15){
            System.out.println("cuaca dingin");
        }else{
            System.out.println("cuaca hangat");
        }
    }
    
    }
