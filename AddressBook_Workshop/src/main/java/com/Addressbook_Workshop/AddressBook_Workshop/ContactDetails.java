package com.Addressbook_Workshop.AddressBook_Workshop;

public class ContactDetails{
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private int zip;
	private String phoneNumber;
	private String email;
	
	/**
	 * @param firstName , firstName of the person
	 * @param lastName , lastName  of the person
	 * @param address , address  of the person
	 * @param city , city in which he resides
	 * @param state , state in which he resides
	 * @param zip , zip of the city in which he resides
	 * @param phoneNumber , phoneNumber of the person
	 * @param email , email of the person
	 */
	public ContactDetails(String firstName,String lastName,
	String address,String city,String state,int zip,String phoneNumber,String email) {
		this.firstName =  firstName;
		this.lastName =  lastName;
		this.address = address;
		this.city =  city;
		this.state =  state;
		this.zip =  zip;
		this.phoneNumber =  phoneNumber;
		this.email =  email;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}
	/**
	 * @return the zip
	 */
	public int getZip() {
		return zip;
	}
	/**
	 * @param zip the zip to set
	 */
	public void setZip(int zip) {
		this.zip = zip;
	}
	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}
	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	/**
	 * Overrides the toString funtion present in Object class
	 */
	@Override
	public String toString() {
		return ("Name : "+firstName+" "+lastName+"\n"
				+ "Address : "+ address+", "+city+", "+state+"("+zip+")\n"
						+ "Phone No. "+phoneNumber+"\n"
								+ "Email : "+email  );
	}
}