import java.util.Scanner;
public class Do_while_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int i=11;

		do
		{
			sum = sum+i;
			i++;
		}
		while(i<=10);
		System.out.println("The sum is "+sum);
	}

}
