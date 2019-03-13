package com.example.demo.Repositories;

import com.example.demo.Models.Time;
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
public class BookingRepoImp implements BookingRepo{

    @Autowired
    JdbcTemplate jdbc;

    @Override
    public List<Time> getTimes(int id) {
        ArrayList<Time> timeList = new ArrayList<>();

        String sql = "SELECT * FROM Time " +
                "WHERE idActivity = " + id + "";


        return this.jdbc.query(sql, new ResultSetExtractor<List<Time>>() {

            @Override
            public List<Time> extractData(ResultSet rs) throws SQLException, DataAccessException {

                while (rs.next()) {
                    int idTime = rs.getInt(1);
                    String dateTime = rs.getString(2);
                    int sTime = rs.getInt(3);
                    int eTime = rs.getInt(4);
                    Boolean isBooked = rs.getBoolean(5);
                    int ida = rs.getInt(6);


                    Time time = new Time(idTime, dateTime, sTime, eTime, isBooked, ida);
                    timeList.add(time);
                }

                return timeList;
            }
        });
    }

    @Override
    public Time findTime(int id) {
            //this string is our message to our mysql database
            String sql = "SELECT idTime, date, startTime, endTime, isBooked," +
                    " idActivity FROM Time " +
                    "WHERE idTime = ?";

            RowMapper<Time> rowMapper = new BeanPropertyRowMapper<>(Time.class);
            Time time = jdbc.queryForObject(sql, rowMapper, id);
            return time;
    }


}
