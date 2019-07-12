    package com.javatpoint;  
      
    import org.springframework.beans.factory.BeanFactory;  
    import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;  
    import org.springframework.core.io.Resource;  
      
    public class Test {  
    public static void main(String[] args) {  
        //Resource resource=new ClassPathResource("applicationContext.xml");  
        //BeanFactory factory=new XmlBeanFactory(resource);  
        ApplicationContext factory =   
                new ClassPathXmlApplicationContext("applicationContext.xml");    
        Student student=(Student)factory.getBean("studentbean");  
        student.displayInfo(); 
        System.out.println(student.getName());
        student=(Student) factory.getBean("stbean");
        student.displayInfo();
    }  
    }  