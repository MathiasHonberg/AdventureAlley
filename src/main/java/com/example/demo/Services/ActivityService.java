package com.example.demo.Services;

import com.example.demo.Models.Activity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ActivityService {

    //ACTIVITIES
    List<Activity> getActivities();
    Activity addActivity(Activity activity);
    Activity readActivity(int id);
}
