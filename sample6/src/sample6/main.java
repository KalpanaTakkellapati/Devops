package sample6;
import org.springframework.beans.factory.xml.*;
import org.springframework.beans.factory.*;
import org.springframework.core.io.*;
public class main {

	public static void main(String[] args) {
		//ApplicationContext a=new ClassPathXmlApplicationContext("ApplicationContext.xml");
   BeanFactory b=new XmlBeanFactory(new ClassPathResource("ApplicationContext.xml"));
		student d=(student)b.getBean("s");
		d.display();
		
	}

}
