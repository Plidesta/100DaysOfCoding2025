import java.util.Scanner;
public class main {
    
    public static void main(String[] args) {
        
        System.out.println("====silahkan masukan angka untuk menetukan hari====");
        System.out.println("");
        
        Scanner s = new Scanner(System.in);
        System.out.print("masukan angka  : ");
        int menu = s.nextInt();
        
        switch (menu){
            case 1:
            System.out.println("adalah hari senin");
        break;
            case 2:
            System.out.println("adalah hari selasa");
            
        break;
            case 3:
            System.out.println("adalah hari rabu");
        break;
            case 4:
            System.out.println("adalah hari kamis");
        break;
            case 5:
            System.out.println("adalah hari jumat");
        break;
            case 6:
            System.out.println("adalah hari sabtu");
        break;
            case 7:
            System.out.println("adalah hari minggu");
        break;
            default:
            System.out.println("mohon maaf !!\ntidak ada dlm program");
        }
    }
    
                               }
