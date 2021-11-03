package com.example.tsunami;

public class Event {

    public final String title;
    public final long time;
    public final int tsunamiAlert;

    public Event(String title, long time, int tsunamiAlert) {
        this.title = title;
        this.time = time;
        this.tsunamiAlert = tsunamiAlert;
    }
}
