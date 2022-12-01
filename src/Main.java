import java_8.classes.Student;
import java_8.enums.Gender;
import java_8.service.impl.StudentServiceImpl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Zhiidel", 29, Gender.FEMALE, LocalDate.of(1993, 1, 15)));
        students.add(new Student("Alibek", 19, Gender.MALE, LocalDate.of(2002, 3, 5)));
        students.add(new Student("Erbol", 18, Gender.MALE, LocalDate.of(2004, 5, 5)));
        students.add(new Student("Meerim", 39, Gender.FEMALE, LocalDate.of(1983, 7, 12)));
        Scanner scannerForStr = new Scanner(System.in);
        Scanner scannerForNumbers = new Scanner(System.in);

        try {

            StudentServiceImpl studentService = new StudentServiceImpl();
            System.out.println("Choose your selection:1.Find by name,2.Boys list,3.Girl list");
            switch (scannerForNumbers.nextByte()) {
                case 1 -> {
                    System.out.print("Write name: ");
                    System.out.println(studentService.findByName(students, scannerForStr.nextLine()));
                }
                case 2 -> System.out.println(studentService.separateBoy(students));
                case 3 -> System.out.println(studentService.separateGirl(students));
            }
        }catch (InputMismatchException r) {
            System.out.println("You have mistake");
        }
    }
    }
