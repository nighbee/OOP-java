package prac3;

class employee extends Person  {
	private String school; 
	private int pay; 
	
	public employee() { 
		// defo const
	}
	
	public employee(String address, String name, String school, int pay) { 
		super(name,address); 
		this.pay=pay; 
		this.school=school; 
	}
	
	public void setPay() { 
		this.pay = pay ; 
	}
	public void setSchool() { 
		this.school=school; 
	}
	
	public int getPay() { 
		return pay; 
	}
	public String getSchool() { 
		return school;
	}
	public String toString() { 
		return "Staff "+ super.getName() + " payment "+ pay + "$, sChool "+ school; 
	}
	
}
