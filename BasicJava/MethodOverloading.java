public class MethodOverloading {

    /*
     * Multiple methods can have the same name with different parameters(Number
     * and/or type of)
     */
    static int sumOfNumbers(int x, int y) {
        return x + y;
    }

    static double sumOfNumbers(double x, Double y) {
        return x + y;
    }

    public static void main(String[] args) {

        System.out.println(sumOfNumbers(10, 20));
        System.out.println(sumOfNumbers(22.16, 33.0));
    }
}
