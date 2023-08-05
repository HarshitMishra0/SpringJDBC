package com.springJDBC.dao;
import com.springJDBC.entities.student;
import java.util.List;

public interface StudentDao {
    public int insert(student student);
    public int change(student student);
    public int delete(int studentId);
    public student getStudent(int studentId);
    public List<student> getAllstudents();
}
