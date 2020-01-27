package spring2;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.xml.*;
import org.springframework.context.support.*;

import org.springframework.core.io.*;
public class Main {

	public static void main(String[] args) {
		
AbstractApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
		BeansClass1 obj=(BeansClass1)context.getBean("b");
		obj.getMessage();
		context.registerShutdownHook();

		

		}

	}


