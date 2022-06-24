import java.util.Scanner;
class converter{
	public static void main(String[] args){
		System.out.println("Enter your celsius: ");
		Scanner sc=new Scanner(System.in);
		float a=sc.nextFloat();
		float f=32+(9*a)/5;
		System.out.println("Result: "+f);
	}
}