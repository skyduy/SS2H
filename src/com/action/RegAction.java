package com.action;

import bean.Customer;
import com.dao.CustomerDao;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class RegAction extends ActionSupport{
	private CustomerDao customerDao;
	private String customerId;
	private String name;
	private String phone;
	
	@Override
	public String execute() throws Exception{
		try{
			Customer cus = new Customer();
			cus.setCustomerId(this.getCustomerId());
			cus.setName(this.getName());
			cus.setPhone(this.getPhone());
			customerDao.addCustomer(cus);
		} catch(Exception ex){
			ex.printStackTrace();
			return INPUT;
		}
		return SUCCESS;
	}
	
	public void setCustomerDao(CustomerDao customerDao){
		this.customerDao = customerDao;
	}
	public String getCustomerId(){
		return customerId;
	}
	public String getName(){
		return name;
	}
	public String getPhone(){
		return phone;
	}
	public void setCustomerId(String cusid){
		this.customerId = cusid;
	}
	public void setName(String cusname){
		this.name = cusname;
	}
	public void setPhone(String cusphone){
		this.phone = cusphone;
	}
}
