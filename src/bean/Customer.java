package bean;

public class Customer {
	private String customerId, name, phone;
	public Customer(){}
	public Customer(String customerId, String name, String phone){
		this.customerId = customerId;
		this.name = name;
		this.phone = phone;
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
