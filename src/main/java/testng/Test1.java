package testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Test1 extends Test2 {
       @Test
       public void test() {
    	   System.out.println("test");
       }
       @AfterMethod
       public void testin() {
    	   System.out.println("testin");
       }
}
