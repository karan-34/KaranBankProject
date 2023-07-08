package com.mvc4.repo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.stereotype.Repository;

import com.mvc4.beans.User;

@Repository   // use database connectivity and provided clearity // provided run time object
public class ProjectDao {

	public boolean singup(String userName,String email,String password,String nickName ) {
		
		User user1=new User();
		user1.setEmail(email);
		user1.setUserName(userName);
		user1.setPassword(password);
		user1.setNickName(nickName);
		
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("karan");
		EntityManager manager=factory.createEntityManager(); 
		EntityTransaction transaction=manager.getTransaction();
		
		try {
		transaction.begin();
		manager.persist(user1);
		transaction.commit();
		return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		
	
	 }
	
	public boolean login(String email,String password) {
		

		
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("karan");
		EntityManager manager=factory.createEntityManager(); 
		
          User  user2=manager.find(User.class, email);
//          
//          try {
//          user2.getEmail();
//          user2.getPassword();
//          return true;
//          }catch(Exception e) {
//        	  e.printStackTrace();
//        	  return false;
//          }
         //  userid null hui toh false given hoga or password control ka or user ka same hua tih true oth false
          
        //userid hai toh verify karlega pehlehi 
       // verify password same hai ya nhi
        //yeh form ka hai 
          
          if(user2 == null) {      
        	  return false;
          }                  
          if(user2.getPassword().equals(password)) { 
        	  return true;
          }else {
        	  return false;
          }	
	}
	
	public boolean forgotPasswordSubmit(String email,String nickName) {

		EntityManagerFactory factory=Persistence.createEntityManagerFactory("karan");
		EntityManager manager=factory.createEntityManager(); 
	     User  user3=manager.find(User.class, email);
		if(user3 == null) {
			return false;
			
		}
		if(user3.getNickName().equalsIgnoreCase(nickName)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean passwordUpdated(String email,String password) {
		
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("karan");
		EntityManager manager=factory.createEntityManager(); 
	    EntityTransaction transaction=manager.getTransaction();
	    
	    User  user3=manager.find(User.class, email);
	    

	    if( user3 == null) {
			return false;
		}
	    
		try {
			user3.setPassword(password);
			transaction.begin();
			manager.persist(user3);
			transaction.commit();
			return true;
			}catch(Exception e) {
				System.out.println(e.getMessage());
				return false;
			}
	    
		
	}
	
	
}
