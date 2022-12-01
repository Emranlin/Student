package java_8.service;

import java_8.classes.Student;

import java.util.ArrayList;

public interface StudentService {
   ArrayList<Student> findByName(ArrayList<Student>students,String name);
    ArrayList<Student>separateBoy(ArrayList<Student>students);
    ArrayList<Student>separateGirl(ArrayList<Student>students);
}
