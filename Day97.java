import java.util.Scanner;
public class main {
    public static double persegiPanjang(double panjang, double lebar){
        double luas = panjang*lebar;
        return luas;
    }
    public static void main(String[]args){
        Scanner v = new Scanner(System.in);
        System.out.print("masukan panjang : ");
        double panjang = v.nextDouble();
        System.out.print("masukan lebar : ");
        double lebar = v.nextDouble();
        
        day97 total = new day97();
        
        double hasil = total.persegiPanjang(panjang, lebar);
        
        System.out.println("_____________________");
        System.out.println("");
    System.out.println("hasil dari luas persegi dengan panjang "+panjang+" dan lebar "+lebar+" = "+hasil);
    System.out.print("");
    System.out.print("____________________________");
    }
          }
