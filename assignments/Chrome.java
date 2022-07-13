package week1.assignments;

public class Chrome {
	//return type
	
    public String getname(String name) {
    	
	System.out.println("This is google chrome");	
    System.out.println(name);
    return name;
	}
	public static void main(String[] args) {
		Chrome ch = new Chrome();
		System.out.println("--Return type--");
		ch.getname("Browser");

	}

}
