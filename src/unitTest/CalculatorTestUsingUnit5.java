package unitTest;

import org.junit.*;
import org.junit.jupiter.api.DisplayName;

public class CalculatorTestUsingUnit5 {

    //private Object Assert;
    @Test(timeout = 100)//@Disabled - it comes from jUnit 5  - both doing same job// Positive testing
    // if we will say timeout = 40, it will failed, because for running this test system needs 54 milli sec.
    //- it comes from jUnit 4 (it should import from Junit, and it will test the "testDoSummation method"
    // test a method
    public void testDoSummation(){
        // we want to test method doSummation() in other class
        //From now one we dont need MAIN method to test
        Calculator.doSum(25,26);
        //expected result=51
        int expectedResult=51;

        //Lets create a variable expectedResult
        int actualResult=Calculator.doSum(25,26);
        //now we want to compare expected result vs actual result
        Assert.assertEquals("test fail", expectedResult, actualResult);
       /*
        if(expectedResult ==actualResult){
            System.out.println("test pass");
        }else{
            System.out.println("test fail");
        }
        //instead of few lines of code we want 1 line it comes from jUnit 4 version Assert.assertEquals
       */

    }
    //@Test - it will test and it is test case and it will run only one test case
    //if we want to Run both test cases we will do it on Class level -there will be Run button on Margins
   @Test()@DisplayName("We are testing doSub")
    public void testDoSub(){
        int expectedResult=-23;
        int actualResuslt=Calculator.doSub(33,56);
        Assert.assertEquals("test fail", expectedResult, actualResuslt);
    }
    public void testDoSub2(){// Negative testing
        int expectedResult=-23;
        int actualResuslt=Calculator.doSub(33,56);
        Assert.assertNotEquals("test fail", expectedResult, actualResuslt);
    }
    @Before //it will be executed first as test case and then all others
    public void startUnitTesting(){
        System.out.println("start unit testing");
    }

   @After //it will be executed as Last one as test case and then all others
    public void startUnitTesting1(){
        System.out.println("start unit testing");
    }

    @AfterClass //it will be executed as Last one as test case and then all others
    public void startUnitTesting2(){
        System.out.println("start unit testing");
    }
    @BeforeClass //it will be executed as Last one as test case and then all others
    public void startUnitTesting3(){
        System.out.println("start unit testing");
    }


        }
