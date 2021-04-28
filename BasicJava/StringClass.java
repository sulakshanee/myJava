public class StringClass {
    public static void main(String[] args) {

        String txt_1 = "Hello World";

        // String length
        System.out.println(txt_1.length());

        // Sub String
        System.out.println(txt_1.substring(2)); // llo World

        // UpperCase
        System.out.println(txt_1.toUpperCase()); // HELLO WORLD

        // LowerCase
        System.out.println(txt_1.toLowerCase()); // hello world

        // Finding Character
        System.out.println(txt_1.indexOf("orld"));

        // isEmpty
        System.out.println(txt_1.isEmpty());

        // Replace
        System.out.println(txt_1.replace("H", "Ch"));

        // Trim(Remove white space from both ends)
        String txt_2 = "   Hello   ";
        System.out.println(txt_2.trim());

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

        // Compare to strings
        System.out.println(num_1.compareTo(num_2));

    }
}
