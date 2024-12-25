class Task2{
	
	
	public static void main(String args[]){
	
		int i = 0; 
		if(args.length==0){
			System.out.println("You did't enter any values");
		}else{
		while(i  < args.length){
			System.out.println(args[i]);
			i++;
		}
		}
	}
	
	
	
}