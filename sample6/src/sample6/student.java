package sample6;
import java.util.*;
public class student {
private String name;
private int sid;
private List<String> Mobile;
private String deparment;

public student(String name, int sid, List<String> mobile, String deparment) {
	super();
	this.name = name;
	this.sid = sid;
	Mobile = mobile;
	this.deparment = deparment;
}

public void display()
{
	System.out.println("name :"+this.name+"\n"+"sid:"+this.sid+"\n"+"department:"+this.deparment+"\n");
Iterator i=Mobile.iterator();
while(i.hasNext())
{
	System.out.println(i.next());
}

}




}
