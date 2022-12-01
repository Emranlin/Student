package java_8.service.impl;

import java_8.classes.Student;
import java_8.enums.Gender;
import java_8.service.StudentService;

import java.util.ArrayList;
import java.util.List;

public class StudentServiceImpl implements StudentService {


    @Override
    public ArrayList<Student> findByName(ArrayList<Student> students, String name) {
         ArrayList<Student>students1=new ArrayList<Student>();
        for (Student student : students) {
            if (student.getName().equals(name)) {
                students1.add(student);
                return students1;
            }

        }
        return null;
    }
    @Override
    public ArrayList<Student> separateBoy(ArrayList<Student> students) {
        ArrayList<Student>boys=new ArrayList<>();
        for (Student student : students) {
            if (student.getGender().equals(Gender.MALE)){
                boys.add(student);
            }
        }
    return boys;
    }


    @Override
    public ArrayList<Student> separateGirl(ArrayList<Student> students) {
        ArrayList<Student>girls=new ArrayList<>();
        for (Student student : students) {
            if(student.getGender().equals(Gender.FEMALE)){
                girls.add(student);
            }

        }
        return girls;
    }
}
