import java.util.Scanner;
public class main {
    
    public static void main(String[] args) {
        Scanner v = new Scanner(System.in);
        System.out.print("masukan angka > ");
        int angka = v.nextInt();
        
        if (angka==0) {
            System.out.println("angka "+angka+" adalah nol");
        }else if (angka<0) {
            System.out.println("angka "+angka +" adalah negatif");
        }else {
            System.out.println("angka "+angka+" adalah positif");
        }
    }
    
                               }
