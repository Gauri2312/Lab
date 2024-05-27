//Q1)Create one to one relation between entityPerson and PassportDetails
package com.example.LabEx2HibernateOneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;


import com.util.HibernateUtil;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
  		Session session = sessionFactory.openSession();
  		session.beginTransaction();
  		try 
  		{
  		  Person person=new Person();
  		  person.setPcity("Mumbai");
  		  person.setpName("Titiksha");
  		  person.setPid(70);
  		  Passport passport=new Passport();
  		  passport.setPassNo(203);
  	      //passport.setPasswordId(123);
  		 
  		  person.setPassport(passport);
  		  passport.setPerson(person);
  		 
  		  session.save(person);
  		  session.getTransaction().commit();

  		  Person retrievedUser=session.get(Person.class, person.getPid());
  		  Passport retrievedAddress=retrievedUser.getPassport();

  		  System.out.println("User: "+retrievedUser.getpName());
  		  System.out.println("Address: "+retrievedAddress.getPassNo());
  		}
  		finally 
  		{
  			session.close();
              sessionFactory.close();
  		}
    }
}
