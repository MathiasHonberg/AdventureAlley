package com.example.demo.Controllers;

import com.example.demo.Services.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.logging.Logger;

@Controller
public class BookingController {

    @Autowired
    BookingService bookingService;

    private Logger log = Logger.getLogger(ActivityController.class.getName());



}
