public class whileValue {   

   public static void main(String[] args) {
   		int valorActual = 0;
		int num=-1;
	valorActual=Integer.parseInt(args[0].toString());
	
	if(valorActual-1>num){
	while(valorActual-1>num){      
valorActual=valorActual-1;
System.out.println("El valor Actual es = " +valorActual);
	}	
}
else {
  System.out.println(valorActual);
}   
      
   }

}