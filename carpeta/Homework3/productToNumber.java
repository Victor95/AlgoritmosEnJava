public class productToNumber {   

   public static void main(String[] args) {
	int resultado = 0;
	int total = 0;
	
	resultado = Integer.parseInt(args[0].toString());

	for(int x=resultado-1; x>0 ; x--)
	{						
		
		if(x==resultado-1){
			total = resultado*x;
		}else{
			total = total*x;
		
		}
	} 
	
	if(resultado!=0){
		if(resultado==1){	
			System.out.println("el producto es = 1");
		}else{
			System.out.println("el producto es = " +total);	    
		}
	}else{
		System.out.println("el producto es = 1");
	}
   }

}