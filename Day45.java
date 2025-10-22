import java.util.Scanner;
public class e {
    
    public static void main(String[] args) {
        
        Scanner h = new Scanner(System.in);
        System.out.print("Masukan hari : ");
        String hari = h.nextLine(); 
        
        switch (hari) {
            case "senin": 
            case "selasa":
            case "rabu":
            case "jumat":
                System.out.println("masuk kuliah");
                break; 
            case "kamis":
                System.out.println("tidak masuk kuliah"); 
                break;
            case "sabtu":
            case "minggu":
                System.out.println("weekend");
                break;
            default: 
                System.out.println("bukan nama hari yang valid.");
                break;
        }
        
    }
}
