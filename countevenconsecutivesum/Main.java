/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Main{
public static void countEvenSum(int arr[],int k){
    int count=0;
    for(int i=0;i<arr.length-k;i++){
        int sum=0;
        for(int j=i;j<i+k;j++){
            sum=sum+arr[i];
        if(sum%2==0){
            count++;
        }
        }
    }
    System.out.println("Total number of even Consecutive sum: "+count);
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of Array");
		int n=sc.nextInt();
		System.out.println("Enter the Size of subarray");
		int k=sc.nextInt();
		if(k>n){
        System.out.println("Please Enter Size of subarray less than size of array.");
        return;
    }
		int arr[]=new int[n];
		System.out.println("Enter the "+n+" Element for Array:");
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		countEvenSum(arr,k);
	}
}

