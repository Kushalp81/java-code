import java.util.Scanner;
public class largest_nested_if_ {

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
		if(x>=y)
		{
			if(x>=z)
				System.out.println("The Largest No. is "+x);
			
		}
		else
			System.out.println("The Largest No. is "+z);
		{
			if(y>=z)
				System.out.println("The Largest No. is "+y);
		}
						

	}

}
