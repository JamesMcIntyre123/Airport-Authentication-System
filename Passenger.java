/*
 * CMS 270
 * Passenger Class
 * 4/21/22
 * Nicole E, James M, Valeria E, Shaan C
 */

public class Passenger extends Person{

	//Data members
	private String passportNum;
	private String boardingPassId;

	//Constructor
	public Passenger (String n, String d, String a, String p, String b) {
		super(n,d,a);
		passportNum = p;
		boardingPassId = b;
	}

	//Getters and setters
	public String getPassportNum() {
		return passportNum;
	}
	public void setPassportNum(String p) {
		boardingPassId = p;
	}
	public String getBoardingPassId() {
		return boardingPassId;
	}
	public void setBoardingPassId(String p) {
		boardingPassId = p;
	}

	//Authentication method
	public boolean authenticatePassenger(Passenger p) {

		if(getName().equals(p.getName()) && getPassportNum().equals(p.getPassportNum())
				&& getBoardingPassId().equals(p.getBoardingPassId())) {
			System.out.println(p.getName() + " validated successfully");
			return true;
		}
		return false;
	}
}