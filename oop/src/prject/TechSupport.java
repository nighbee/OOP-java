package prject;

import java.util.Objects;

public class TechSupport extends Employee {
    

	private String orderID;
	
	public TechSupport(String userID, String username, String email, String password) {
		super(userID, username, email, password);
		this.orderID= orderID; 
		// TODO Auto-generated constructor stub
	}
	
    public void viewOrder() {

    }

    public void acceptOrder() {
  
    }

    public boolean rejectOrder() {
      
        return false; 
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(orderID);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		TechSupport other = (TechSupport) obj;
		return Objects.equals(orderID, other.orderID);
	}

	public String getOrderID() {
		return orderID;
	}

	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}
    
    
    
}

