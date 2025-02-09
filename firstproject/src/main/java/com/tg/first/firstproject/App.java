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
//    	
//        System.out.println( "name = " + c.getName() );
//        System.out.println( "address = " + c.getAddress() );
//        System.out.println( "contact = " + c.getContact() );

    System.out.println( "name = " + c.toString() );
    	Order c1 = (Order) con.getBean("ord");
    	 System.out.println( "name = " + c1.toString() );
//    	System.out.println( "name = " + c.getProductName() );
//     System.out.println( "Product id = " + c.getProductId() );
//     System.out.println( "Customer = " + c.getCustomer() );
//     System.out.println( "Customer Name = " + c.getCustomer().getName() );
//     System.out.println( "Customer Address = " + c.getCustomer().getAddress() );
//     System.out.println( "Customer Contact = " + c.getCustomer().getContact() );
    }
}
