package com.springJDBC.dao;
import com.springJDBC.entities.student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.util.List;
@Component("studentDao")
public class StudentDaoImpl implements StudentDao{

    @Autowired

    private JdbcTemplate jdbcTemplate;
    @Override
    public int insert(student student) {
        String query = "insert into student(id ,name, city) values(?,?,?)";
        int r = this.jdbcTemplate.update(query,student.getId(), student.getName(), student.getCity());
        return r;
    }

    @Override
    public int change(student student) {
        String query = "update student set name =? ,city = ? where id = ?";
        int r = this.jdbcTemplate.update(query,student.getName(), student.getCity(), student.getId());
        return r;
    }

    //This will delete data from the database
    @Override
    public int delete(int studentId) {
        String query = "delete from student where id = ?";
        int r = this.jdbcTemplate.update(query, studentId);
        return r ;
    }

    //This will select the entry of a student by its ID
    @Override
    public student getStudent(int studentId) {
        //select single student data
        String query = "select * from student where id =?";
        RowMapper<student> rowMapper = new rowMapperImpl();
        this.jdbcTemplate.queryForObject(query, rowMapper, studentId);
        student student = this.jdbcTemplate. queryForObject (query, rowMapper, studentId);

        return student;
    }

    //This will select all the students from the database
    @Override
    public List<student> getAllstudents() {
        //selecting multiple students
        String query = "select * from student";
        List<student> students = this.jdbcTemplate.query(query, new rowMapperImpl());
        return students;
    }

    public JdbcTemplate getJdbcTemplate() {

        return jdbcTemplate;

    }
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }
}
