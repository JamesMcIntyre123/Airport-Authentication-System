/*
 * CMS 270
 * FlightAttendant class
 * 4/21/22
 * Nicole E, James M, Valeria E, Shaan C
 */

public class FlightAttendant extends Person{

	//Data members
	private String idNum;
	private String flightNum;
	private String expDate;

	//Constructor
	public FlightAttendant(String n, String d, String a, String i, String f, String e) {
		super(n,d,a);
		idNum = i;
		flightNum = f;
		expDate = e;
	}

	//Getters and setters
	public String getIdNum() {
		return idNum;
	}

	public void setIdNum(String i) {
		idNum = i;
	}

	public String getFlightNum() {
		return flightNum;
	}

	public void setFlightNum(String f) {
		flightNum = f;
	}

	public String getExpDate() {
		return expDate;
	}

	public void setExpDate(String e) {
		expDate = e;
	}

	//Authentication method
	public boolean authenticateFlightAttendant(FlightAttendant f) {

		if(getName().equals(f.getName()) && getIdNum().equals(f.getIdNum())
				&& getFlightNum().equals(f.getFlightNum())) {
			System.out.println(f.getName() + " validated successfully");
			return true;	
		}
		return false;
	}
}
