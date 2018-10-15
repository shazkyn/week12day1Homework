import Staff.Management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("Peter Jackson", "GB224466",175000, "Weta", 20000000);
    }

    @Test
    public void canGetDeptName(){
        assertEquals("Weta", director.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(25000);
        assertEquals(200000, director.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(1750, director.payBonus(), 0.01);
    }
    @Test
    public void canGetName(){
        assertEquals("Peter Jackson", director.getName());
    }

    @Test
    public void canGetNatInsNum(){
        assertEquals("GB224466", director.getNatInsNum());
    }

    @Test
    public void canGetBudget(){
        assertEquals(20000000, director.getBudget(), 0.01);
    }

    @Test
    public void cannotHaveNegativeRaise(){
        director.raiseSalary(-25000);
        assertEquals(175000, director.getSalary(), 0.01);;
    }

}