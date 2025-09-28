public class main {
  public static void main(String[]args) {
       int Va = 80 , Vb = 8;
        System.out.println("sebelum pertukaran : \nVa = "+Va+" & Vb = "+Vb);   
        Va = Vb + Va;
        Vb = Va - Vb;
        Va = Va - Vb;
        System.out.println("setelah pertukaran : \nVa = "+Va+" & Vb = "+Vb);
    }
    
}
