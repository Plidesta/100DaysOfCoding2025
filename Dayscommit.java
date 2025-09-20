public class main {
  import java.util.Scanner;
    public static void main(String[]args) {
     Scanner oke = new Scanner(System.in);
     System.out.print("masukan nilai anda > ");
      char nilai = oke.next().charAt(0);
System.out.print("apakah anda lulus ? > ");
        boolean status = oke.nextBoolean();
 System.out.print("nilai bayu adalah "+nilai+". status kelulusan  : "+status);
    }
}
