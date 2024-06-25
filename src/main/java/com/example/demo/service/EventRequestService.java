package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.EventRequest;

public interface EventRequestService {
    public List<EventRequest> getEventRequests();
    public Optional<EventRequest> findEventRequestById(String id);
    public EventRequest saveEventRequest(EventRequest eventRequestNew);
    public Boolean deleteEventRequest(String id);
    public Boolean updateEventRequest(EventRequest eventRequestNew);
}
