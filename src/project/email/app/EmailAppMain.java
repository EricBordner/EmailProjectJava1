package project.email.app;

public class EmailAppMain {

	public static void main(String[] args) {
		Email em1 = new Email("John", "Smith");
		
		//em1.changePassword(password);
		em1.setAlternateEmail("JS01@gmail.com");
		System.out.println("The alternate email for your Account is: " + em1.getAlternateEmail());
		//em1.setMailBoxCapacity(0);
		System.out.println("---------------------------------------");
		System.out.println(em1.showInfo());
	}
}
