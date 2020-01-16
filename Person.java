public abstract class Person {
	
	//Person Attribute
	 protected String name;
	 protected int age;
	 protected String city;
	 protected String country;
	 
	//Person Constructor
	 public Person(String name,String city,String country){
			this.name=name;
			this.city=city;
			this.country=country;
		}
	 
	public void SpeakingLanguage(){
		System.out.println("We are speaking Dari");
	}
	
	public abstract void printinfo();

}
