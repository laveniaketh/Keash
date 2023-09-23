
package javacomp;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class MovieList {
  StringProperty movieID;
  StringProperty movieTitle;
  StringProperty t1;
  StringProperty  t2;
  StringProperty  t3;
     
    public MovieList()
    {
        movieID = new SimpleStringProperty(this, "movieID");
        movieTitle = new SimpleStringProperty(this, "Title");
        t1 = new SimpleStringProperty(this, "Timeslot 1");
        t2 = new SimpleStringProperty(this, "Timeslot 2");
        t3 = new SimpleStringProperty(this, "Timeslot 3");
    }
    public StringProperty movieIDProperty() {
        return movieID; 
    }
    
    public String getMovieID() {
        return movieID.get(); 
    }
    public void setMovieID(String id) {
        movieID.set(id); 
    }
    public StringProperty movieTitleProperty() {
        return movieTitle; 
    }
    public String getMovieTitle() {
        return movieTitle.get(); 
    }
    public void setMovieTitle(String mtitle) {
        movieTitle.set(mtitle); 
    }  
    public StringProperty t1Property() {
        return t1; 
    }
    public String getT1() {
       return t1.get(); 
    }
    public void setT1(String timeslot) {
        t1.set(timeslot); 
    }
    public StringProperty t2Property() {
        return t2; 
    }
    public String getT2() {
       return t2.get(); 
    }
    public void setT2(String timeslot) {
        t2.set(timeslot); 
    }
    public StringProperty t3Property() {
        return t3; 
    }
    public String getT3() {
       return t3.get(); 
    }
    public void setT3(String timeslot1) {
        t3.set(timeslot1); 
    }
}
