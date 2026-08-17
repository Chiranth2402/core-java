
import java.util.Scanner;
public class NextPrime{
	static boolean isPrime(int num){
		if(num<=1){
			return false;
		}
		for (int i=2;i*i<=num;i++){
			if(num%i==0){
				return false;
			}
			
		}
		return true;
	}
	
		public static void main(String[] args){
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Enter the number");
			int n = scanner.nextInt();
			
			int nextPrime=n+1;
			while(!isPrime(nextPrime)){
				nextPrime++;
			}
			System.out.println("The next prime number is :"+nextPrime);
			
			scanner.close();
		}
	}

