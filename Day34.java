import java.util.Scanner;
public class main {
    public static void main(String[]args) {
     Scanner x = new Scanner(System.in);
     System.out.print("masukan nama > ");
        String nama = x.nextLine();
        System.out.print("masukan nilai uts > ");
        int uts = x.nextInt();
        System.out.print("masukan nilai uas > ");
        int uas = x.nextInt();
        
        if (uts >50 && uas>50 && uts<=65&&uas<=65){
            System.out.print("anda dinyatakan lulus \ndengan predikat cukup");
        }else if (uts>65&&uas>65&&uts<=80&&uas<=80){
            System.out.print("anda dinyatakan lulus \ndengan predikat baik");
        }else if (uts>80 && uas>80 && uts<=100&&uas<=100){
            System.out.print("anda dinyatakan lulus \ndengan predikat sangat baik");
        }else{
            System.out.print("anda tidak lulus");
        }
    }
    
}
