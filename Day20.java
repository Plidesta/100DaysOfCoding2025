public class main {
  public static void main(String[]args) {
      //menggunakan konketenasi(menggabungkan)
        System.out.println("metode konketasi : ");
       int nilai = 80;
        String str = nilai + "";
        System.out.println(str);
        //motode statis to string
        System.out.println("metode statis to string : ");
        double nilai2 = 98.99;
        String str2 = Double.toString(98.99);
        System.out.println(str2);
        //metode statis to string value
        System.out.println("metode statis to string value :");
        short nilai3 = 100;
        String str3 = String.valueOf(nilai3);
        System.out.println(str3);
    }
    
}
