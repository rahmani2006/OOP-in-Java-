
public class Mentor extends Person{

	//Mentor Attribute
	private String subject;

	//Mentor Constructor
	public Mentor(String name, String subject,String city,String country ) {
		super(name, city,country);
		this.subject=subject;
		System.out.println("Mentors");
	}
	
	@Override
	public void printinfo(){
		System.out.println("Name:"+name+"\t Subject:"+subject
				+"\tCity:"+city+"\tCountry:"+country+"\n");
	}
	
	//Setter and Getter method to access to subject private variable
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
}
