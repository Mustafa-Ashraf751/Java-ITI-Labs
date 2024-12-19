public class Task2{

public static int binarySearch(int[] arr,int search){
	int start = 0; int end = arr.length-1; int mid = (start + end)/2; 
	for(int i = 0;i<arr.length;i++){
		if(arr[mid] == search){
			return mid;
		}else if(arr[mid] > search){
			end = mid;
			mid = (start + end)/2;
		}else if(arr[mid]<search){
			start = mid;
			mid = (start + end)/2;
		}
	}
	return -1;
}


public static void main(String args[]){
	int[] arr = new int[1000];
	for(int i = 0;i<arr.length;i++){
		arr[i] = i;
	}
	long startTime = System.nanoTime();
	int search = 67;
	int result = binarySearch(arr,search);
	if(result == - 1){
		System.out.println("Element not found");
	}else{
		System.out.println("Element found at: "+result);
	}
	long endTime = System.nanoTime();
	System.out.println("Time passed in nano: "+(endTime-startTime));
}

}