package ExampleOops;

 class cal {
int a;
int b;
int result;

public void method()
{
	result = a + b;
 }
}

public class ClassCalculator
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cal cal1 = new cal();
		cal1.a=5;
		cal1.b = 7;
		
		cal1.method();
		System.out.println(cal1.result);
	}
}


