
 while (num < numero) 
		
		{
		
                if ( (num % 5 == 0) && (num%3!=0)){

		// si el numero es divisible dentro de 5 imprima "Flop"
			System.out.print("Flop ");
		
		}
		else
		if ((num % 3 == 0) &&(num %5!=0)){

		// si el numero es divisible dentro de 3 imprima "Flip"
			System.out.print("Flip ");

   		}
		else
		if ((num %5 ==0) && (num % 3==0)){
   		// si el numero es divisible dentro de 3 y 5 imprima "FlipFlop"
			System.out.print("FlipFlop ");
		} 
		else 
		{
		
   		// de lo contrario, imprima el numero
      		System.out.print(num+" ");
		}
   		
		num++;  
		}            
                 
   }

}