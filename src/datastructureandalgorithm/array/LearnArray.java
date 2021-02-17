package datastructureandalgorithm.array;

public class LearnArray {
    //Variable declare and assign;
    String name="Kate";
    String address;

    //Array: which can hold multiple value of same data type
    //DataType[] variableName= new DataType [numberOfVariables]
    //2 options to call Arrays - if it is Static (className.method   or create Obj)

    //Declare an Array with Length
   static String[] students=new String[6];//If we Declare array in Class leverl we should declare Static!!!
   // inside[] we say how many values inside Array // 40 bytes per String;
    //40 byte * 6=240 byte

    String [] addresses=new String[7];

    int[] stId={ 501, 502, 503, 504, 505};


    public static void main(String[] args) {
        LearnArray.students[0]="Jack";
        LearnArray.students[1]="Jan";
        LearnArray.students[2]="Jasika";
        LearnArray.students[3]="Jan";
        LearnArray.students[4]="Jam";
        LearnArray.students[5]="Jarred";

        System.out.println("Student name is "+ LearnArray.students[4]);


        LearnArray learn=new LearnArray();
        learn.addresses[0]="NY";
        learn.addresses[1]="NJ";
        learn.addresses[2]="FL";
        learn.addresses[3]="CA";
        learn.addresses[4]="DC";
        learn.addresses[5]="VA";
        learn.addresses[6]="MD";
        learn.addresses[7]="MC"; //will be exception because Array index starts from '0', so if ther is 7 arrays,
        // then it will finish at '6'

        System.out.println(learn.addresses[4]);

        try{
            System.out.println(learn.addresses[7]="MC");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bounds Exc");
        }

        int[] number = new int[10];
        number [0]=101;
        number [0]=102;
        number [0]=103;
        number [0]=104;
        number [0]=105;
        number [0]=106;
        number [0]=107;
        number [0]=108;
        number [0]=109;
        System.out.println("numbers "+ number[5]);

        for(int i=0; i<number.length; i++){
            System.out.println("Numbers are "+number[i]);
        }
        System.out.println("************************ Students Name");
        for(int i=0; i<LearnArray.students.length; i++){
            System.out.println("Students are "+LearnArray.students[i]);

        }

        System.out.println("**************** For Each Loop*********");
        // FOR EACH LOOP
        //for(DataType variableName : arrayName){}
        for(String st : learn.addresses){              // non static that is why we call by Obj name
            System.out.println("students addresses are "+st);
        }


        System.out.println("********Array declare and assign********");
        System.out.println(learn.stId[4]);

        double [] salary={5000.3, 7000.5, 8000.6, 9000.3, 10000.6, 11000.34};
        //OR  double  salary[] ={5000.3, 7000.5, 8000.6, 9000.3, 10000.6, 11000.34};
        System.out.println(salary[2]);

        //How to print all values using for each loop

        for(double sa: salary){
            System.out.println("Salary is "+ sa);
        }


    }





}
