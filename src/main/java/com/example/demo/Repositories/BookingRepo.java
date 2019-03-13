package com.example.demo.Repositories;

import com.example.demo.Models.Time;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookingRepo {

    List<Time> getTimes(int id);
}
