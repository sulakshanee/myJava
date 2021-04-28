public class TypeCasting {
    public static void main(String[] args) {

        // Widening Casting -: byte -> short -> char -> int -> long -> float -> double
        byte a = 20;
        int b = a;
        double c = b;

        System.out.println(a); // 20
        System.out.println(b); // 20
        System.out.println(c); // 20.0

        // Narrowing Casting -: byte <- short <- char <- int <- long <- float <- double
        double x = 120.51;
        int y = (int) x;
        short z = (short) y;

        System.out.println(x); // 120.51
        System.out.println(y); // 120
        System.out.println(z); // 120

        // String to Integer
        String s = "45";

        System.out.println(Integer.parseInt(s));
        System.out.println(Integer.valueOf(s));

        // Integer to String
        int t = 55;

        System.out.println(Integer.toString(t));
        System.out.println(String.valueOf(t));
    }
}
