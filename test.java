

public class test
{
	public static void main(String[] args) {	
		int x = 10;
		int a = x - 1;
		int b = x - 2;
		int c = x - 3;
		while (x > 0) {
			System.out.println(a*b - x);
			x = x - 1;
		}
		System.out.println(a*b);
	}
}
