package io.zipcoder;

import org.apache.commons.math3.util.Precision;

import java.math.BigDecimal;

/**
 * Created by roberthitchens3 on 2/4/16.
 */
public class Executive extends SalariedEmployee {

    @Override
    public double calcPay(){//need??
        double rounded = Precision.round((salary/24), 2, BigDecimal.ROUND_HALF_DOWN);
        return rounded;
    }
}
