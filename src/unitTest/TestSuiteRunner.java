package unitTest;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestSuiteRunner {
    @Test
    public void testSuitRunner(){
        Result result= JUnitCore.runClasses(TestSuite.class);//JUnit is a class from jUnit
        for(Failure failure: result.getFailures()){//Failure is also a class from jUnit
            System.out.println(failure.toString());// getFailure is a method which will grab a Failure
        }
        System.out.println("Result == "+result.wasSuccessful());//
    }
}
