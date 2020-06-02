package com.experiment04.service.impl;

import com.experiment04.entity.Student;
import com.experiment04.resource.DatabaseUtils;
import com.experiment04.service.StudentService;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.Collectors;

public class StudentServiceImpl implements StudentService {
    public static DatabaseUtils s = new DatabaseUtils();
    @Override
    public List<Student> addStudent(Student student) {
        s.getStudents().add(student);
        return s.getStudents();

    }



    @Override
    public List<Student> listStudentsByYear(int year) {
        return s.getStudents()
                .stream()
                .filter(a->a.getYear() == year)
                .collect(Collectors.toList());


    }

    @Override
    public List<String> listStudentsNames(int year, Student.Sex sex) {
        return s.getStudents()
                .stream()
                .filter(a->a.getYear() == year && a.getSex() == sex)
                .map(Student::getName)
                .collect(Collectors.toList());

    }

    @Override
    public Map<Student.Sex, List<Student>> mapStudentsBySex() {

        return  s.getStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getSex));
    }

    @Override
    public boolean removeStudent(int id) {
        Iterator<Student> userIterator = s.getStudents().iterator();
        while (userIterator.hasNext()) {
            Student u = userIterator.next();
            if (id == u.getId()) {

                userIterator.remove();
                return true;

            }

        }
        return false;
    }



}
