import java.util.*;
public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Please enter length:");
		int n=sc.nextInt();
		if(n>0)
		{
			printPattern(n);
		}	
	}
	
	public static void printPattern(int n) {
		for(int i=1;i<=n;i++)
		{
			for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }
			System.out.print(" _ ");
			for (int j = 0; j < 2 * (n - i) + 1; j++) {
                System.out.print("*");
            }
			System.out.println();
		}
	}

}
