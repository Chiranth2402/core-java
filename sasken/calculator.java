import java.util.Scanner;
public class calculator{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		double a;
		double b;
		char sign;
		double result=0;
		
		System.out.println("Enter value of a:");
		a=scanner.nextDouble();
		
		System.out.println("Enter the operator:");
		sign=scanner.next().charAt(0);
		
		System.out.println("Enter the valueof b:");
		b=scanner.nextDouble();
		
		switch(sign){
			case '+'-> result=a+b;
			case '-'-> result=a-b;
			case '*'-> result=a*b;
			case '/'->{
				if(b==0)
				{
					System.out.println("Invalid Operator:");
				}
				else
				{
					result=a/b;
				}
			}
			default->{
				System.out.println("Invalid operator");
			}
		}
		System.out.println(result);
		
		scanner.close();
	}
}
				
					
		
