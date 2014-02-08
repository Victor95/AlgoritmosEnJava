public class productToNumber {   

   public static void main(String[] args) {
   		int num=0; 
		int num1=0;
		num=Integer.parseInt(args[0].toString());
		for (int i=num-1;i>0;i--)
		{
 if(i==num-1){
	num1=num*i;
}else{
	num1=num1*i;
}
 }  		
if(num!=0){
	if(num==1){
System.out.println("el producto es: = 1");
 			}     
else{
System.out.println("el producto es: = "+num1);
}
}
else{
System.out.println("el producto es: = 1");
   }

}
}