package com.cognizant.dao;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.entity.EducationLoan;

import com.cognizant.entity.UserDetails;

@Component
public class viewEducationLoanDAO {
	
	@PersistenceContext
    private EntityManager em;


	@Transactional
	public List<EducationLoan> retrieveEducationLoanDetails(long accountNumber) {
		// TODO Auto-generated method stub
		UserDetails eld=em.find(UserDetails.class,accountNumber);
		System.out.println("///////////////////"+eld);
		System.out.println("11");
		System.out.println(eld.getEduList());
		return eld.getEduList();
	}
}
