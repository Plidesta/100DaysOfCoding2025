import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("masukan kata : ");
        String tes = x.nextLine();
        String Sandi = "Inf";
        System.out.println("sandi = Inf >>>>"+tes.equals(Sandi));
        System.out.println("sandi = Inf >>>>"+tes.equalsIgnoreCase(Sandi));
        System.out.println("sandi mengandung kata Inf >>>>"+tes.contains("Inf"));
        System.out.println("sandi kosong >>>>"+tes.isEmpty());
    }
          }
