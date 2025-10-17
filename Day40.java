import java.util.Scanner;
public class main {
    
    public static void main(String[] args) {
        Scanner v = new Scanner(System.in);
        System.out.print("masukan operator: "); 
        String op = v.nextLine();
        System.out.print("masukan angka: "); 
        int angka = v.nextInt();
        System.out.print("masukan angka: "); 
        int angka2 = v.nextInt();
        System.out.println(""); 
        System.out.println(" $$ HASILNYA $$"); 
        System.out.print(""); 
        
        
        if (op.equals("+")) {
            System.out.println(angka+"+"+angka2+"="+(angka+angka2)); 
        }else if (op.equals("-")) {
            System.out.println(angka+"-"+angka2+"="+(angka-angka2)); 
        }else if (op.equals("×")) {
            System.out.println(angka+"×"+angka2+"="+(angka*angka2)); 
        }else if (op.equals("/")) {
            System.out.println(angka+"/"+angka2+"="+(angka/angka2));
    }else if (op.equals("%")) {
          System.out.println(angka+"%"+angka2+"="+(angka%angka2)); 
        }else {
            System.out.println("menu tidak tersedia"); 
        }
        System.out.print("^^^^^^^^^^^^^^^^^^^^^^^^^^^^"); 
    }
    
    }
