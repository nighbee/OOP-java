package oop.Lab1;

public class temp {
	private double temp; 
	private char scale;
	
	public temp() { 
		this.temp=0; 
		this.scale= 'C'; 
	}
	
	public temp(double temp) { 
		this.temp= temp; 
		this.scale= 'C'; 
	}
	
	public temp(char scale) { 
		this.temp=0; 
		this.scale=scale; 
	}
	
	public temp( double temp, char scale) { 
		this.temp= temp ; 
		this.scale=scale; 
	}
	public double getTempInCelcius() { 
		if(scale=='C') { 
			return temp; 
		}
		else { 
			return (5*(temp -32))/9; 
		}
	}
	
	public double getTempInFarh() { 
		if(scale=='F') { 
			return temp;
		}
		else {
			return (9*temp/5)+32; 
		}
	}
	
	public void setTemp(double temp) { 
		this.temp=temp; 
	}
	
	public void setScale(char scale) { 
		this.scale=scale; 
	}
	
	public void setTempAndScale(double temp, char scale) { 
		this.temp=temp; 
		this.scale=scale; 
	}
	public char getScale() { 
		return scale; 
	}
	
}
