import java.util.Scanner;
import java.lang.Math;

class range{
	public static void main(String[] args){
		System.out.println("Enter your bit: ");
		Scanner sc=new Scanner(System.in);
		double a=sc.nextDouble();
		double max=Math.pow(2,a-1)-1;
		double min=-1*Math.pow(2,a-1);
		
		System.out.println(max+" to "+min);
		//System.out.println("Result: "+min);
	}
}