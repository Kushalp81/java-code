import java.util.Scanner;
public class largest_if_else_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x, y, z;
		
		Scanner sc = new Scanner(System.in);  
		System.out.println("Enter the first number:");  
		x = sc.nextInt();  
		System.out.println("Enter the second number:");  
		y = sc.nextInt();  
		System.out.println("Enter the third number:");  
		z = sc.nextInt();  
		if(x>=y&&x>=z)
			System.out.println(x+ "is the Largest Number");
		else if(y>=x&&y>=z)
			System.out.println(y+ "is the Largest Number");
		else
			System.out.println(z+ "is the Largest Number");

	}

}
