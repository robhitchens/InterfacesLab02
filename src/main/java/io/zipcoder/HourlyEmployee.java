package io.zipcoder;

/**
 * Created by roberthitchens3 on 2/4/16.
 */
public class HourlyEmployee extends Employee {

    public void setRate(double num){
        rate = num;
    }


    @Override
    public double calcPay(){//overtime for hours over 40;
        int overtimeHours = (hoursForWeek > 80) ? hoursForWeek-80 : 0;
        double pay = (hoursForWeek * rate) + (overtimeHours * (rate*1.5));
        return pay;
    }


}
