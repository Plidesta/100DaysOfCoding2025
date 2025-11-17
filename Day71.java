import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner v = new Scanner(System.in);
        System.out.print("Masukkan tinggi segitiga : ");
        int tinggi = v.nextInt();

        
        if (tinggi <=18&&tinggi>=5){
        System.out.println("");
        System.out.println("===========================");
        for (int a = 1; a <= tinggi; a++) {
            for (int b = 1; b <= a; b++) {
                System.out.print("☆ ");
            }
            System.out.println(); 
        }
        
        }else {
            System.out.println("angka melebihi batas");
        }
        
    }
}
