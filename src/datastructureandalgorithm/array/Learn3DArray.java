package datastructureandalgorithm.array;

public class Learn3DArray {
    //3D Array= 1D+2D array
    //DataType [Size][Row][Column] arrayName= new DataType [Size][Row][Column] ;

    //Declare 3D array
    // static String pizza [][][]  Or  static String [][][] pizza
    static String[][][] pizza1 = new String[2][6][5];

    static String pizza[][][] = new String[2][6][5];

    public static void main(String[] args) {


        //Assign value
        Learn3DArray.pizza[0][0][0] = "sl";
        Learn3DArray.pizza[0][0][1] = "Pizza Type";
        Learn3DArray.pizza[0][0][2] = "Price";
        Learn3DArray.pizza[0][0][3] = "Quantity";
        Learn3DArray.pizza[0][0][4] = "Amount";

        Learn3DArray.pizza[0][1][0] = "101";
        Learn3DArray.pizza[0][1][1] = "Peperoni";
        Learn3DArray.pizza[0][1][2] = "35";
        Learn3DArray.pizza[0][1][3] = "5";
        Learn3DArray.pizza[0][1][4] = "165";

        Learn3DArray.pizza[0][2][0] = "102";
        Learn3DArray.pizza[0][2][1] = "Napolitan";
        Learn3DArray.pizza[0][2][2] = "45";
        Learn3DArray.pizza[0][2][3] = "2";
        Learn3DArray.pizza[0][2][4] = "90";


        Learn3DArray.pizza[0][3][0] = "103";
        Learn3DArray.pizza[0][3][1] = "meat lover pizza";
        Learn3DArray.pizza[0][3][2] = "55";
        Learn3DArray.pizza[0][3][3] = "3";
        Learn3DArray.pizza[0][3][4] = "165";

        Learn3DArray.pizza[0][4][0] = "104";
        Learn3DArray.pizza[0][4][1] = "covered pizza";
        Learn3DArray.pizza[0][4][2] = "65";
        Learn3DArray.pizza[0][4][3] = "5";
        Learn3DArray.pizza[0][4][4] = "325";

        Learn3DArray.pizza[1][5][0] = "107";
        Learn3DArray.pizza[1][5][1] = "cheese pizza";
        Learn3DArray.pizza[1][5][2] = "14";
        Learn3DArray.pizza[1][5][3] = "6";
        Learn3DArray.pizza[1][5][4] = "125";

        System.out.println("Pizza info "+ Learn3DArray.pizza[0][4][1]);

        for(String pizz[][]: pizza){
            // convern 3D to 1D:
            //1)convert 3D to 2D
            for(String[] piz : pizz){
                for(String pi:piz){
                    System.out.print(pi+ "       ");
                }
                System.out.println();
            }
            //2)convert 2D to 1D
            //3)Get value from 1D
        }
    }
}
