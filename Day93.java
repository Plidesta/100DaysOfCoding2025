import java.util.Scanner;
public class main {
    
    public static void main(String[] args) {
        Scanner v = new Scanner(System.in);
        System.out.print("masukan bilangan desimal : ");
        double bil = v.nextDouble();
        
        System.out.println("==========================");
        System.out.println("1. pembulatan ke atas : ");
        double hasil1 = Math.ceil(bil);
        System.out.println("pembulatan ke atas bilangan "+bil+" = "+hasil1);
        
        System.out.println("==========================");
        System.out.println("2. pembulatan ke bawah : ");
        double hasil2 = Math.floor(bil);
        System.out.println("pembulatan ke atas bilangan "+bil+" = "+hasil2);
        
        System.out.println("==========================");
        System.out.println("3. pembulatan kondisional (>5 keatas dan <5 ke bawah) : ");
        double hasil3 = Math.round(bil);
        System.out.println("pembulatan ke atas bilangan "+bil+" = "+hasil3);
    }
    
  }
