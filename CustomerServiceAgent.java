/*
 * CMS 270
 * CustomerServiceAgent class
 * 4/21/22
 * Nicole E, James M, Valeria E, Shaan C
 */

public class CustomerServiceAgent extends Person {

	//Data members
	private String badgeNum;
	private String code;

	//Constructor
	public CustomerServiceAgent(String n, String d, String a, String b, String c) {
		super(n,d,a);
		badgeNum = b;
		code = c;

	}

	//Getters and setters
	public String getBadgeNum() {
		return badgeNum;
	}
	public void setBadgeNum(String b) {
		badgeNum = b;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String c) {
		code = c;
	}

	//Authentication method
	public boolean authenticateCustomerServiceAgent(CustomerServiceAgent c) {

		if(getName().equals(c.getName()) && getBadgeNum().equals(c.getBadgeNum()) 
				&& getCode().equals(c.getCode())) {
			System.out.println(c.getName() + " validated successfully");
			return true;	
		}
		return false;
	}
}