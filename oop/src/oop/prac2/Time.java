package oop.prac2;

public class Time implements Comparable<Time>{
	private int hour; 
	private int minute; 
	private int second;
	public Time(int hour, int minute, int second) {
        setTme(hour, minute, second);
	}
	
	public void setTme(int hour, int minute, int second) { 
		if ( hour < 0 || hour >=24 || minute < 0|| minute>=60|| second < 0|| second >=60) { 
			throw new IllegalArgumentException("Dalboeb ne pravilnoe vremya");
		}
		this.hour= hour; 
		this.minute= minute; 
		this.second= second; 
	}
	
	public String toUniversal() { 
		return String.format("%02d:%02d:%02d", hour, minute ,second);
	}
	public String toStandart() { 
		String period = (hour< 12)? "AM": "PM"; 
		int standartHour = ( hour==0 || hour ==12)? 12: hour %12; 
		return String.format("%02d:%02d:%02d %s", standartHour, minute, second, period); 
	}
	public void add(Time otherTme) { 
		int newHour = hour + otherTme.hour;
		int newMinute= minute+ otherTme.minute; 
		int newSecond= second + otherTme.second; 
		if (newSecond>= 60) { 
			newSecond %=60; 
			newMinute++ ; 
		}
		if(newMinute >= 60) { 
			newMinute%=60; 
			newHour++; 
		}
		if (newHour >= 24) { 
			newHour%=24; 
		}
		setTme(newHour, newMinute, newSecond);
	}
	
	@Override
    public String toString() {
        return String.format("%02d:%02d", hour, minute);
    }
	
	
	@Override
    public int compareTo(Time other) {
        int hourComparison = Integer.compare(this.hour, other.hour);
        if (hourComparison != 0) {
            return hourComparison;
        } else {
            return Integer.compare(this.minute, other.minute);
        }
    }
} 

