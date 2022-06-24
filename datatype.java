import java.util.Scanner;
class datatype{
	public static void main(String[] args){
		System.out.println("Enter your datatype: ");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println("byte=1;short=2");
		switch(a){
			case 1:
			System.out.println("-128 to 127");
			break;
			
			case 2:
			System.out.println("-32768 to 32767");
			break;
		}
	}
}