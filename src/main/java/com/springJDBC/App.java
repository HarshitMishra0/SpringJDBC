package com.springJDBC;

import com.springJDBC.dao.StudentDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.springJDBC.entities.student;
import java.util.List;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        System.out.println( "My Program started!" );

        ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);

        StudentDao studentDao = context.getBean("studentDao", StudentDao.class);

        //Insert data in the database

//        student student = new student();
//        student.setId(555);
//        student.setName("thomas");
//        student.setCity("Kanpur");
//
//        int result = studentDao.insert(student);
//
//        System.out.println("New Student Added "+ result);

        //Delete

//        int result = studentDao.delete(666);
//        System.out.println("deleted " + result);

//        student student = studentDao.getStudent(666);
//        System.out.println(student);

        List<student> students = studentDao.getAllstudents();
        for (student s: students) {
            System.out.println(s);

        }


    }
}
