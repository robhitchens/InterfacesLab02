package io.zipcoder;

/**
 * Created by roberthitchens3 on 2/4/16.
 */
public class Manager extends HourlyEmployee {

    @Override
    public double calcPay(){// need??
        int overtimeHours = (hoursForWeek > 80) ? hoursForWeek-80 : 0;
        double pay = (hoursForWeek * rate) + (overtimeHours * (rate*1.5));
        return pay;
    }
}
