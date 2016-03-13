package za.ac.cputchapter32;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cputchapter32.studFees.StudFees;
import za.ac.cputchapter32.studFees.Fees;
import za.ac.cputchapter32.student.Student;

/**
 * Created by student on 2015/02/20.
 * Hoossen_MH_213223538_3.A
 */
public class StudFeeTest {

    Student student;
    StudFees f;

    @Before
    public void initialize() {

        f = new StudFees();
        student = new Student("Hasan", "Hoossen",15000);
    }

    @Test
    public void fees() {

        Assert.assertEquals(17250, f.fees(student.getBalance()), 0.0f);
    }
}
