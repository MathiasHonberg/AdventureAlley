package com.example.demo.Repositories;

import com.example.demo.Models.Activity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ActivityRepoImp implements ActivityRepo {

    @Autowired
    JdbcTemplate jdbc;

    public List<Activity> getActivities() {


        ArrayList<Activity> al = new ArrayList<>();

        String sql = "SELECT idActivity, title, description, age, price," +
                " picture, startTime, endTime FROM adventureDB.Activity " +
                "ORDER BY title";


        // Fra sql til list.
        // Manuelt i stedet.
        return this.jdbc.query(sql, new ResultSetExtractor<List<Activity>>() {
            @Override
            public List<Activity> extractData(ResultSet rs) throws SQLException, DataAccessException {

                while (rs.next()) {
                    int id = rs.getInt("idActivity");
                    String title = rs.getString("title");
                    String description = rs.getString("description");
                    int age = rs.getInt("age");
                    double price = rs.getInt("price");
                    String picture = rs.getString("picture");
                    int startTime = rs.getInt("startTime");
                    int endTime = rs.getInt("endTime");


                    Activity activity = new Activity(id, title, description, age, price, startTime, endTime, picture);

                    al.add(activity);
                }
                return al;
            }
        });

    }

    @Override
    public Activity addActivity(Activity activity) {

        String sql = "INSERT INTO Activity values (default, ?, ?, ?, ?, ?, ?, ?)";
        jdbc.update(sql, activity.getTitle(), activity.getDescription(), activity.getAge(), activity.getPrice(),
                activity.getPicture(), activity.getStartTime(), activity.getEndTime());

        return activity;
    }

    @Override
    public Activity readActivity(int id) {

        String sql = "SELECT idActivity, title, description, age, price, " +
                "picture, startTime, endTime FROM Activity " +
                "WHERE idActivity = ? ";

        RowMapper<Activity> rowMapper = new BeanPropertyRowMapper<>(Activity.class);
        Activity activity = jdbc.queryForObject(sql, rowMapper, id);

        return activity;
    }
}
