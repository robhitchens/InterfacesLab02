package io.zipcoder;

/**
 * Created by roberthitchens3 on 2/4/16.
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Company {
    public static void main(String[] args) {
        Company company = new Company();
    }
    private String option = "q to quit\nc to create employee\nf to fire employee\npr to list employees and their position\np to pay employees for their hard work.";
    private ArrayList<Employee> employees;
    public Company(){
        employees = new ArrayList<Employee>();
        runManger();
    }
    public void runManger(){
        System.out.println(option);
        String in = userInput("what would you like to do? ", "");
        while(!in.equals("q")){
            switch(in){
                case "c":
                   employees.add(   createEmployee(userInput("enter employee name:", ""),//refasctor
                                    userInput("enter position type: ", ""),
                                    Double.parseDouble(userInput("enter rate or 0 if salary based: ", "number")),
                                    Double.parseDouble(userInput("Enter salary or 0 if rate based: ", "number")))
                                );
                    break;
                case "f":
                    try {
                        fireEmployee(userInput("enter employee name: ", ""));
                    }catch(NullPointerException e){
                        System.out.println("check employee list before trying to remove employee.");
                    }
                    break;
                case "p":
                    payEmployees();
                    break;
                case "pr":
                    printEmployees();
                    break;
                default:
                    System.out.println("not an option");
                    break;
            }
            System.out.println(option);
            in = userInput("what would you like to do? ", "");
        }
    }
    public Employee createEmployee(String name, String type, double rate, double salary){
        Employee nuEmp;
        if(type.equals("manager")){
            nuEmp = new Manager();
        }else if(type.equals("executive")){
            nuEmp = new Executive();
        }else if(type.equals("hourly")){
            nuEmp = new HourlyEmployee();
        }else if(type.equals("salaried")){
            nuEmp = new SalariedEmployee();
        }else{
            System.out.println("erroe");
            nuEmp = null;
        }
        nuEmp.setName(name);
        nuEmp.setRate(rate);
        nuEmp.setSalary(salary);
        return nuEmp;
    }
    public Employee fireEmployee(String eName){
        Employee removed = null;
        for(Employee e : employees){
            if(e.getName().equals(eName)){
                removed = e;
            }
        }
        employees.remove(removed);
        String mess = (removed==null) ? "could not find employee or employee does not exist.":"successful";
        System.out.println(mess);
        return removed;
    }
    public void payEmployees(){
        for(Employee e : employees){

            e.setHoursForWeek(Integer.parseInt(userInput("enter number of hours for employee "+e.getName()+":", ""), 10));
            System.out.println(e.getName() + " was payed: "+e.calcPay());
        }
    }
    public ArrayList<Employee> getEmployees(){
        return employees;
    }
    public void printEmployees(){
        if(employees.isEmpty()){
            System.out.println("no employees to list");
        }else {
            for (Employee e : employees) {
                System.out.println(e.getClass().getSimpleName() + " " + e.getName());
            }
        }
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
