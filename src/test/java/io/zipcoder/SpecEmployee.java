package io.zipcoder;

/**
 * Created by roberthitchens3 on 2/4/16.
 */
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class SpecEmployee {

    Employee he = new HourlyEmployee();
    Employee se = new SalariedEmployee();
    Employee m = new Manager();
    Employee e = new Executive();
    @Before
    public void testInit(){
        he.setHoursForWeek(40);
        se.setHoursForWeek(40);
        m.setHoursForWeek(40);
        e.setHoursForWeek(40);
        he.setRate(11.25);
        se.setSalary(50000);
        m.setRate(17.50);
        e.setSalary(100000);
    }

    @Test
    public void testEmployee(){

        assertTrue("hours should be greater than 0", he.getHoursForWeek()>0);
        assertTrue("hours should be greater than 0", se.getHoursForWeek()>0);
        assertTrue("hours should be greater than 0", m.getHoursForWeek()>0);
        assertTrue("hours should be greater than 0", e.getHoursForWeek()>0);
        assertTrue("set rate should not be 0", he.getRate()>0);
        assertTrue("set salary should not be 0", se.getSalary()>0);
        assertTrue("set Rate should not be 0", m.getRate()>0);
        assertTrue("set salary should not be 0", e.getSalary()>0);

    }
    @Test
    public void testCalcPay(){
        assertTrue("calcPay for salary employee should return 1/24th the salary: ", se.calcPay()==2083.33);
        assertTrue("calcPay for hourly employee should return salary pay for 2 weeks: ", he.calcPay() == 900);
        assertTrue("calcPay for salary employee should return 1/24th the salary: ", e.calcPay()==4166.67);
        assertTrue("calcPay for hourly employee should return salary pay for 2 weeks: ", m.calcPay() == 1400);
    }

}
