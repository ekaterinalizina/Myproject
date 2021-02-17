package datastructureandalgorithm.array;

public class Learn2DArray {
    // dataType [1st Dimension] [2nd Dimension] arrayName= new dataType [size1][size2]

    //Declaring and Assign value

    public static String[][] carInfo ={
            {"carBrand", "carModel", "carColor", "carPrice", "carYear"},// assign value in each row
            {"Tesla", "2023", "Black", "110000"},
            {"BMW", "X8", "Red", "90000", "2020"},
            {"Audi", "A5", "Blue", "8000", "2021"}
    };
    public static void main(String[] args) {

        System.out.println("Car info"+ carInfo[2][2]);

        // Only Declaring and mention value
        String[][] stName = new String[5][4];// [5] = row, [4]=columns
        // row starts count from '0', columns from '0'
        System.out.println(stName.length);

        stName[0][0] = "sl";// 1st row: 1st column
        stName[0][1] = "firstName";
        stName[0][2] = "lastName";
        stName[0][3] = "Address";

        //2nd row values
        stName[1][0] = "101";// 1st row: 1st column
        stName[2][1] = "James";
        stName[3][2] = "William";
        stName[4][3] = "Manhattan, NY";


        //3nd row values
        stName[2][0] = "102";// 1st row: 1st column
        stName[3][1] = "Jack";
        stName[4][2] = "Cohen";
        stName[5][3] = "Quenns, NY";

        //4nd row values
        stName[1][0] = "103";// 1st row: 1st column
        stName[2][1] = "Easha";
        stName[3][2] = "Khanan";
        stName[4][3] = "Sitka, Alaska";

        //5nd row values
        stName[1][0] = "104";// 1st row: 1st column
        stName[2][1] = "Amar";
        stName[3][2] = "Alilli";
        stName[4][3] = "Denver, CO";

        //5nd row values - is !!! Exception ArrayOutOfBound
        try {
            stName[5][0] = "104";// 1st row: 1st column
            stName[5][1] = "Parisha";
            stName[5][2] = "William";
            stName[5][3] = "Irvine, CA";
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Exception ArrayOutOfBound");
        }


        System.out.println("studen name " + stName[4][1]);
        System.out.println("student name "+ stName[5][1]);


        //How to retrieve all the value from a 2D Array?
        for (String stn[] : stName){ //we declaring a new Variable stn[]
            //Convert 2D to 1D
            for(String st: stn){
                System.out.print(st +" ");
            }
            System.out.println();
        }
    }
}
