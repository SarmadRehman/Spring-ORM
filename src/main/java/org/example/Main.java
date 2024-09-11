package org.example;

import org.dao.StudentDao;
import org.entities.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        StudentDao studentDao = context.getBean("studentDao", StudentDao.class);

        Student student = new Student(148, "Swarn", "Banglore");
        int result = studentDao.insert(student);
        System.out.println(result);
    }
}