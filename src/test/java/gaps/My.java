package gaps;

public class My {
	public static int sum(int n) {
    	if (n <= 0) {
        	return sum(n + 1);
    	}
    	return n + sum(n - 1);
	}
 	public static void main(String[] args) {
 		int i=6;
 		System.out.println(++i);
    	System.out.println(i--);
    	System.out.println(i--);
	}


}
