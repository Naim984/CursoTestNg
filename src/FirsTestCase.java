import org.testng.annotations.Test;

public class FirsTestCase {

    @Test(priority = 1)
    void setup()
    {
        System.out.println("Opening browser");
    }

    @Test(priority = 2)
    void login()
    {
        System.out.println("This is login test");
    }

    @Test(priority = 3)
    void teardown()
    {
        System.out.println("Close browser");
    }


}
