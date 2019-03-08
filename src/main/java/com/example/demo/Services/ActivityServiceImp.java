package com.example.demo.Services;

import com.example.demo.Models.Activity;
import com.example.demo.Repositories.ActivityRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActivityServiceImp implements ActivityService {

    @Autowired
    ActivityRepo activityRepo;

    @Override
    public List<Activity> getActivities() {
        return activityRepo.getActivities();
    }

    @Override
    public Activity addActivity(Activity activity) {
        return  activityRepo.addActivity(activity);
    }

    @Override
    public Activity readActivity(int id) {
        return activityRepo.readActivity(id);
    }
}
