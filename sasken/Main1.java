import java.util.Scanner;

public class Main1{
	public static void main(String args[]){
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the size of the Array:");
		int num = scanner.nextInt();
		
		int arr[]=new int[num];
		
		System.out.println("Enter the array Element:");
		
		for(int i = 0;i <num;i++){
			arr[i]=scanner.nextInt();
		}
		int start=0;
		int end=num-1;
		
		while(start<end){
		
		int temp=arr[start];
		arr[start]=arr[end];
		arr[end]=temp;
		start++;
		end--;
		}
		System.out.println("the reversed array is :");
		
		for(int i=0;i<num;i++){
			System.out.println(arr[i]+" ");
		}
		scanner.close();
	}
}
