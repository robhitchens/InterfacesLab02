package io.zipcoder;

/**
 * Created by roberthitchens3 on 2/4/16.
 */
public class SalariedEmployee extends Employee {


    @Override
    public double calcPay(){
        return (salary/24);
    }
}
