import java.util.Scanner;
public class Floating_no_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in);

	        System.out.print("Input floating-point number: ");
	        double A = in.nextDouble();
	        System.out.print("Input floating-point another number: ");
	        double B = in.nextDouble();

	        A = Math.round(A * 1000);
	        A = A / 1000;

	        B = Math.round(B * 1000);
	        B = B / 1000;

	        if (A == B)
	        {
	            System.out.println("They are the same up to three decimal places");
	        }
	        else
	        {
	            System.out.println("They are different");

	}

}
}
