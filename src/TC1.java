import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC1 {
    @AfterMethod
    void AfterMethod(){
        System.out.println("Este el metodo final");
    }

    @Test
    void Test1(){
        System.out.println("Este el primer test");
    }

    @Test
    void Test2(){
        System.out.println("Este el segundor test");
    }
    @BeforeMethod
    void BeforeMethod(){
        System.out.println("Este el metodo que inicia todo");
    }
}
