public class Recursion {

    public static int sum(int min_num, int max_num) {
        if (max_num > min_num) {
            return max_num + sum(min_num, max_num - 1);
        }

        else {
            return max_num;
        }
    }

    public static void main(String[] arg) {
        System.out.println(sum(5, 10));
    }
}
