package io.zipcoder;

/**
 * Created by roberthitchens3 on 2/4/16.
 */
import java.math.BigDecimal;

import org.apache.commons.math3.util.Precision;

public class SalariedEmployee extends Employee {


    @Override
    public double calcPay(){
        double rounded = Precision.round((salary/24), 2, BigDecimal.ROUND_HALF_DOWN);
        return rounded;
    }
}
