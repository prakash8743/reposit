import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class validation extends drivers
{
static drivers dri;
Locator loc;
@BeforeClass
public static void browsing()
{
dri.Drive("chrome");
}
@Test
public void validate()
{
loc=new Locator();
loc.setUsername("prakashfrenz");
loc.setPassword("Prak@sh87");
loc.getLogin().click();
}
@AfterClass
public static void postbrowsing()
{
drivers.close();	
}
}
