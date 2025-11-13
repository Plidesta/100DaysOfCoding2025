import java.util.Scanner;
public class main {
    
    public static void main(String[] args) {
        Scanner v = new Scanner(System.in);
        System.out.print("masukan batas >> ");
        int batas = v.nextInt();
        if(batas>=100&&batas<=1){
            System.out.println("melebihi batas !!!!");
        }
  System.out.println("====pola horisontal");
        for (int a = 1;a<=batas;a++){
            System.out.print("1010");
        }
    }
}
