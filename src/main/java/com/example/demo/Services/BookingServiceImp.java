package com.example.demo.Services;

import com.example.demo.Models.Time;
import com.example.demo.Repositories.BookingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingServiceImp implements BookingService {

    @Autowired
    BookingRepo bookingRepo;

    @Override
    public List<Time> getTimes(int id) {

        return bookingRepo.getTimes(id);
    }
}
