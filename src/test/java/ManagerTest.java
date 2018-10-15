import Staff.Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Mr Lucas", "GB123456",20000, "Menswear");
    }

    @Test
    public void canGetDeptName(){
        assertEquals("Menswear", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(4000);
        assertEquals(24000, manager.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(200, manager.payBonus(), 0.01);
    }
    @Test
    public void canGetName(){
        assertEquals("Mr Lucas", manager.getName());
    }

    @Test
    public void canGetNatInsNum(){
        assertEquals("GB123456", manager.getNatInsNum());
    }

    @Test
    public void cannotHaveNegativeRaise(){
        manager.raiseSalary(-4000);
        assertEquals(20000, manager.getSalary(), 0.01);;
    }

    @Test
    public void canChangeName(){
        manager.setName("Alex Ferguson");
        assertEquals("Alex Ferguson", manager.getName());
    }

    @Test
    public void cannotSetNullName(){
        manager.setName(null);
        assertEquals("Mr Lucas", manager.getName());
    }
}