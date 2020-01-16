
public class Student extends Person{

	//Student Attribute
	private String school_name;
	private int age;

	//Student Constructor
	public Student(String name,int age,String school_name,String city,String country){
		super(name, city,country);
		this.age=age;
		this.school_name=school_name;
		System.out.println("Students");
	}
	
	@Override 
	public void printinfo(){
		System.out.println("Name:"+name+"\t Age:"+age+ "\t School_name: "
	+school_name+"\tCity:"+city+"\tCountry:"+country+"\n");
	}
	
	//Setter and Getter method to access to School_name' private variable
	public String getSchool_name() {
		return school_name;
	}
	public void setSchool_name(String school_name) {
		this.school_name = school_name;
	}
	
}
