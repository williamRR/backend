package com.example.demo.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.mongodb.internal.connection.Time;

@Document(collection = "event_requests")
public class EventRequest {
    @Id
    private String id;
    private String name;
    private String description;
    private Date date;
    private Time startTime;
    private Time endTime;
    private Integer peopleCount;
    private Integer numberOfDays;
    private Integer budget;
    private String eventLocationId;
    private String status;

    public EventRequest() { }

    public EventRequest(String name, String description, Date date, Time startTime, Time endTime, Integer peopleCount, Integer numberOfDays, Integer budget, String eventLocationId, String status) {
        this.name = name;
        this.description = description;
        this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
        this.peopleCount = peopleCount;
        this.numberOfDays = numberOfDays;
        this.budget = budget;
        this.eventLocationId = eventLocationId;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getStartTime() {
        return startTime;
    }

    public void setStartTime(Time startTime) {
        this.startTime = startTime;
    }

    public Time getEndTime() {
        return endTime;
    }

    public void setEndTime(Time endTime) {
        this.endTime = endTime;
    }

    public Integer getPeopleCount() {
        return peopleCount;
    }

    public void setPeopleCount(Integer peopleCount) {
        this.peopleCount = peopleCount;
    }

    public Integer getNumberOfDays() {
        return numberOfDays;
    }

    public void setNumberOfDays(Integer numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    public Integer getBudget() {
        return budget;
    }

    public void setBudget(Integer budget) {
        this.budget = budget;
    }

    public String getEventLocationId() {
        return eventLocationId;
    }

    public void setEventLocationId(String eventLocationId) {
        this.eventLocationId = eventLocationId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
