public class Ingredients {
    public void prepareIngredients() {
        // Prompt the user for the ingredients and quantities in grams
        System.out.println("Please prepare the following ingredients:");
        System.out.println("1. Chicken (500g)");
        System.out.println("2. Lotus seeds (50g)");
        System.out.println("3. Red dates (50g)");
        System.out.println("4. Ginger (50g)");
        System.out.println("5. Salt (10g)");
        System.out.println("6. Sugar (10g)");
        System.out.println("7. Fish sauce (10g)");
        System.out.println("8. Pepper (5g)");
        System.out.println("9. Water (1.5L)");
        System.out.println();
    }

    public void calculateCalories() {
        // Calculate the calories in the ingredients, given the calories per 100g per ingredient
        System.out.println("The total calories in the ingredients is: " +
                "500g * 239kcal + 50g * 345kcal + 50g * 282kcal + " +
                "\n50g * 80kcal + 10g * 0kcal + 10g * 387kcal + " +
                "10g * 2kcal + 5g * 251kcal + 1500g * 0kcal = 1195kcal " +
                "\n+ 172.5kcal + 141kcal + 40kcal + 0kcal + 580.5kcal + " +
                "20kcal + 12.55kcal + 0kcal = 2141.55kcal");
        System.out.println();
    }

    public void checkCalories() {
        // Check if the calories are within the healthy range
        if (2141.55 >= 2000 && 2141.55 <= 2500) {
            System.out.println("The calories in the ingredients are within the healthy range.");
        } else {
            System.out.println("The calories in the ingredients are not within the healthy range.");
        }
    }
}
