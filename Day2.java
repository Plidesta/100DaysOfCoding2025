public class main {
    public static void main(String[]args) {
      //penggunaan print , println dan printf
      //print digunakan untuk mencetak sebuah kalimat
       //yg bersambung secara vertilakal
        System.out.println("penggunaan print :");//pembatas
        System.out.println(">>  ");//pembatas
       System.out.print("materi");
       System.out.print("  pada hari kedua ini  ");
        //atau
        String a = "adalah";
        String b = " penerapan print , println"; 
        String c = " & printf dlm pemangilan codingan yg kita buat.";
       System.out.print( a); 
        System.out.print( b);
        System.out.print( c);
        System.out.println("============= ");//pembatas
      //println digunakan ketika kita mau membuat baris baru pada codingan 
System.out.println("penggunaan prinln :");  //sebagai pembatas
System.out.println(">>  "); //sebagai pembatas       
     System.out.println("materi");
        System.out.println("hari kedua ngoding");
        System.out.println("penerapan :");
        System.out.println("- print");
        System.out.println("- println");
        System.out.println("- printf");
        System.out.println("pada pemanggian program");//pembatas
        /*printf digunakan dalam mencetak fotmat yg lebih spesifik
         * atau pemagilan program yg memadukan angka dan string
         * dengan menggunakan :
         * %d untukinteger;
         * %f untuk angka desimal
         * dan %s untuk string
         */
        System.out.println("  ");//pembatas
        System.out.println("penggunaan printf");//pembatas
        int umur = 20;
        System.out.printf("umur saya %d tahun \n",umur);
        //atau
        int uang = 1000000;
       System.out.printf("jumlah pembayaran kost =%d/bln \n",uang); 
    }
    
  }
