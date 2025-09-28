public class main {
  public static void main(String[]args) {
       int Va = 80 , Vb = 8;
        System.out.println("sebelum pertukaran : \nVa = "+Va+" & Vb = "+Vb);   
        Va = Vb + Va;//hasilnya = 88
        Vb = Va - Vb;//88 - 8 = 80
        Va = Va - Vb;//88 - 80 = 8
        System.out.println("setelah pertukaran : \nVa = "+Va+" & Vb = "+Vb);
    }
    
}
