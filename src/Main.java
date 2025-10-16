//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Step 2 tests - I've independently done the calculations for each test here and put them into the expected value in the test to verify

        // Test Case 1 - Example given in assignment
        System.out.println("Test Case 1: " + (145 == checkout(new String[]{"Apple", "Apple", "Orange", "Apple"}) ? "Pass!" : "Fail"));

        // Test Case 2 - 6 Apples
        System.out.println("Test Case 2: " + (180 == checkout(new String[]{"Apple", "Apple", "Apple", "Apple", "Apple", "Apple"}) ? "Pass!" : "Fail."));

        // Test Case 3 - This test case originally caused a strange value 1.70000000000002 when using double prompting me to change the output type to float for more accuracy
        System.out.println("Test Case 3: " + (110 == checkout(new String[]{"Orange", "Apple", "Orange", "Apple"}) ? "Pass!" : "Fail"));

        // Test Case 4 - Continuing on from the previous case I decided to iterate adding each time on the off chance the same bug would occur with float too. 6x Orange, 6x Apple
        System.out.println("Test Case 4: " + (280 == checkout(new String[]{"Orange", "Apple", "Orange", "Apple", "Orange", "Apple", "Orange", "Apple", "Orange", "Apple", "Orange", "Apple"}) ? "Pass!" : "Fail"));

        // Test Case 5 - Continuing on from the previous case I decided to iterate adding each time on the off chance the same bug would occur with float too. 6x Orange, 6x Apple
        System.out.println("Test Case 5: " + (280 == checkout(new String[]{"Apple", "Apple", "Apple", "Apple", "Apple", "Apple", "Orange", "Orange", "Orange", "Orange", "Orange", "Orange"}) ? "Pass!" : "Fail"));

        // Test Case 6 - Single Apple
        System.out.println("Test Case 6: " + (60 == checkout(new String[]{"Apple"}) ? "Pass!" : "Fail"));

        // Test Case 7 - Single Orange
        System.out.println("Test Case 7: " + (25 == checkout(new String[]{"Orange"}) ? "Pass!" : "Fail"));

        //Test Case 8 - Empty Array
        System.out.println("Test Case 8: " + (0 == checkout(new String[]{}) ? "Pass!" : "Fail"));

        //Test Case 9 - inputting with no capital. This test case prompted me to use 'equalsIgnoreCase' in the method to allow for inputs with capitals or without
        System.out.println("Test Case 9: " + (25 == checkout(new String[]{"orange"}) ? "Pass!" : "Fail"));

        //Test Case 10 - Verify else statement works in the logs
        System.out.println("Test Case 10: " + (0 == checkout(new String[]{"orange1", "orange2"}) ? "Pass!" : "Fail"));
    }

    // From step 1 I've decided to change the return value to an integer and return pence instead of pounds because I was getting issues with trailing decimals when using float.
    private static int checkout(String[] shoppingBag){
        int sum = 0;
        int appleCounter = 0;
        int orangeCounter = 0;
        for(String item : shoppingBag){
            if("Apple".equalsIgnoreCase(item)){
                if(appleCounter == 1){
                    //If we have just account for the price of an apple, this apple is free and we restart counter
                    appleCounter = 0;
                } else {
                    //This apple is not free, iterate the apple counter and add the price to the sum
                    appleCounter ++;
                    sum += 60;
                }
            } else if("Orange".equalsIgnoreCase(item)) {
                if(orangeCounter == 2){
                    //If we have just account for the price of an orange, this apple is free and we restart counter
                    orangeCounter = 0;
                } else {
                    //This orange is not free, iterate the apple counter and add the price to the sum
                    sum += 25;
                    orangeCounter ++;
                }
            } else {
                // Dealing with unexpected inputs
                System.out.println("Unknown item in shopping bag: " + item + " removed from basket");
            }
        }
        return sum;
    }
}