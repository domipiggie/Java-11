package com.mypersonalcalendar.modell;

public class Event extends DataManager {
    public String eventName;
    public String eventDate;
    public String eventLocation;

    public String getEventName() {
        return eventName;
    }
    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventDate() {
        return eventDate;
    }
    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }

    public String getEventLocation() {
        return eventLocation;
    }
    public void setEventLocation(String eventLocation) {
        this.eventLocation = eventLocation;
    }

    public Event(String eventName, String eventDate, String eventLocation) {
        this.setEventName(eventName);
        this.setEventDate(eventDate);
        this.setEventLocation(eventLocation);
    }

    @Override
    public String toString() {
        return "uj esemeny | " + "esemeny neve: " + this.getEventName() + "; esemeny datuma: " + this.getEventDate() + "; esemeny helyszine: " + this.getEventLocation();
    }
}
