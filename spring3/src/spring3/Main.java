package spring3;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;  
public class Main {

	public static void main(String[] args) {
		
			AbstractApplicationContext ap=new ClassPathXmlApplicationContext("ApplicationContext.xml");
			studentDao s1=(studentDao)ap.getBean("s");
			int count=s1.saveStudent(new student(101,"man"));
			System.out.println(count+"rows updated");

			}


	}

}
