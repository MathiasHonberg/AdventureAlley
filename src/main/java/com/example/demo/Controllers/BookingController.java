package com.example.demo.Controllers;

import com.example.demo.Services.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.logging.Logger;

@Controller
public class BookingController {

    @Autowired
    BookingService bookingService;

    private Logger log = Logger.getLogger(ActivityController.class.getName());

    private final String BOOKING = "booking";

    @GetMapping("/booking/{id}")
    public String booking(@PathVariable int id, Model model){

        return BOOKING;
    }

}
