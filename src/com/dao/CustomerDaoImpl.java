package com.dao;

import bean.Customer;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
public class CustomerDaoImpl extends HibernateDaoSupport implements CustomerDao {

	@Override
	public void addCustomer(Customer cus) {	
		try{
			this.getHibernateTemplate().save(cus);
		}catch(Exception ex){
			ex.printStackTrace();
			System.out.println("123");
		}
	}
}
