package com.example.Brunchvana.EventService;

import com.example.Brunchvana.EventRepository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional

public class EventServiceImpl implements EventService {

    @Autowired
    EventRepository eventRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Event> findAll() {

        return eventRepository.findAll();
    }
}
