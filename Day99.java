import java.util.Scanner;
public class main{
    
    public static void main(String[] args) {
        Scanner v = new Scanner(System.in);
        System.out.print("masukan batas atas : ");
        int batas = v.nextInt();
        
        for (int a = 2 ; a <= batas ; a++){
            boolean prima = true;
            for (int b = 2; b*b <= a; b++){
                if (a%b==0){
                    prima= false;
                    break;
                }
            }
            if (prima){
                System.out.print(a + ", ");
            }
        }
    }
    
}
