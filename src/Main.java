import model.Apple;
import model.Food;
import model.Meat;
import model.constants.Colour;
import service.ShoppingCart;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Meat meat = new Meat(5, 100);

        Apple redApple = new Apple(10, 50, Colour.RED);
        Apple greenApple = new Apple(8, 60, Colour.GREEN);
        Food[] items = {meat, redApple, greenApple};
        ShoppingCart cart = new ShoppingCart(items);
        String noDiscountLabel = " без скидки: ";
        String discountLabel = " со скидкой: ";
        String veganProductsLabel = " вегетарианских продуктов ";
        String totalAmountWithoutDiscountMessage = String.format("Общая сумма%s", noDiscountLabel);
        String totalAmountDiscountedMessage = String.format("Общая сумма%s", discountLabel);
        String totalAmountOfVeganProductsMessage = String.format("Общая сумма%s", veganProductsLabel);
        System.out.printf("%s%s%n", totalAmountWithoutDiscountMessage, cart.getTotalSumWithoutDiscount());
        List<String> discountMessages = Arrays.asList(
                String.format("%s%s", totalAmountDiscountedMessage, cart.getTotalSumWithDiscount()),
                String.format("%s%s", totalAmountOfVeganProductsMessage, cart.getTotalSumOfVegetarianProductsWithoutDiscount())
        );
        for (String message : discountMessages) {
            System.out.println(message);
        }
    }
}