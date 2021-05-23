package day17_ternary_nested_conditions;

public class VendingNestedIf {
    public static void main(String[] args) {
        String selection = "snack";         // "drink" or "snack"
        String drink = "tea";               // "tea" or "coke"
        String snack = "candy";             // "chips" or "candy"
                                            // when selection is "drink" --> "drink is selected"
                                            // when drink is "tea" --> "tea is selected"
                                            // when drink is "coke" --> "coke is selected"
                                            // when snack is "snack" --> "snack is selected"
                                            // when snack is "chips" --> "chips is selected"
                                            // when snack is "candy" --> "candy is selected"

        if (selection.equals("drink")) {
            System.out.println("drink is selected");
            if (drink.equals("tea")) {
                System.out.println("tea is selected");
            } else {
                System.out.println("coke is selected");
            }
        } else if (selection.equals("snack")) {
            System.out.println("snack is selected");
            if (snack.equals("chips")) {
                System.out.println("chips is selected");
            } else {
                System.out.println("candy is selected");
            }
        }
    }
}