import java.util.Scanner;
public class main {
    public static void main(String[]args){
        Scanner v = new Scanner(System.in);
        System.out.print("masukan panjang array : ");
        int p = v.nextInt();
        int[]arr = new int[p];
        
        for (int i = 0;i<arr.length;i++){
            System.out.print("masukan elemen ke_"+(i+1)+": ");
            arr[i] = v.nextInt();
        }
        System.out.println("____________");
        System.out.print("isi array = ");
        for (int oke : arr ){
            System.out.print(oke+", ");
        }
        
        System.out.println("");
        System.out.println("==============");
        
    }    
    }
    
