import java.util.LinkedList;



public class Event {
     private String type;              // wedding, etc.
     private Date date;
     private boolean isEvening;   // true if the event is to be held in the evening

     public Event(String type, Date date, boolean isEvening) {
          this.type = type;
          this.date = date;
          this.isEvening = isEvening;
     }
         
  // returns true if a conflict
     public boolean hasConflict (Event e1, Event e2){
          return date.dateSame(e1.date, e2.date) && e1.isEvening == e2.isEvening;
     }
     
}




class Date {
     private String month;
     private int day;
     private int year;

     public Date(String month, int day, int year) {
          this.month = month;
          this.day = day;
          this.year = year;
     }
     
     
     // returns true if both dates are the same
        public boolean dateSame(Date d1, Date d2) {
             return d1.month.equals(d2.month) && d1.day == d2.day && d1.year == d2.year;
        }
     
     
}






class Reservations {
     private LinkedList<Event> events;

     public Reservations() {
          this.events = new LinkedList<Event>();
     }

     // adds the given event to the events list, as long as there is no
     // date/time conflict with existing events in the list.
     // returns true if the event was added, false otherwise
     public boolean bookEvent(Event newEvent) {
          if (events.size() == 0) {     // no other events, so no conflicts
          events.add(newEvent);
          return true;
          }
          else {
               for (Event e: this.events) {
                    if (e.hasConflict(newEvent, e)){
                         return false;     // conflict found, event not added
               }
               events.add(newEvent);     // no conflicts, so add event
               return true;
          }
        }
          return false;
     }
}








