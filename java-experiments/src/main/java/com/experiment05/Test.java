package com.experiment05;

import com.experiment05.entity.College;
import com.experiment05.entity.Student;
import com.experiment05.entity.Teacher;
import com.experiment05.resource.DatabaseUtils;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;

public class Test {
    public static void main(String[] args) {
         //System.out.println(getCourseName(DatabaseUtils.getStudents(),8888));
         printCollegeName(DatabaseUtils.getStudents(), 201001, 1001);
    }

    /**
     * 基于给定学生集合，学生编号，实现获取学生的导师的所在学院名称。
     * 任何一项不存在或失败，打印显式 未知学院
     * @param student
     * @param sNumber
     * @return
     */
    private static String getCourseName(List<Student> student, int sNumber) {
       return student.stream()
               .filter(student1 -> student1.getNumber() == sNumber)
               .findFirst()
               .map(Student::getTeacher)
               .map(Teacher::getCollege)
               .map(College::getName)
               .orElse("未知学院");
    }

    /**
     * 实现在给定学生集合中查询指定编号学生，如果学生导师编号为指定编号，打印显式导师所在学院名称。
     * 任何一项不存在或失败，打印显式 未知学院
     * @param students
     * @param sNumber
     * @param tNumber
     */
    private static void printCollegeName(List<Student> students, int sNumber, int tNumber) {
        students.stream()
                .filter(s->s.getNumber()==sNumber)
                .findFirst()
                .map(Student::getTeacher)
                .stream()
                .filter(s->s.getNumber() == tNumber)
                .findFirst()
                .ifPresentOrElse(q-> System.out.println(q.getCollege().getName()),()-> System.out.println("未知学院"));
    }

}
