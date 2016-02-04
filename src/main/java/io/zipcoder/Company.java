package io.zipcoder;

/**
 * Created by roberthitchens3 on 2/4/16.
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Company {
    private ArrayList<Employee> employees;
    public Company(){
        employees = new ArrayList<Employee>();
    }
    public void runManger(){

    }
    public void createEmployee(){

    }
    public Employee fireEmployee(){
        return null;
    }
    public void payEmployees(){

    }
    public ArrayList<Employee> getEmployees(){
        return employees;
    }
    public String userInput(String message, String type){
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        String input = scanner.nextLine();

        if(type.equals("number")){
            String pattern = "(.*)\\d+(\\.\\d{1,2}?)?(.*)";//should find number with decimal value or number without decimal value.
            Pattern p = Pattern.compile(pattern);
            Matcher m = p.matcher(input);
            boolean okay =false;
            while(!okay){
                if(m.find()){
                    okay = true;
                    return input;

                }else{
                    System.out.println("entered value is invalid enter new Value: ");
                    input = scanner.next();
                    m = p.matcher(input);
                }
            }

        }

        return input;
    }

}
