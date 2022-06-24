import java.util.Scanner;
import java.lang.Math;

class area{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter a Number: ");
		int num=sc.nextInt();
		int total=0;
		int rem;
		while(num>0)
		{
		    rem=num%10;
			total=total+(rem*rem);
			num=num/10;
		}
		System.out.println(total);
	}
}