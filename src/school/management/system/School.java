package school.management.system;

import java.util.List;

public class School {
    /**
     * School will have many teachers and many students, numbers may differ for each from
     * day to day.
     * To solve this problem this we will use an array list
     */

    private List<Teacher> teachers;
    private List<Student> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;

    /**
     *
     * @param teachers list of teachers in school
     * @param students list of students in school
     */
    public School(List<Teacher> teachers,List<Student> students ) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
    }

    /**
     *
     * @return list of teachers in the school
     */
    public List<Teacher> getTeachers() {
        return teachers;
    }
    /**
     *
     * @param teacher to be added to school
     */
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }


    /**
     *
     * @return the list of students enrolled
     */
    public List<Student> getStudents() {
        return students;
    }
    /**
     *
     * @param student gets added to array list aka school
     */
    public void addStudent(Student student) {
        students.add(student);
    }


    /**
     *
     * @return the total amount of money the school has earned
     */
    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }
    /**
     *
     * @param MoneyEarned adds the money earned by the school
     */
    public static void updateTotalMoneyEarned(int MoneyEarned) {

        totalMoneyEarned += MoneyEarned;
    }


    /**
     *
     * @return the total amount of money the school has spent
     */
    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    /**
     *
     * @param MoneySpent will update the money spent on teacher salary
     */
    public static void updateMoneySpent(int MoneySpent) {
       totalMoneyEarned -= MoneySpent;
    }
}
