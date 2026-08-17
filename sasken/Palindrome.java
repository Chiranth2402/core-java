import java.util.Scanner;;

public class Palindrome{
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int number = scanner.nextInt();
		
		int original=number;
		int reverse=0;
		
		while(number!=0){
			int remainder=number%10;
			reverse=reverse*10+remainder;
			number=number/10;
		}
		System.out.println("Reversed number:"+reverse);
		if(original==reverse){
			System.out.println("Number is Palindrom");
		}
		else{
			System.out.println("Not a Palindrome");
		}
		scanner.close();
	}
}
