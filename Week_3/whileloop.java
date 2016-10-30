public class whileloop{
// this program outputs even and odd numbers through 100
	public static void main(String[] args){
		for(int i=1; i<101; i++){
			//mod the number to determine if its odd or even
			int remainder = i % 2;	
			if(remainder==1){
				System.out.println(i + " is an odd number");
			}
			else{
				System.out.println(i + " is an even number");
			}
	
		}
	}
}
