package controlFlow;

public class LearnNestedIfElseIf {
    //Nested if else: child if else

    public static void main(String[] args) {
        int score=95;
        if(score>=90){
            if(score>= 92 && score <=94){
                System.out.println("You are excellent");
            }else{
                if(score==95){
                    System.out.println("you are Genius");
                }
            }
            System.out.println("You got A+");
        }else if(score>=80){
            System.out.println("You got A-");
        }else if(score>=70){
            System.out.println("you got A");
        }else if(score>=60){
            System.out.println("You got B");
        }else {
            System.out.println("You got C");
        }
    }
}
