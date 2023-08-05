package com.springJDBC.dao;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import com.springJDBC.entities.student;


public class rowMapperImpl implements RowMapper<student> {
    @Override
    public student mapRow(ResultSet rs, int rowNum) throws SQLException {

        student student = new student();
        student.setId(rs.getInt(1));
        student.setName(rs.getString(2));
        student.setCity(rs.getString(3));

        return student;
    }
}
