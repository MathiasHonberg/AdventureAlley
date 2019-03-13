package com.example.demo.Services;

import com.example.demo.Models.Time;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookingService {

    List<Time> getTimes(int id);


}
