java.util.Scanner;
public class main {
    public static void main(String[]args) {
     String s = "Unsulbar";
     int pw = 121025;
     Scanner x = new Scanner(System.in);
     System.out.print("masukan username > ");
     String sandi = x.nextLine();
     System.out.print("masukan password > ");
     int pwd = x.nextInt();
     if (sandi.equals(s)&&pwd==pw){
      System.out.println("username dan password benar \nsilahkan lanjutkan");
     }else if (sandi.equals(s)&&pwd!=pw){
      System.out.println("username benar \npassword salah");
     }else{
      System.out.println("username salah \npassword benar");
     }
    }
    
}
