package com.upskill.java_5;

public class Encapsulation {
 
	
	//ENcapsulation used to hide the data using setter and getter method 
	
	private String name = "sami";                   //Write and read 
	private int ssn = 451236457;                    //Write
	private String username = "sami123";            //Read
	

	//Setter method - name 
			public void setname (String value) {     //set the data - write 
        name = value;
			}
	
	//Getter method - name 
			public String getname () {               //Get the name - read
				return name;
			
			}
	
	
	//Setter method - ssn 
			public void setSSN (int value) {          //Set the data - write 
	         ssn = value;
			
			}
	
			//Getter method - username 
			public String getUserName() {           //Get the date - Read
				return username; 
			}
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encapsulation obj = new Encapsulation ();
		obj.setname("Sazzad");
		System.out.println(obj.getname());
		obj.setSSN(65849756);
		System.out.println(obj.getUserName));
	}
}

