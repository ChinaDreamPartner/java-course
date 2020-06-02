package com.experiment04;
import com.experiment04.entity.Student;
import com.experiment04.service.impl.StudentServiceImpl;
public class Test {
    public static void main(String[] args) {
        StudentServiceImpl s = new StudentServiceImpl();
        s.mapStudentsBySex().forEach((a,b)->{
            System.out.println(a);
            b.forEach(n-> System.out.println(n.getName()));
        });
        s.listStudentsNames(2010, Student.Sex.MALE).forEach(a-> System.out.println(a));
        s.listStudentsByYear(2010).forEach(a-> System.out.println(a.getName()));
    }
}
