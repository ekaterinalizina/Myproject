package exceptionHandling;

public class SalaryCalculator {
    static int  div;
    public static void main(String[] args) {
        SalaryCalculator.doDivision(12, 0); //ArithmeticException. Error and Exception is two different sings for Codding
       SalaryCalculator calculator=new SalaryCalculator();
       // write from exsample didn't have time
    }

    public static int doDivision(int num1, int num2) {
        int result = 0;//we should declare and initialize value of result for that case
        try {            //block, we try
            int result1 = num1 / num2;
            System.out.println("Division value is" + result1);

        } catch (Exception exception) {// Exception is a class, e - reference variable name
            // exception.printStackTrace(); - we commenting this because it will show an error
            // as we cant math-ly devide on "0"
            //We use Try-Catch not to see Error in Console, but we also mention that there is Logical/Math exception.

            System.out.println("This is Arithmetic exception. Value should be non Zero");



        }
        return result;// should be outside the block, for that case, usually it is the Last line in Method


    }
    public static int doDivision1(int num1, int num2)throws Exception{
       SalaryCalculator.div=num1/num2;//к статическим переменным можно обращаться как из обычных методов, так и из
        //статических методов
       // this.div=num1/num2;
        System.out.println("Division"+div);
        return div;
    }
}

