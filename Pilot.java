/*
 * CMS 270
 * Pilot class
 * 4/21/22
 * Nicole E, James M, Valeria E, Shaan C
 */

public class Pilot extends Person{

	//Data members
	private String licenseId;
	private String aircraftNum;

	//Constructor
	public Pilot(String n, String b, String a, String l, String p) {
		super(n, b, a);
		licenseId = l;
		aircraftNum = p;
	}

	//Getters and Setters
	public String getLicenseId() {
		return licenseId;
	}

	public void setLicenseId(String l) {
		licenseId = l;
	}

	public String getAircraftNum() {
		return aircraftNum;
	}

	public void setAircraftNum(String p) {
		aircraftNum = p;
	}

	//Authentication method
	public boolean authenticatePilot(Pilot p) {

		if (getName().equals(p.getName()) && getLicenseId().equals(p.getLicenseId())
				&& getAircraftNum().equals(p.getAircraftNum())) {
			System.out.println(p.getName() + " validated successfully");
			return true;
		}
		return false;
	}
}