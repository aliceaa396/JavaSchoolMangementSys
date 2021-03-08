package school.management.system;
//**
// This class is responsible for keeping track of students.
// Contains  id, name, class, grade, fees paid and fees total.
// Using Private protects the Id from others seeing it
// Constructor creates new student objects by initiating the values

public class Student {
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    /**
     * Fees for every student is $15,000 / yr
     * Fees paid initially is 0
     * @param id id for the student: unique
     * @param name name of the student
     * @param grade grade of the student
     */

    public Student (int id, String name, int grade) {
        this.feesPaid = 0;
        this.feesTotal = 15000;
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    //Not altering student name, id


    /**
     * Used to update students grade
     * @param grade new grade of the student
     */
    public void setGrade (int grade) {
        this.grade = grade;

    }


    /**
     *
     * @return the id of the student
     */

    public int getId() {
        return id;
    }

    /**
     *
     * @return the name of the student
     */

    public String getName() {
        return name;
    }

    /**
     *
     * @return the grade of the student
     */

    public int getGrade() {
        return grade;
    }

    /**
     *
     * @return the fees paid by the student
     */

    public int getFeesPaid() {
        return feesPaid;
    }

    /**
     *
     * @return the total amount of fees owed by the student
     */

    public int getFeesTotal() {
        return feesTotal;
    }

    /**
     * feesPaid = 5,000 + 5,000 + 2,500 + 2,500 + 5,000
     * Keeps adding the fees to the fees paid field
     * The school will recieve the tutition
     * @param fees fees the student pays
     */
    public void payFees (int fees) {
        feesPaid += fees;
        School.updateTotalMoneyEarned(feesPaid);
    }

    /**
     *
     * @return balance left on student fees
     */
    public int getRemainingFees () {
        return feesTotal - feesPaid;
    }

    @Override
    public String toString() {
        return "Student's ID: " +id+ "."+"Students Name:" +name+ "." +" This Student has a paid: $" + feesPaid +" of their tuition for the year.";
    }
}
