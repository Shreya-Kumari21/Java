import java.util.Scanner;

class swap{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a x: ");
		int x=sc.nextInt();
		System.out.println("Enter a y: ");
		int y=sc.nextInt();
		int t=0;
		
		t=x;
		x=y;
		y=t;
		System.out.println("X is "+x);
		System.out.println("Y is "+y);
		
	}
}