package com.cognizant.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.entity.HomeLoanVO;
import com.cognizant.entity.UserDetails;

@Component
public class ApplyHomeLoanDAO {
	
	@PersistenceContext
	private EntityManager em;

	@Transactional
	public void insertHomeLoanDetails(UserDetails userDetails) {

	
		em.persist(userDetails);
	
	}
	

	public UserDetails updateLoanDetails(long acc) {
	UserDetails userDetails=em.find(UserDetails.class,acc);
	return userDetails;
	
	}

	@Transactional
	public boolean validUser(long accountNumber)
	{
		
		UserDetails userDetails=em.find(UserDetails.class,accountNumber);
		

		//if(result>0)
		//return true;
	
		return false;
	

}
	
	public UserDetails getUserDetails(long l) {
		// TODO Auto-generated method stub
		UserDetails retrive = em.find(UserDetails.class, l);

		return retrive;
	}
	
}
	
	/*public List<Employee> findEmployeesBySalary(double salary) {
	Query query = em.createQuery("from Employee e where e.salary < ?");
	query.setParameter(1, salary);
	List<Employee> employees = query.getResultList();
	return employees;
}*/
