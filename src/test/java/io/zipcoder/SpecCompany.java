package io.zipcoder;

/**
 * Created by roberthitchens3 on 2/4/16.
 */
import org.junit.Test;
import static org.junit.Assert.*;
public class SpecCompany {
    Company company = new Company();
    @Test
    public void testCreateEmployee(){
        String input = "manager\n17.50\n0\n";
        System.setIn(new java.io.ByteArrayInputStream(input.getBytes()));
        company.createEmployee();
        assertTrue("the list of employees should not be empty: ", !company.getEmployees().isEmpty());
    }
    @Test
    public void testFireEmployee(){

    }
}
