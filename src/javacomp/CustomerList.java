
package javacomp;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class CustomerList {
  StringProperty ID;
  //IntegerProperty TicketNo;
  StringProperty Title;
  StringProperty Time;

  
    public CustomerList()
    {
        ID = new SimpleStringProperty(this, "ID");
        Title = new SimpleStringProperty(this, "Title");
        Time = new SimpleStringProperty(this, "Time");
    }
    
    public StringProperty IDProperty() {
        return ID; 
    }    
    public String getID() {
        return ID.get(); 
    }
    public void setID(String id) {
        ID.set(id); 
    }
    
    public StringProperty TitleProperty() {
        return Title; 
    }
    public String getTitle() {
        return Title.get(); 
    }
    public void setTitle(String mtitle) {
        Title.set(mtitle); 
    }  
    
    public StringProperty TimeProperty() {
        return Time; 
    }
    public String getTime() {
        return Time.get(); 
    }
    public void setTime(String t) {
        Time.set(t); 
    }
    
}
