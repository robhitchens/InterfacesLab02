package io.zipcoder;

/**
 * Created by roberthitchens3 on 2/4/16.
 */
import org.junit.Test;
import static org.junit.Assert.*;
public class SpecCompany {
    Company company = new Company();
    @Test
    public void testCreateEmployeeAndFireEmployee(){
       /* String input = "bob\nmanager\n17.50\n0\n";
        System.setIn(new java.io.ByteArrayInputStream(input.getBytes()));
        */

        Employee bob = company.createEmployee("bob", "manager", 18.00, 0.0);
        assertTrue("the list of employees should not be empty: ", !company.getEmployees().isEmpty());
        int initSize = company.getEmployees().size();
        Employee bobf = company.fireEmployee("bob");
        int fireSize = company.getEmployees().size();
        assertNotEquals("size after fireEmployee is called should be different", initSize, fireSize);
        assertEquals("returned employee should be equal to initial employee", bobf, bob);
    }
    @Test
    public void testUserInput(){
        String input = "bob\n";
        System.setIn(new java.io.ByteArrayInputStream(input.getBytes()));
        String returned = company.userInput(input, "");
        assertEquals("returned string should be equal to entered string: ", "bob", returned);
    }


}
