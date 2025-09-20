import java.util.Scanner;
public class Program2 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
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

