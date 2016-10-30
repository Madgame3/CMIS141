import java.util.Scanner;
public class CarTest {
	public static void main(String[] args) {
		// Declare Variables		
		Boolean edit = false;
		//Create Scanner
		Scanner input = new Scanner(System.in);
		while(edit == false){		
			//Create new Car a
			System.out.println("Enter the Owners Name");					
			String ownersName = input.next();
			System.out.println("Enter the Cars Make");
			String carMake = input.next();
			System.out.println("Enter the Cars Model");	
			String carModel = input.next();
			System.out.println("Enter the Cars Year");					
			int carYear = input.nextInt();
			Car a = new Car(ownersName, carMake, carModel, carYear);				
			System.out.println(a.getOwnersName() + ", " + a.getCarMake() + ", " + a.getCarModel() + ", " + a.getCarYear());	
			System.out.println("Is this correct? (true/false)");
			edit = input.nextBoolean();
			if(edit == false) {
			System.out.println("Please Make Corrections");		
			}		

		}

	}	 
}