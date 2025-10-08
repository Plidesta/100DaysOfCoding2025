import java.util.Scanner;
public class main {
    public static void main(String[]args) {
      Scanner v = new Scanner(System.in);
       System.out.print("masukan umur ");
       int umur = v.nextInt();
        System.out.print("masukan tinggi badan ");
        double tb = v.nextDouble();
        if (umur>=18 && tb >=160.5){
            System.out.print("anda boleh masuk ");
        }else if (umur<18 && tb <150.5){
            System.out.print("maaf, anda masih bocil");
        }else{
            System.out.print("maaf anda tidak memenuhi kriteria ");
        }
    }
    
          }
