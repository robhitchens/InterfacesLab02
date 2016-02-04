package io.zipcoder;

/**
 * Created by roberthitchens3 on 2/4/16.
 */
public abstract class Employee {
    protected double salary;
    protected double rate;
    protected int hoursForWeek;
    protected String fullName;

    public double calcPay(){
        return -1;
    }
    public void setHoursForWeek(int num){
        hoursForWeek = num;
    }
    public int getHoursForWeek(){
        return hoursForWeek;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
    public double getRate(){
        return rate;
    }
    public void setSalary(double sal){
        salary = sal;
    }
    public double getSalary(){return salary;}
    public void setName(String name){
        fullName = name;
    }
    public String getName(){
        return fullName;
    }
}
