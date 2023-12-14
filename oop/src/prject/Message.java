package prject;

import java.util.Date;
import java.util.Objects;

public class Message {
    private String text;
    private Date dateTime;
    private String messageID;
    
	public Message(String text, Date dateTime, String messageID) {
		super();
		this.text = text;
		this.dateTime = dateTime;
		this.messageID = messageID;
	}

	public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void sendMessage() {
     
    }

    public void editMessage(String newText) {
        this.text = newText;
         }

    public void delMessage() {
     
    }
    @Override
   	public int hashCode() {
   		return Objects.hash(dateTime, messageID, text);
   	}

   	@Override
   	public boolean equals(Object obj) {
   		if (this == obj)
   			return true;
   		if (obj == null)
   			return false;
   		if (getClass() != obj.getClass())
   			return false;
   		Message other = (Message) obj;
   		return Objects.equals(dateTime, other.dateTime) && Objects.equals(messageID, other.messageID)
   				&& Objects.equals(text, other.text);
   	}

}

