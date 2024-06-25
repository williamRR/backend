package com.example.demo.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.EventRequest;
import com.example.demo.repository.EventRequestRepository;
import com.example.demo.service.EventRequestService;

@Service
public class EventRequestServiceImpl implements EventRequestService {
    @Autowired(required = true)
    EventRequestRepository eventRequestRepository;

    @Override
    public List<EventRequest> getEventRequests() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getEventRequests'");
    }

    @Override
    public Optional<EventRequest> findEventRequestById(String id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findEventRequestById'");
    }

    @Override
    public EventRequest saveEventRequest(EventRequest eventRequestNew) {
        if (eventRequestNew != null) {
			return eventRequestRepository.save(eventRequestNew);
		}
		
		return new EventRequest();
    }

    @Override
    public Boolean deleteEventRequest(String id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteEventRequest'");
    }

    @Override
    public Boolean updateEventRequest(EventRequest eventRequestNew) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateEventRequest'");
    }
    
}
