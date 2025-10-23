import java.util.Scanner;
public class day46 {
    
    public static void main(String[] args) {
        
        System.out.println("====MENU HIDANGAN KANTIN====");
        System.out.println("");
        System.out.println("silahkan pilih berdasarkan angka menu");
        System.out.println("");
        System.out.println("1. ayam geprek + es teh.= 5k");
        System.out.println("2. bakso bakar..........= 3k");
        System.out.println("3. gorengan.............= 1k/1 gorengan");
        System.out.println("4. ayam crispy + es teh.= 5k");
        System.out.println("5. pop ice..............= 5k");
        System.out.println("6. kopi susu............= 3k");
        System.out.println("7. pentol...............= 5k");
        System.out.println("8. seblak...............= 5k");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        Scanner s = new Scanner(System.in);
        System.out.print("masukan pilihan menu : ");
        int menu = s.nextInt();
        
        switch (menu){
            case 1:
            System.out.println("anda memilih menu ayam geprek gratis es teh");
            System.out.println("mohon tunggu pesanannya !!");
        break;
            case 2:
            System.out.println("anda memeilih menu bakso bakar");
            System.out.println("mohon tunggu pesanannya !!");
        break;
            case 3:
            System.out.println("anda memilih menu gorengan");
            System.out.println("mohon tunggu pesanannya !!");
        break;
            case 4:
            System.out.println("anda memilih menu ayam crispy gratis es teh");
            System.out.println("mohon tunggu pesanannya !!");
        break;
            case 5:
            System.out.println("anda memilih menu pop ice");
            System.out.println("mohon tunggu pesanannya !!");
        break;
            case 6:
            System.out.println("anda memilih menu kopi susu");
            System.out.println("mohon tunggu pesanannya !!");
        break;
            case 7:
            System.out.println("anda memilih menu pentol");
            System.out.println("mohon tunggu pesanannya !!");
        break;
            case 8:
            System.out.println("anda memilih menu seblak");
            System.out.println("mohon tunggu pesanannya !!");
        break;
            default:
            System.out.println("mohon maaf !!\npesanan anda tidak tersedia dalam menu");
        }
    }
    
}
