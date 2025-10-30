import java.util.Scanner;
public class day53 {
    
    public static void main(String[] args) {
        Scanner x =new Scanner(System.in);
        System.out.print("masukan hari = ");
        String hari = x.nextLine();
        
        switch (hari) {
            case "minggu":
            System.out.println("hari libur");
            break;
            default:
            System.out.println("hari kuliah");
            break;
            
        }
      
    }
    
}
