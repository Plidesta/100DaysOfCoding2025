import java.util.Scanner;
public class main {
    
    public static void main(String[] args) {
        
        System.out.println("====KALKULATOR SEDERHANA====");
        System.out.println("");
        
        
        Scanner s = new Scanner(System.in);
        System.out.print("masukan angka  : ");
        int angka = s.nextInt();
        System.out.print("masukan operator : ");
        char op = s.next().charAt(0);
        System.out.print("masukan angka : ");
        int angka2 = s.nextInt();
        
        System.out.println("______________________");
        
        
        switch (op){
            case '+':
            System.out.println(angka+" + "+angka2+" = "+(angka+angka2));
            break;
            case '-':
            System.out.println(angka+" - "+angka2+" = "+(angka-angka2));
            break;
            case '/':
            System.out.println(angka+" / "+angka2+" = "+(angka/angka2));
            break;
            case '*':
            System.out.println(angka+" × "+angka2+" = "+(angka*angka2));
            break;
            case '%':
            System.out.println(angka+" % "+angka2+" = "+(angka%angka2));
            break;
            default:
            System.out.print("maaf operasi tersebut tidak tersedia");
            
        }
    }
    
}
