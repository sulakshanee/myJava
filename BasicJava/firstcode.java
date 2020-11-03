public class FirstCode
{
	public static void main(final String[] args) {
		System.out.print("Hello\n");

		int num1 = 2;
		final int num2 = 6;
		System.out.print(num1 + num2 + "\n");

		final double n1 = 45.5;
		final double n2 = 55.5;
		System.out.print(n1 + n2 + "\n");

		final float N1 = 35.5f;
		final float N2 = 45.5f;
		System.out.println(N1 + N2);

		System.out.printf("Hello World\n");

		System.out.printf("The sum of %d and %d is %d \n", num1, num2, num1 + num2);

		num1 += 2.5;
		System.out.println(num1);

		final int i = 0B1001;
		System.out.println(i);

		int j = 5;
		j = j++;
		System.out.println(j);
	}
}