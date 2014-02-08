public class FlipFlop {   

   public static void main(String[] args) {
   		int numero = 0;
		int num1 = 0;
	
numero=Integer.parseInt(args[0].toString());
		
		while(num1<numero){
		
		 if ((num1%5==0)&&(num1%3==0)) {
			// si el numero es divisible dentro de 3 imprima "Flip"
			System.out.println("FlipFlop");
					}
		else if (num1%3==0) {
			// si el numero es divisible dentro de 5 imprima "Flop"
			System.out.println("Flip");
			}
 		else if (num1%5==0){
			// FlipFlop si el numero es divisible dentro de 3 y 5
				System.out.println("Flop");	
				}
		else{
				// de lo contrario, imprima el numero
      				System.out.println(num1);
					}
	num1++;
							
			}
		}
	}