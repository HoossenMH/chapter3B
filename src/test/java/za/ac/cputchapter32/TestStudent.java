package za.ac.cputchapter32;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cputchapter32.student.Student;

/**
 * Created by student on 2015/02/20.
 * Hoossen_MH_213223538_3.A
 */
public class TestStudent {

    Student student;

    @Before
    public void initialize() {

        student = new Student();
    }


    @Test
    public void firstName() {

        student.setFirstName("Hasan");
        Assert.assertEquals("Hasan", student.getFirstName());
    }

    @Test
    public void lastName() {

        student.setLastName("Hoossen");
        Assert.assertEquals("Hoossen", student.getLastName());
    }


    @Test
    public void balance() {

        student.setBalance(15000);
        Assert.assertEquals(15000, student.getBalance(), 0.0f);
    }
}
