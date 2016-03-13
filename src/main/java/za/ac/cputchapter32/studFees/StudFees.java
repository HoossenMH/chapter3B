package za.ac.cputchapter32.studFees;

/**
 * Created by student on 2015/02/20.
 * Hoossen_MH_213223538_3.A
 */
public class StudFees implements Fees {

    public double fees(double amt) {

        return amt * 0.10 + amt;
    }

}
