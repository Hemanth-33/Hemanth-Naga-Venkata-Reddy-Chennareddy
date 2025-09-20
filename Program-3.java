import java.util.Scanner;
public class Program3 {
	public static int fun(int n) {
		if(n%2 != 0)
			return n;
		else {
			return n - 1;
		}
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	a = fun(a);
	int i = 1,c = 0;
	while(c < a-1) {
		System.out.print(i + ", ");
		c++;
		i = i+2;
	}
	if(a >= 1)
	System.out.println(i);
	else
		System.out.println("Invalid number (must be >= 1)");
	
	sc.close();
}
}


