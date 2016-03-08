import java.util.Scanner;
public class SquareCubeRoot {
	
	public double SquareRoot(double a)
	{
		return Math.sqrt(a);
	}
	
	public double Cube(double a)
	{
		return Math.cbrt(a);
	}
	
	public static void  main(String a[])
	{
		Scanner scc = new Scanner(System.in);
		SquareCubeRoot scR = new SquareCubeRoot();
		
		System.out.println("Enter the number you want to check Square Root:");
		double num1 = scc.nextDouble();
		double result = scR.SquareRoot(num1);
		System.out.println();
		System.out.println("Square Root of " + num1 + "is :" + result );
		System.out.println("Enter the number you want to check Cube Root:");
		double num2 = scc.nextDouble();
		result = scR.Cube(num2);
		System.out.println("Cube Root of " + num2 + "is :" + result );
	}

}
