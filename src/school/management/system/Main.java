package school.management.system;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher liz = new Teacher(1,"Liz Gomez",20000);
        Teacher doug = new Teacher(2,"Doug Crawford",7500);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(liz);
        teacherList.add(doug);

        Student angel = new Student(1,"Angel Alicea",12);
        Student rock = new Student(2, "Rock Boulder", 10);
        Student celia = new Student(2, "celia",12);
        Student alicia = new Student(3,"alicia",11);


        List<Student> studentList = new ArrayList<>();
        studentList.add(angel);
        studentList.add(rock);
        studentList.add(celia);
        studentList.add(alicia);

        School hchs = new School(teacherList, studentList);

        rock.payFees(2000);
        angel.payFees(5000);
        celia.payFees(10000);
        alicia.payFees((15000));

        System.out.println("HCHS has earned:$" + hchs.getTotalMoneyEarned());
        System.out.println("---MAKE HCHS PAY THE TEACHERS---");

        liz.recieveSalary(liz.getSalary());
        doug.recieveSalary(doug.getSalary());

        System.out.println("HCHS has paid $" + liz.getSalary() + " to Teacher " + liz.getName());

        //prints random stuff
        System.out.println(angel);


    }
}
