package hello.world;

public class HelloWorld implements Greeter{
	String name;
	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getGreeting() {
		return "Hello world from "+ name;
	}

}
