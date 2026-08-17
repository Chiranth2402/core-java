import java.util.Scanner;

public class RemoveDuplicate{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the size of the array:");
		int n = scanner.nextInt();
		
		int arr[]=new int[n];
		
		System.out.println("Enter thr array:");
		for(int i =0;i<n;i++){
			arr[i]=scanner.nextInt();
		}
		
		if(n==0){
			System.out.println("Array is Empty");
			return;
		}
		
		int j =0;
		
		for(int i =0; i<n;i++){
			if(arr[i]!=arr[j]){
				j++;
				arr[j]=arr[i];
			}
		}
		System.out.println("/n new length:"+(j+1));
		System.out.println("the array is:");
		for(int i =0;i<=j;i++){
			System.out.println(arr[i]+" ");
		}
		scanner.close();
	}
}
