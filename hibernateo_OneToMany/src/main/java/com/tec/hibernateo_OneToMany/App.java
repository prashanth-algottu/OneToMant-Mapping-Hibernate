package com.tec.hibernateo_OneToMany;



import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //Creating session
    	Session session = new Configuration().configure().addAnnotatedClass(Customer.class)
    	.addAnnotatedClass(Orders.class).buildSessionFactory().openSession();
    	
    	Transaction tx = session.beginTransaction();
    	
    	//CURD Operations
    	Orders order1 = new Orders(701, "Pizza", 300);
    	Orders order2 = new Orders(702, "Burger", 350);
    	Orders order3 = new Orders(703, "McDonals", 400);
    	Orders order4 = new Orders(704, "CoolDrink", 80);
    	
    	
    
    	Customer c1 = new Customer(1, "chinnu");
    	Customer c2 = new Customer(2, "prashanth");
    	
   
    	
    	order1.setCustomer(c1);
    	order2.setCustomer(c1);
    	order3.setCustomer(c1);
    	order4.setCustomer(c2);
    	
   
    	session.save(order2);
    	session.save(order1);
    	session.save(order4);
    	session.save(order3);   	
    	
    	
    	
    	
    	
    	
    	
    	tx.commit();
    }
}
