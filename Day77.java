public class main {
    public static void main(String[] args) {
        String teksAsli = "method string java manipulasi";
        System.out.println("1. Metode trim()");
          String Trim = teksAsli.trim();
            System.out.println(Trim.length() + " karakter.");
            System.out.println("2. Metode substring()");
          String subs = teksAsli.substring(0,13);
        System.out.println(subs);
        System.out.println("3. Metode replace()");
        String rp = teksAsli.replace("java", "phiton");
        System.out.println(rp);
        
          }
}
