public class Task1{
	
public static int calcMax(int[] arr){
	int max =  Integer.MIN_VALUE;
	for(int i = 0;i<arr.length;i++){
		if(arr[i]>max){
			max = arr[i];
		}
	}
	return max;
}	

public static int calcMin(int[] arr){
	int min = Integer.MAX_VALUE;
	for(int i = 0;i<arr.length;i++){
		if(arr[i]<min){
			min = arr[i];
		}
	}
	return min;
}

public static void main(String args[]){
	int[] arr = new int[1000];
	for(int i = 0;i<arr.length;i++){
		arr[i] = (int) (Math.random()*1000 + 1);
	}
	long start = System.nanoTime();
	System.out.println("Max = "+Task1.calcMax(arr)+" Min = "+Task1.calcMin(arr));
	long end = System.nanoTime();
	System.out.println("Time passed in nano: "+(end-start));
}

}