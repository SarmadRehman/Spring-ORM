package org.dao;

import org.entities.Student;
import org.springframework.orm.hibernate5.HibernateTemplate;

public class StudentDao {

private HibernateTemplate hibernateTemplate;

// save student
    public int insert (Student student) {
        Integer i =  (Integer) this.hibernateTemplate.save(student);
        return i;
    }
}
