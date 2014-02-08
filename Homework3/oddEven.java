public class oddEven {   

   public static void main(String[] args) {
      
      	System.out.println(args[0]);
		int num;
		num=Integer.parseInt(args[0].toString());
	if (num%2==0){
   		// si el numero es par
   			System.out.println("es numero par");}

	else{
   		// si el numero es impar
			
   			System.out.println("es numero impar");}

   }
}