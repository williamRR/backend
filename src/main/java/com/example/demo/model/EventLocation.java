package com.example.demo.model;

import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDateTime;

import jakarta.persistence.Id;

@Document(collection = "event_locations")
public class EventLocation {
    @Id
    private String id;
    private String name;
    private String address;
    private String city;
    private Integer capacity;

    public EventLocation(String name, String address, String city, Integer capacity) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.capacity = capacity;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }
}
