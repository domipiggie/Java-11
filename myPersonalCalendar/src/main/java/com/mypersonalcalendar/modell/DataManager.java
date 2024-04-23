package com.mypersonalcalendar.modell;

import com.mypersonalcalendar.EventsApplication;

import java.util.ArrayList;

public class DataManager extends EventsApplication {
    public void addEventToList(String eventName, String eventDate, String eventLocation){
        Event iEvent = new Event(eventName,eventDate,eventLocation);
        events.add(iEvent);
        for(int i = 0; i  < events.size(); i++){
            System.out.println(events.get(i));
        }
        System.out.println("Events: " + events.size());
        System.out.println("----------");
    }

    public ArrayList<Event> getEvents(){
        return events;
    }
}
