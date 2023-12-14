package prject;

import java.util.Date;
import java.util.Objects;

public class News {
    private String text;
    private Date date;
    
    
    
    public News(String text, Date date) {
		super();
		this.text = text;
		this.date = date;
	}

	public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

	@Override
	public int hashCode() {
		return Objects.hash(date, text);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		News other = (News) obj;
		return Objects.equals(date, other.date) && Objects.equals(text, other.text);
	}
    
    
}