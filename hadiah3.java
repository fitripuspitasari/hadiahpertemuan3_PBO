import java.util.Scanner;
public class hadiah3 {
	public static void main (String [] args) {
		float panjang,lebar,luas;
		Scanner input = new Scanner ( System.in);
		System.out.print("Input Panjang = ");
		panjang = input.nextInt ();
		System.out.print("Input Lebar = ");
		lebar = input.nextInt ();
		
		luas = panjang*lebar;
		System.out.println("Luas = "+luas);
	}
}