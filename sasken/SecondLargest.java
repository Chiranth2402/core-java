import java.util.Scanner;
public class SecondLargest{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		 System.out.print("Enter array size: ");
		 int n = scanner.nextInt();
		 
		 int arr[] = new int[n];
		 
		  System.out.print("Enter the array Element: ");
		  for(int i=0;i<n;i++){
			  arr[i]=scanner.nextInt();
		  }
		  int largest=Integer.MIN_VALUE;
		  int secondlargest=Integer.MIN_VALUE;
		  
		  for(int i=0;i<n;i++){
			  if(arr[i]>largest){
				  secondlargest=largest;
				  largest=arr[i];
			  }
			  else if(arr[i]>secondlargest&&arr[i]!=largest){
				  secondlargest=arr[i];
			  }
		  }
		  if(secondlargest==Integer.MIN_VALUE){
			   System.out.print("not found ");
		  }
		  else{
			   System.out.println("secondlargest:"+secondlargest);
		  }
		  scanner.close();
	}
}
