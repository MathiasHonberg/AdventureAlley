package com.example.demo.Repositories;

import com.example.demo.Models.Activity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ActivityRepo {

    //ACTIVITIES
    List<Activity> getActivities();
    Activity addActivity(Activity activity);
    Activity readActivity(int id);

}
