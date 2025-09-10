public class main {
public static void main(String[] args) {
        // \t digunakan untuk memasukan spasi ke codingan tanpa mengetik spasi
        System.out.println("NAMA\t:\tPlidesta");
        //outputnya = NAMA : Plidesta
        // \n digunakan untuk membuat baris baru tanpa menggunakan println
        System.out.println("NIM\t:\tD0225312.\nALAMAT\t:\tTaora ");
        /* \r mengembalikan korsor ke awal baris
         * output = NIM : D0225312
         *          ALAMAT : Taora
         */
        System.out.println("12UR\rUM\t:\t20");
        /*jadi yg ada di depan \rakan mengganti huruf di awal sesuai total huruf
         * output = UMUR : 20
         * untuk mengatur baris baru di halaman selanjutnya
         */
        System.out.println("Hobi saya main game\fdan saya sedang kuliah di unsulbar");
        /*output = hobi saya main game
         *                  dan saya sedang kuliah di unsulbar
         * \b untuk menghapus satu huruf di codingan
         */
        System.out.println("day.33\b 1001\bdayngoding");
        //output = day.3 100 DayOfCoding
        // \\cara menambahkan \ ke codingan
        System.out.println("2\\3");
        //output = 2\3
        // \"cara menambahkan " ke codingan
        System.out.println("kata kunci \"day.3 \"");
        //output = kata kunci adalah "day.3"
        // \' cara menambahkan ' ke codingan
        System.out.println("sandi adalah \' 3 \'");
        //output sandi adalah '3'
        
    }
    
}
