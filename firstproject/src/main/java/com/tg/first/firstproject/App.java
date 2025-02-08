package com.tg.first.firstproject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext con = new ClassPathXmlApplicationContext("com/tg/first/firstproject/config.xml");
    	
    	Customer c = (Customer) con.getBean("cus");
    	
        System.out.println( "name = " + c.getName() );
        System.out.println( "address = " + c.getAddress() );
        System.out.println( "contact = " + c.getContact() );
    }
}
