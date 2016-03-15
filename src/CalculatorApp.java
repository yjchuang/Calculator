import java.util.Scanner;

public class CalculatorApp {

	public static void main(String[] args) {

		double number1, number2, result=0.0;
		int _operation=0;
		String operator="";
		Operation op = new Operation();

		Scanner sc = new Scanner(System.in);

		System.out.print("What is the first number?: ");
		number1 = sc.nextDouble();
		do
		{
			System.out.println("\n1 - Addition");
			System.out.println("\n2 - Subtraction");
			System.out.println("\n3 - Multiplication");
			System.out.println("\n4 - Division");
			System.out.println("\n5 - Modulus");
			System.out.println("What do you want to do?: ");
			_operation = sc.nextInt();
			if (_operation < 1 || _operation > 5)
			{
				System.out.println("Wrong operation. Try again.");
			}
			else
				break;
		}while (1==1);
		System.out.println("What is the second number?: ");
		number2 = sc.nextDouble();
		
		switch (_operation)
		{
		case 1:
			result = op.addition(number1, number2);
			operator = "+";
			break;
		case 2:
			result = op.subtraction(number1, number2);
			operator = "-";
			break;
		case 3:
			result = op.multiplication(number1, number2);
			operator = "*";
			break;
		case 4:
			result = op.division(number1, number2);
			operator = "/";
			break;
		case 5:
			result = op.modulus(number1, number2);
			operator = "%";
			break;
		}
		
		System.out.println(number1 + " " + operator + " " + number2 + " = " + result);
		

		sc.close();
	}

}
