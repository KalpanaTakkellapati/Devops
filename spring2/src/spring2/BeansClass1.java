package spring2;

public class BeansClass1 {
	String message;

	public void getMessage() {
	System.out.println("Hello!"+message);
	}

	public void setMessage(String message) {
	this.message = message;
	}
	public void init()
	{
	System.out.println("init method");
	}
	public void destroy()
	{
	System.out.println("Destroy method");
	}
	}

