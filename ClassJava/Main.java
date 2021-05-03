public class Main {

    int con_sum;

    // Constructors
    public Main(int x, int y) {
        con_sum = x + y;
    }

    public static void main(String[] args) {
        AddNumbers sumOfNum = new AddNumbers();
        System.out.println(sumOfNum.sum);

        // Run Constructors
        Main callConstructor = new Main(20, 30);
        System.out.println(callConstructor.con_sum);

        // Run Encapsulation
        Encapsulation obj1 = new Encapsulation();
        obj1.setName("Theja");
        System.out.println(obj1.getName());
    }
}
