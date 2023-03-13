package com.taskex;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;



public class Main 
{
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Arjun");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		StudentDetails studentDetails=new StudentDetails();
		studentDetails.setStudentname("Arjun");
		studentDetails.setFees(50000.0);
		studentDetails.setTeachername("shreya");
		studentDetails.setBalancefees(18000.0);
		studentDetails.setDateofjoin("1-Jan-2022");
		
		StudentDetails studentDetails1=new StudentDetails();
		studentDetails1.setStudentname("Shiva");
		studentDetails1.setFees(30000.0);
		studentDetails1.setTeachername("Kamala");
		studentDetails1.setBalancefees(15000.0);
		studentDetails1.setDateofjoin("2-Feb-2022");
		
		
		StudentDetails studentDetails2=new StudentDetails();
		studentDetails2.setStudentname("Abhi");
		studentDetails2.setFees(40000.0);
		studentDetails2.setTeachername("Arunaa");
		studentDetails2.setBalancefees(20000.0);
		studentDetails2.setDateofjoin("7-Jan-2022");

		StudentDetails studentDetails3=new StudentDetails();
		studentDetails3.setStudentname("nagarjun");
		studentDetails3.setFees(50000.0);
		studentDetails3.setTeachername("karuna");
		studentDetails3.setBalancefees(25000.0);
		studentDetails3.setDateofjoin("4-Jan-2022");
		
		entityTransaction.begin();
		entityManager.persist(studentDetails);
		entityManager.persist(studentDetails1);
		entityManager.persist(studentDetails2);
		entityManager.persist(studentDetails3);
		entityTransaction.commit();

		
		
		
	}

}
