package com.raghav.durgeshtuts;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.raghav.collectioninjection.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      ApplicationContext context = new ClassPathXmlApplicationContext("com/raghav/durgeshtuts/Config.xml");
      
      UserInfo user1 = (UserInfo) context.getBean("thisNameWillBeGivenInGetBeanMwthod");
      System.out.println(user1);
      
      UserInfo user2 = (UserInfo) context.getBean("thisNameWillBeGivenInGetBeanMwthod2");
      System.out.println(user2);
      
      UserInfo user3 = (UserInfo) context.getBean("thisNameWillBeGivenInGetBeanMwthod3");
      System.out.println(user3);
      
 // for collection injections :->
      ApplicationContext context2 = new ClassPathXmlApplicationContext("com/raghav/collectioninjection/CollectionConfig.xml");
      
      Employee emp1 = (Employee) context2.getBean("bean1");
      System.out.println(emp1);
      
    }
}
