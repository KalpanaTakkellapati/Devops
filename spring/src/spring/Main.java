package spring;

import org.springframework.beans.factory.*;
import org.springframework.beans.factory.xml.*;
import org.springframework.core.io.*;

public class Main {

	public static void main(String[] args) {
		BeanFactory bf=new XmlBeanFactory(new ClassPathResource("ApplicationContext.xml"));
	B a1=(A)bf.getBean("s");
	a1.setMessage("hello welcome");
	a1.getMessage();
	B b1 = (A)bf.getBean("s");
	b1.setMessage("welcome to spring");
	b1.getMessage();
	
	}
}
