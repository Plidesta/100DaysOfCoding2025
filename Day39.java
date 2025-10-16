import java.util.Scanner;
public class main {
    public static void main(String[]args) {
        System.out.println(">>PILIHAN MENU KALKULATOR ARITMATIKA<<"); 
        System.out.println("1. angka dijumlahkan\n2. angka dikurangkan"); 
        System.out.println("3. angka dikalikan\n4. angka dibagikan"); 
        System.out.print(""); 
        
     Scanner v = new Scanner(System.in);
      System.out.print("masukan angka pertama : ");  
       int angka = v.nextInt();
       System.out.print("Masukan angka ke dua : ");  
        int angka2 = v.nextInt();
        System.out.print("masukan pilihan menu : "); 
        int menu = v.nextInt();
        
        if (menu==1) {
            System.out.println(angka+"+"+angka2+"="+(angka+angka2)); 
        }else if (menu==2) {
            System.out.println(angka+"-"+angka2+"="+(angka-angka2)); 
        }else if (menu==3) {
            System.out.println(angka+"×"+angka2+"="+(angka*angka2)); 
        }else if (menu==4) {
            System.out.println(angka+"/"+angka2+"="+(angka/angka2)); 
        }else {
            System.out.println("menu tidak tersedia"); 
        }
    }
          }
