class Task3{
	
	
	public static void main(String args[]){
		
		try{
            if(args[0].matches("\\d+")){
				throw new RuntimeException("You can't loop over numbers just strings");
			}
			int Iteration = Integer.parseInt(args[1]);
			if(Iteration <=0 ){
				throw new RuntimeException("Number of interation must be positive");
			}
		int i = 0;
		while(i < Iteration){
			System.out.println(args[0]);
			i++;
		}
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		
		
		
		
	}
	
	
	
}