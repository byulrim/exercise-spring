package net.da.spring.onetoone.sample3;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class HelloApp {

	public static void main(String[] args) {

		FileSystemResource fsResource = new FileSystemResource("beans.xml");
//		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("beans.xml"));
		BeanFactory factory = new XmlBeanFactory(fsResource);
		MessageBean bean = factory.getBean("oneToOneMessageBean", MessageBean.class);
		bean.sayHello("Spring");
	}	

}
