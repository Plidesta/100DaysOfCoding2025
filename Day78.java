public class main {
    public static void main(String[] args) {
        String teksAsli = "method java dasar";
        String t = "method java dasar";
        System.out.println(teksAsli.equals(t));
        System.out.println(teksAsli.equalsIgnoreCase(t));
        System.out.println(teksAsli.isEmpty());
        System.out.println("");
        System.out.println(teksAsli.length());
        System.out.println(teksAsli.toUpperCase());
        System.out.println(teksAsli.toLowerCase());
        
        String trim = teksAsli.trim();
        System.out.println(trim.length());
        String sub = teksAsli.substring(8, 17);
        System.out.println(sub);
        String replace = teksAsli.replace("java", "C++");
        System.out.println(replace);
        
    }
          }
