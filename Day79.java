import java.util.Scanner;
public class day78 {
    public static void main(String[] args) {
        
        System.out.println("==================");
        System.out.println("pembuatan akun baru");
        System.out.println("==================");
        
        Scanner v = new Scanner(System.in);
        System.out.print("masukan username baru : ");
        String user = v.nextLine();
        System.out.print("masukan password baru : ");
        String pw = v.nextLine();
        System.out.print("");
        System.out.println("------------------");
        System.out.println("akun berhasil dibuat");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        
        String a;
        String b;
        boolean login = false;
        
        
        do {
            System.out.print(">>>>>>>>>>>>>>>>>>>>>>>");
            System.out.print("<<<<<<<<<<<<<<<<<<<<<<<");
            System.out.println("~~halaman login~~");
            System.out.println("masukan username : ");
            a = v.nextLine();
            System.out.print("masukan password : ");
            b = v.nextLine();
            
            if (a.equals(user)&&b.equals(pw)){
                login = true;
                System.out.println("LOGIN BERHASIL ✅\nselamat datang "+user+"!!");
            }else if (a.equals(user)&& !a.equals(pw)){
                System.out.println("password salah ....coaba lagi");
            }else{
                System.out.println("username salah.....coba lagi");
            }
            
        }while (!login);
        
        
          }
}
