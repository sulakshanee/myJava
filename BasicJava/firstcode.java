class firstCode
{
	public static void main(String[] args)
	{
		System.out.print("Hello\n");

		int num1 = 2;
		int num2 = 6;
		System.out.print(num1 + num2 +"\n");

		double n1 = 45.5;
		double n2 = 55.5;
		System.out.print(n1 + n2 +"\n");

		float N1 = 35.5f;
		float N2 = 45.5f;
		System.out.println(N1 + N2);

		System.out.printf("Hello World\n");

		System.out.printf("The sum of %d and %d is %d \n",num1,num2,num1+num2);

		num1 += 2.5; 
		System.out.println(num1);

		int i = 0B1001;
		System.out.println(i);

		int j = 5;
		j = j++;
		System.out.println(j);

		j = ++j;
		System.out.println(j);
	}
}