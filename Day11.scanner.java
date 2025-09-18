import java.util.Scanner;
public class main {
    public static void main(String[]args) {
        Scanner lids = new Scanner(System.in);
        System.out.print("masukan teks = ");
        String s = lids.nextLine();
        System.out.println(">>");
        
        System.out.print("masukan bilangan bulat = ");
        int i = lids.nextInt();
        System.out.println(">>");
        
        System.out.print("masukan bilangan bulat = ");
        byte b = lids.nextByte();
        System.out.println(">>");
        
        System.out.print("masukan bilangan bulat = ");
        long l = lids.nextLong();
        System.out.println(">>");
        
        System.out.print("masukan bilangan bulat= ");
        short sh = lids.nextShort();
        System.out.println(">>");
        
        System.out.print("masukan pecahan = ");
        double d = lids.nextDouble();
        System.out.println(">>");
        
        System.out.print("masukan pecahan = ");
        float f = lids.nextFloat();
        System.out.println(">>");
        
        System.out.print("masukan true atau false = ");
        boolean bo = lids.nextBoolean();
        System.out.println(">>");
        
        System.out.print("masukan 1 karakter = ");
        char ch = lids.next().charAt(0);
        System.out.println(">>");
        System.out.println("thank you > <");
        
            }
}

