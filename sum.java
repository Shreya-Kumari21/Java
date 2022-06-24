import java.util.Scanner;
class value {
	public static void main(String[] args){
		System.out.println("Enter your number : ");
		Scanner sc=new Scanner(System.in);
		byte a = sc.nextByte();
		byte b = sc.nextByte();
	    int sum = a+b;
		
		System.out.println("Result : "+sum);
	}
}  