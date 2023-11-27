package lab3;
import java.util.Vector;
import java.util.Date;
import java.util.Objects; 
import java.util.Comparator; 

public class Manager extends Employee{
	private Vector<Employee> team; 
	private double bonus; 
	
	public  Manager(String name, double annualSalary, Date hireDate, String nationalInsuranceNum, Vector<Employee> team, double bonus) { 
		super(name, annualSalary, hireDate, nationalInsuranceNum);
		this.team= team; 
		this.bonus= bonus; 
	}
	
	public Vector<Employee> getTeam(){ 
		return team; 
	}
	
	public void setTeam(Vector<Employee> team) { 
		this.team = team; 
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	@Override
	public String toString() {
		return "Manager{name='" + getName() + "', annualSalary=" + getAnnaualSalary() +
                ", hireDate=" + getHireDate() + ", nationalInsuranceNumber='" + getNatioanalInsuranceNum() +
                "', bonus=" + bonus + ", team=" + team + "}";
	}

	@Override
	public int hashCode() {
		 return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        if (!super.equals(obj)) {
            return false;
        }
        Manager manager = (Manager) obj;
        return Double.compare(manager.bonus, bonus) == 0 && team.equals(manager.team);
	}
	
	protected Manager clone() throws CloneNotSupportedException {
        Manager manager = (Manager) super.clone();
        manager.team = (Vector<Employee>) this.team.clone();
        return manager;
    }
	
	public int compareTo(Manager other) {
        int salaryComparison = super.compareTo(other);
        if (salaryComparison != 0) {
            return salaryComparison;
        } else {
            return Double.compare(this.getBonus(), other.getBonus());
        }
    }
	
	
}
