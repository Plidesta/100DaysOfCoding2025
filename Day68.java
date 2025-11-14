import java.util.Scanner;
public class main {
    
    public static void main(String[] args) {
        Scanner v = new Scanner(System.in);
        System.out.println("masukan panjang sisi");
        int sisi = v.nextInt();
        
        for (int a=0;a<=sisi;a++){
            for (int b=0;b<=sisi;b++) {
                if (a==0||b==0){
                    System.out.print("#");
                }else if (a==sisi||b==sisi){
                        System.out.print("#");
                    }else{
                        System.out.print("#");
                    }
            }
            System.out.println();
        }
    }
    
            }
