import java.util.Scanner;
public class ReverseArray{
	static void reverse(int arr[],int start,int end){
		while(start<end){
			int temp = arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
	}
	static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		
		 System.out.print("Enter array size: ");
		 int n = scanner.nextInt();
		 
		 int arr[]=new int[n];
		 
		  System.out.print("Enter the array element:");
		  for(int i=0;i<n;i++){
			  arr[i]=scanner.nextInt();
		  }
		  
		   System.out.print("Enter k: ");
		   int k=scanner.nextInt();
		   
		   k=k%n;
		   
		   reverse(arr,0,n-1);
		   reverse(arr,0,k-1);
		   reverse(arr,k,n-1);
		   
		    System.out.print("Array after Rotaion:");
			for(int i=0;i<n;i++){
			   System.out.print(arr[i]);
		  }
		  scanner.close();
	}
}

			
			