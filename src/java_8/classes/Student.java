package java_8.classes;

import java_8.enums.Gender;
import java_8.service.impl.StudentServiceImpl;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class Student extends StudentServiceImpl {
    private String name;
    private int age;
    private Gender gender;
    private LocalDate dateOfBirth;

    public Student(String name, int age, Gender gender, LocalDate dateOfBirth) {
        this.gender = gender;
        checkLocalDate(dateOfBirth);
        checkAge(age);
        checkName(name);

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }


    private  void checkLocalDate(LocalDate dateOfBirth) {
            try {
                if (dateOfBirth.isBefore(LocalDate.now())) {
                    this.dateOfBirth=dateOfBirth;
                } else {
                    throw new RuntimeException();
                }
            } catch (Exception e) {
                System.out.println("Error");
            }
        }
        private  void checkAge( int age){
        try{
            if(age > 0){
                this.age=age;
            }else throw new InputMismatchException();
        }catch (InputMismatchException e){
            System.out.println("Age couldn't negative number");
        }
    }
    private  void checkName(String name) {
        try {
            if (name.matches("[a-zA-Za-яА-Я]*")) {
                this.name=name;

            }

        } catch (InputMismatchException e) {
            System.out.println("Don't write number");
        }

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}

