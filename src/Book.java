
public class Book {
	
	String name, lastname;
	String nomberphone;
	String birthday;
	
	
	public Book (String name, String lastname, String nomberphone, String birthday){
		
		this.name = name;
		this.lastname = lastname;
		this.nomberphone = nomberphone;
		this.birthday = birthday;
		
	}
	
	public void print(){
		System.out.println("Name = " + name);														
		System.out.println("Lastname = " + lastname);
		System.out.println("Nomber phone = " + nomberphone);
		System.out.println("Birthday = " + birthday);
	}
	
	

}




