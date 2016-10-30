/* Author: Stephen Harrington
*  Date: September 18, 2016
*  Purpose: Create a List of Drivers and there Vehicles
*/

public class Car {
      
	
	// Declare variables
	private String ownersName;
	private String carMake;
	private String carModel;
	private int carYear;
	// Construtor used to create objects
	public Car(String ownersName, String carMake, String carModel, int carYear) {
		this.setOwnersName(ownersName);
		this.setCarMake(carMake);
		this.setCarModel(carModel);
		this.setCarYear(carYear);
	}
	// Getter and Setter methods used to access private fields
	public String getOwnersName() {
		return ownersName;
	}
	public void setOwnersName(String ownersName) {
		this.ownersName = ownersName;
	}
	public String getCarMake() {
		return carMake;
	}
	public void setCarMake(String carMake) {
		this.carMake = carMake;
	}
	public String getCarModel() {
		return carModel;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	public int getCarYear() {
		return carYear;
	}
	public void setCarYear(int carYear) {
		this.carYear = carYear;
	}
}
	
	