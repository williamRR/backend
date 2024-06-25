package com.example.demo.controlerImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// import java.util.List;
// import java.util.Optional;

import com.example.demo.controller.EventRequestController;
import com.example.demo.model.EventRequest;
import com.example.demo.service.EventRequestService;

@RestController
@RequestMapping("/event-requests")
public class EventRequestControllerImpl implements EventRequestController {
    @Autowired // Autowired: hace que Spring busque un bean de tipo EventRequestService y lo inyecte en este atributo
    EventRequestService eventRequestService;

    @PostMapping
    @Override
    public EventRequest addEventRequest(@RequestBody EventRequest eventRequest) {
        return eventRequestService.saveEventRequest(eventRequest);
    }
}
