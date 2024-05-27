//Q2)WAP to create OneToMany relationship between Employee and Project table
package com.example.LabEx1Hibernate1ToMany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;


import com.util.HibernateUtil;

public class App 
{
    public static void main( String[] args )
    {
    	SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
        Session session=sessionFactory.openSession();
        
        	try 
            {
            Project project=new Project();
            project.setpName("Real Estate Website");
            project.setPmembers(2);
            
            Project project1=new Project();
            project1.setpName("Student management system");
            project1.setPmembers(3);
            
            Employee emp1=new Employee();
            emp1.seteName("Gauri");
            emp1.seteAge(23);
            emp1.setProject(project);
          
            
            Employee emp2=new Employee();
            emp2.seteName("Arav");
            emp2.seteAge(23);
            emp2.setProject(project);
           
            
            Employee emp3=new Employee();
            emp3.seteName("Reva");
            emp3.seteAge(25);
            emp3.setProject(project1);
         
            Employee emp4=new Employee();
            emp4.seteName("Ovi");
            emp4.seteAge(24);
            emp4.setProject(project1);
        
            
            project.getEmployees().add(emp1);
            project.getEmployees().add(emp2);
            project1.getEmployees().add(emp3);
            project1.getEmployees().add(emp4);
            session.beginTransaction();
            session.save(project);
            session.save(project1);
            
            session.getTransaction().commit();
            }
            finally 
            {
            	session.close();
            	sessionFactory.close();
            }
           
  
    }
}

