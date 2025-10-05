import java.util.Scanner;
public class main {
    public static void main(String[]args){
    Scanner x = new Scanner(System.in);
            System.out.println("masukan angka : ");
     int no = x.nextInt();
            if (no%2==0){
                    System.out.println("angka adalah genap ");
            } else if  (no%2!=0)  {
                    System.out.println("angka adalah ganjil");
            } else{
                    System.out.println("eror");
            }
    }


}
