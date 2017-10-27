package com.example.Brunchvana.EventController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class EventController {

    @Autowired
    public eventAPI eventAPI;

    @RequestMapping(path = "/search", method = RequestMethod.GET)

    public String getEvent(Model model) {

        List<Event> event = eventAPI.findAll();

        model.addAttribute("events" events);

        return "events";

    }

}
