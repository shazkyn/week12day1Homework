import Staff.TechStaff.DbAdmin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DbAdminTest {

    DbAdmin dbAdmin;

    @Before
    public void before(){
        dbAdmin = new DbAdmin("Miss Brahms", "GB654321", 15000);
    }



    @Test
    public void canRaiseSalary(){
        dbAdmin.raiseSalary(1000);
        assertEquals(16000, dbAdmin.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(150, dbAdmin.payBonus(), 0.01);
    }
    @Test
    public void canGetName(){
        assertEquals("Miss Brahms", dbAdmin.getName());
    }

    @Test
    public void canGetNatInsNum(){
        assertEquals("GB654321", dbAdmin.getNatInsNum());
    }
}