public class Main {
    public static void main(String[] args) {
        System.out.println("Recipes!");
        Recipe recipe1 = new Recipe("Банановый коктейль");
        Product product1 = new Product("Банан", 8);
        Product product2 = new Product("Молоко", 65);
        Product product3 = new Product("Корица", 14);
        recipe1.addProduct(product1, 2);
        recipe1.addProduct(product2, 1);
        recipe1.addProduct(product3, 1);
        System.out.println(recipe1.toString());
        System.out.println(recipe1.getRecipePrice());

    }
}