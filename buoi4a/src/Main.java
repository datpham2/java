public class Main {
    public static void main(String[] args) {
        /*
         User play role as a chef in this program to prepare the ingredients for
         Vietnamese soup "Gà hầm táo đỏ hạt sen" (Vietnamese Chicken Soup with
         Lotus Seeds and Red Dates)
         */
        // Prompt the user for the ingredients and quantities in grams
        Ingredients ingredients = new Ingredients();
        ingredients.prepareIngredients();

        // Calculate the calories in the ingredients, given the calories per 100g per ingredient
        ingredients.calculateCalories();

        // Check if the calories are within the healthy range
        ingredients.checkCalories();
    }
}