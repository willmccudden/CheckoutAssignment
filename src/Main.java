//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Step 1 tests

        // Test Case 1 - Example given in assignment
        System.out.println("Test Case 1: " + (2.05f == checkout(new String[]{"Apple", "Apple", "Orange", "Apple"}) ? "Pass!" : "Fail"));
        // Test Case 2 - 6 Apples
        System.out.println("Test Case 2: " + (3.6f == checkout(new String[]{"Apple", "Apple", "Apple", "Apple", "Apple", "Apple"}) ? "Pass!" : "Fail"));

        // Test Case 3 - This test case originally caused a strange value 1.70000000000002 when using double prompting me to change the output type to float for more accuracy
        System.out.println("Test Case 3: " + (1.7f == checkout(new String[]{"Orange", "Apple", "Orange", "Apple"}) ? "Pass!" : "Fail"));

        // Test Case 4 - Continuing on from the previous case I decided to iterate adding each time on the off chance the same bug would occur with float too. 6x Orange, 6x Apple
        System.out.println("Test Case 4: " + (5.1f == checkout(new String[]{"Orange", "Apple", "Orange", "Apple", "Orange", "Apple", "Orange", "Apple", "Orange", "Apple", "Orange", "Apple"}) ? "Pass!" : "Fail"));

        // Test Case 5 - Continuing on from the previous case I decided to iterate adding each time on the off chance the same bug would occur with float too. 6x Orange, 6x Apple
        System.out.println("Test Case 5: " + (5.1f == checkout(new String[]{"Apple", "Apple", "Apple", "Apple", "Apple", "Apple", "Orange", "Orange", "Orange", "Orange", "Orange", "Orange"}) ? "Pass!" : "Fail"));

        // Test Case 6 - Single Apple
        System.out.println("Test Case 6: " + (0.6f == checkout(new String[]{"Apple"}) ? "Pass!" : "Fail"));

        // Test Case 7 - Single Orange
        System.out.println("Test Case 7: " + (0.6f == checkout(new String[]{"Orange"}) ? "Pass!" : "Fail"));

        //Test Case 8 - Empty Array
        System.out.println("Test Case 8: " + (0f == checkout(new String[]{}) ? "Pass!" : "Fail"));

    }

    private static float checkout(String[] shoppingBag){
        float sum = 0;
        for(String item : shoppingBag){
            if("Apple".equals(item)){
                sum += 0.60;
            } else if("Orange".equals(item)) {
                sum += 0.25;
            } else {
                // Dealing with unexpected inputs
                System.out.print("Unknown item in shopping bag: " + item + "removed from basket");
            }
        }
        return sum;
    }
}