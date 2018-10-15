import Staff.TechStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Shaz Kinno", "GB666999", 40000);
    }


    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(5000);
        assertEquals(45000, developer.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(400, developer.payBonus(), 0.01);
    }
    @Test
    public void canGetName(){
        assertEquals("Shaz Kinno", developer.getName());
    }

    @Test
    public void canGetNatInsNum(){
        assertEquals("GB666999", developer.getNatInsNum());
    }

    @Test
    public void cannotHaveNegativeRaise(){
        developer.raiseSalary(-5000);
        assertEquals(40000, developer.getSalary(), 0.01);;
    }

    @Test
    public void canChangeName(){
        developer.setName("Tony Stark");
        assertEquals("Tony Stark", developer.getName());
    }

    @Test
    public void cannotSetNullName(){
        developer.setName(null);
        assertEquals("Shaz Kinno", developer.getName());
    }
}