package za.ac.cputchapter32.student;

/**
 * Created by student on 2015/02/20.
 * Hoossen_MH_213223538_3.A
 */
public class Student {


    private String firstName;
    private String lastName;
    private double balance;

    public Student() {

    }

    public Student(String firstName, String lastName,double balance) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
