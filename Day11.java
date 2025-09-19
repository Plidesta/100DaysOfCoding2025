public class main {
  import java.util.Scanner;
    public static void main(String[]args) {
    Scanner isc = new Scanner(System.in);
          System.out.print("masukan nama lengkap anda : ");
        String nama = isc.nextLine();
        System.out.print("masukan tempat lahir anda : ");
        String tempatLahir = isc.nextLine();
               System.out.print("masukan tanggal lahir (DD) : ");
              String tgl = isc.nextLine();
        System.out.print("masukan bulan lahir : ");
        String bln = isc.nextLine();
        System.out.print("masukan tahun lahir : ");
        int thn = isc.nextInt();
        Scanner it = new Scanner(System.in);
       System.out.print("masukkan nim anda : ");
        String nim = it.nextLine();
        System.out.print("masukan asal sekolah : ");
        String sekolah = it.nextLine();
        System.out.print("masukan nama fakulas anda : ");
        String ft = it.nextLine();
        System.out.print("masukan nama prodi anda :");
        String p = it.nextLine();
        System.out.print("masukan alamat KTP : ");
        String alamat = it.nextLine();
        System.out.println("masukan no WA anda : ");
        String wa = it.nextLine();
        System.out.println("masukan alamat email anda : ");
        String m = it.nextLine();
        System.out.println(">><<");
        System.out.println("BIODATA MAHASISWA");
        System.out.println("NAMA LENGKAP : "+nama);
        System.out.println("TTL : "+tempatLahir+"-"+tgl+"-"+bln+"-"+thn);
        System.out.println("NIM : "+nim);
        System.out.println("ASAL SEKOLAH : "+sekolah);
        System.out.println("FAKULTAS : "+ft);
        System.out.println("PRODI : "+p);
        System.out.println("CONTACT : "+wa);
        System.out.println("Email : "+m);
    }
          }
