import java.util.Locale;

public class LearnString {
    //String is a data type,
    // is a class,
    // is a sequence of character

    String name = "Kate";

    public static void main(String[] args) {
        String food = "pizza";
        System.out.println(food.length());
        System.out.println(food.equals("Pizza")); // Pizza and pizza are different because it is Upper and LowerCase
        System.out.println(food.equalsIgnoreCase("pizza")); // doesn't matter which upper or lower case
        System.out.println(food.charAt(0)); // which character is "4", the numerazation starts from "0".
        char charCompare = food.charAt(5);
        System.out.println(charCompare);
        String name = "Kate";
        System.out.println(food.substring(3));// you can create new string from parent


        System.out.println(food.substring(4, 7)); // (like from one long word we can create smaller word inclusivly
        System.out.println(food.toLowerCase());
        System.out.println(food.toUpperCase());

        String stId = "101";
        String lName = " William";
        System.out.println("This is " + lName);
        System.out.println(stId.concat(lName));// the same as + concatination sign.
        // We can give a space inside value of variable when we assign it

        //Exception Handling
        System.out.println(food.charAt(10));// Exeption: StringIndexOutOfBoundsException
        try {
            System.out.println(food.charAt(10));
        } catch (Exception exception) {
            System.out.println("string Index out of Bounds Exception");
        }
        // Reverse String
        //Remove
        //Trim

        System.out.println(food.contains("p"));// identify character if we have this letter in the word Pizza, it is boolean


    }
}
