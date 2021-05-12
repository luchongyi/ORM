package com.ck.model;

import java.util.Date;

public class Clicks {

    private Long CounterID;

    private Date EventDate;

    private Long UserID;

    public Long getCounterID() {
        return CounterID;
    }

    public void setCounterID(Long counterID) {
        CounterID = counterID;
    }

    public Date getEventDate() {
        return EventDate;
    }

    public void setEventDate(Date eventDate) {
        EventDate = eventDate;
    }

    public Long getUserID() {
        return UserID;
    }

    public void setUserID(Long userID) {
        UserID = userID;
    }

    @Override
    public String toString() {
        return "Clicks{" +
                "CounterID=" + CounterID +
                ", EventDate=" + EventDate +
                ", UserID=" + UserID +
                '}';
    }
}
