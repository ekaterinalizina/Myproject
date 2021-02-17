package controlFlow;

public class LearnLoop {
    //Loop is allowing us to Execute a statement or group of statement multiple times
    //For Loop: will execute until condition is true, if not true then it will exit from loop
    //While Loop
    //Do  While Loop
    //For Each loop

    //For Loop
    //for(Initialization; Condition;Iteration){}
    //Initializiation=StartPoint; Condition=EndPoint;Iteration=Looping/AgainAndAgain
    public static void main(String[] args) {
        System.out.println("Hello");

        //     for (int i=0;//Initialization /startPoint
        //         i<6 //Condition
        //         i++//Iteration
        //    ){

        LearnLoop.tvDisplay();

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello");
        }
        for (int i=7; i > 5 && i <= 12; i++){
            System.out.println("Hello");
        }

        for (int i = 10; i > 0; i--) {
            System.out.println("Hello World");
        }

        for (int i = 0; i <= 10; i++) {
            System.out.println("We are learning For Loop" + i);
        }
        System.out.println("************************");
        for (int i = 0; i < 5; i++) {
            System.out.println("QA Engineer");
            int num1 = 45;
            int num2 = 55;
            int total = num1 + num2;
            System.out.println("total is " + total);

            LearnSwitchCase.foodMenu(8);
        }
        System.out.println("********Nested For Loop****************");
        for (int i = 2; i <= 8; i++) {
            //Patent loop
            System.out.println("we like to eat Pizza");

            for (int j = 5; j <= 7; j++) {
                //child Loop/Nested Loop
                System.out.println("we also like to drink tea" + j);//child loop will be executed inside Parent.
                //столько раз сколько возможно по условию и только потом повторится петля Parent loop
            }
        }
        System.out.println("***********For Loop Increment by 2**************");
        for (int i = 22; i < 34; i = i + 2) {
            System.out.println("Increment by 2");
        }
        System.out.println("***********For Loop Increment by 2**************");
        for (int i = 22; i < 34; i = i + 2) {
            System.out.println("Increment by 2");
        }
        System.out.println("***********For Loop Increment by 2**************");
        for (int i = 22; i < 34; i = i + 2) {
            System.out.println("Increment by 2");
        }

        System.out.println("***********For Loop Increment++ **************");
        for (int i = 2; i < 8; i += 1) {//i+=1 тоже самое i=i+1
            System.out.println("Increment ++");
        }

    }

    public static void tvDisplay(){
       for (int i=0; i<5; i++){
           System.out.println("Hi");
       }
    }
}