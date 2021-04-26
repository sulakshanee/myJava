public class TypeCasting {
    public static void main(String[] args) {

        // Widening Casting -: byte -> short -> char -> int -> long -> float -> double
        byte a = 20;
        int b = a;
        double c = b;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        // Narrowing Casting -: byte <- short <- char <- int <- long <- float <- double
        double x = 120.51;
        int y = (int) x;
        short z = (short) y;

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
