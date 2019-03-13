package com.example.demo.Controllers;

import com.example.demo.Models.Activity;
import com.example.demo.Services.ActivityService;
import com.example.demo.Services.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.logging.Logger;

@Controller
public class ActivityController {

    @Autowired
    ActivityService activityService;

    @Autowired
    BookingService bookingService;

    private Logger log = Logger.getLogger(ActivityController.class.getName());

//RETURN STRINGS

    //INDEX
    private final String INDEX = "index";

    //REDIRECT
    private final String REDIRECT = "redirect:/";

    //ACTIVITIES
    private final String CREATEACTIVITY = "createActivity";
    private final String READ = "read";

    @GetMapping("/")
    public String index(Model model) {
        log.info("IndexLogged called ...");

        List<Activity> a = activityService.getActivities();
        model.addAttribute("a", a);

        return INDEX;
    }

    @GetMapping("/read/{id}")
    public String details(@PathVariable Integer id, Model model) {
        log.info("details action called...");

        model.addAttribute("activity", activityService.readActivity(id));

        model.addAttribute("times", bookingService.getTimes(id));
        return READ;
    }

    //CREATE
    @GetMapping("/createActivity")
    public String create(Model model) {

        log.info("createActivity action called...");
        model.addAttribute("activity", new Activity());


        return CREATEACTIVITY;
    }

    @PostMapping("/createActivity")
    public String create(@ModelAttribute Activity activity, Model model) {


        activityService.addActivity(activity);
        model.addAttribute("activity", activityService.getActivities());


        return REDIRECT;
    }

}
