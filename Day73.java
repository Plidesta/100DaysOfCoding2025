import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner v = new Scanner(System.in);
        int tt=0;
        for (int a = 1;a>-1;a++){
            System.out.print("masukan angka : ");
            int angka = v.nextInt();
            if (angka>0){
                tt+=angka;
            }
            if (angka<0){
                break;
            }
            System.out.println("total = "+tt);
        }
    }
}
