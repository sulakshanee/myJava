public class JavaString {
    public static void main(String[] args) {

        String txt_1 = "Hello World";

        // String length
        System.out.println(txt_1.length());

        // UpperCase
        System.out.println(txt_1.toUpperCase()); // HELLO WORLD

        // LowerCase
        System.out.println(txt_1.toLowerCase()); // hello world

        // Finding Character
        System.out.println(txt_1.indexOf("orld"));

        // Concatenation
        String first_name = "Sulakshanee";
        String second_name = "Theja";

        System.out.println(first_name + " " + second_name); // Sulakshanee Theja
        System.out.println(first_name.concat(second_name)); // SulakshaneeTheja

        // BackSpace
        System.out.println("My Clas\bs"); // My Clas

        String num_1 = "10";
        String num_2 = "20";
        System.out.println(num_1 + num_2); // 1020

        int num_3 = 30;
        System.out.println(num_3 + num_1); // 3010

    }
}
