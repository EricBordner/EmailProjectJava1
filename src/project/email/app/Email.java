package project.email.app;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int mailboxCapacity = 500;
	private int defaultPasswordLength = 10;
	private String alternateEmail;
	private String companySuffix = "company.com";
	
	// Constructor to receive the first name and last name
	public Email(String firstName, String lastName) {
		this.firstName = firstName;   //this - class level  -- allows you to define the class level variable at the time of object creation  
		this.lastName = lastName;
		System.out.println("Email created: " + this.firstName + " " + this.lastName);
		
		// Call a method asking for the department - return the department
		this.department = setDepartment();
		System.out.println("Department: " + this.department);
		
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your password is: " + this.password);

		//Combine elements to generate email
		email = firstName.toLowerCase() + "." +lastName.toLowerCase() + "@" + department + "." + companySuffix;
		System.out.println("Your email is: " + email);
		
	}//this ends the constructor 

	
	// Ask for the department
	private String setDepartment() {
		System.out.print("New Worker: " + firstName + " " +lastName + "\nDepartment Codes: \n1 for Sales\n2 for Development\n for Accounting\n0 for none\nEnter Department Code: ");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
			if (depChoice == 1) {return "sales";}
			else if (depChoice ==2) { return "dev";}
			else if (depChoice ==3) { return "acct";}
			else {return "no department";}	
	}
	
	// Generate a random password
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*abcdefghijklmmopqrstuvwxyz";
		char[] password = new char[length];
		for (int i =0; i<length; i++) {
				int rand = (int) (Math.random() *passwordSet.length());
				password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}
	
	// Set the mailbox capacity
	public void setMailBoxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}
	
	// Set the alternate email
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}
	
	// Change the password
	public void changePassword(String password) {
		this.password = password;
	}
	
	public int getMailboxCapacity() {return mailboxCapacity;}
	public String getAlternateEmail() {return alternateEmail;}
	public String getPassword() {return password;}
	
	public String showInfo() {
		return "DISPLAY NAME: " + firstName + " " + lastName + "\nCompany Email: " + email + 
				"\nMailbox Capacity: " + mailboxCapacity + "mb";
	}
	
	
	
	
	
	
}
