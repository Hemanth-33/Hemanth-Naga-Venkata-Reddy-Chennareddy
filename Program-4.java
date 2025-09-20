import java.util.*;
public class Program4 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    LinkedHashMap<Integer,Integer> lm = new LinkedHashMap<Integer,Integer>();
    for(int i = 1;i<10;i++) {
    	lm.put(i, lm.getOrDefault(i, 0));
    }
	ArrayList<Integer> b = new ArrayList<Integer>();
	System.out.println("enter the input numbers (press -1 to stop)");
	while(true) {
		int num = sc.nextInt();
		if(num == -1)
			break;
		else
			b.add(num);
		
	}
	for(int i : lm.keySet()) {
		for(int j : b) {
			if(j % i == 0)
			{
				lm.put(i, lm.get(i)+1);
			}
		}
	}
	System.out.println(lm);
	
	
	sc.close();
}
}

