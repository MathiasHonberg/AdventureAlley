package com.example.demo.Controllers;

import com.example.demo.Models.Activity;
import com.example.demo.Models.Booking;
import com.example.demo.Services.ActivityService;
import com.example.demo.Services.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.logging.Logger;

@Controller
public class BookingController {

    @Autowired
    BookingService bookingService;

    @Autowired
    ActivityService activityService;

    private Logger log = Logger.getLogger(ActivityController.class.getName());

    private final String REDIRECT = "redirect:/";

    private final String BOOKING = "booking";

    @GetMapping("/booking/{id}")
    public String booking(@PathVariable int id, Model model){

        model.addAttribute("time", bookingService.findTime(id));

        return BOOKING;
    }

    /*@PostMapping("/booking/{id}")
    public String create(@ModelAttribute Booking booking, @PathVariable int id, Model model) {


        bookingService.addBooking(booking);

        return REDIRECT;
    }*/

}
