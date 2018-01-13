package three;

public class TalkablePerson {

	String name;
	int age;
	
	public TalkablePerson(){
		
	}
	public TalkablePerson( String n, int a){
//		super ();
		this.name = n;
		this.age = a;
	}

	public void talk() {
		System.out.println("Hello my name is " + this.name);
	}
}
