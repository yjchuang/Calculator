
public class Operation {
	private double number1;
	private double number2;
	
	
	public Operation() {
	
	}
	public double getNumber1() {
		return number1;
	}
	public void setNumber1(double number1) {
		this.number1 = number1;
	}
	public double getNumber2() {
		return number2;
	}
	public void setNumber2(double number2) {
		this.number2 = number2;
	}
	
	public double addition(double _number1, double _number2)
	{
		return (_number1 + _number2);
	}
	
	public double subtraction(double _number1, double _number2)
	{
		return (_number1 - _number2);
	}
	
	public double multiplication(double _number1, double _number2)
	{
		return (_number1 * _number2);
	}
	
	public double division(double _number1, double _number2)
	{
		double result = 0.0;
		try 
		{	result = _number1 /_number2;
		}
		catch (ArithmeticException e)
		{
			e.getMessage();
		}
		return result;
	}
	
	public double modulus(double _number1, double _number2)
	{
		double result = 0.0;
		try 
		{	result = _number1 %_number2;
		}
		catch (ArithmeticException e)
		{
			e.getMessage();
		}
		return result;
	}
}
