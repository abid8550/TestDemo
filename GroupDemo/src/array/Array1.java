package array;

public class Array1 {
public static void main(String[] args) {
		
		int [] num = {10,20,30,40,50,60,70,80,90,100};
		// from github.com/TahsinAyman
		int sum = 0;
		for(int x : num) {
			System.out.println(x);
			sum = sum+x;
			
		}
		System.out.println("Sum: "+sum);
	}
}
