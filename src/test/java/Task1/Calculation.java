package Task1;

import org.assertj.core.api.Assertions;

import java.util.HashMap;
import java.util.Scanner;

public class Calculation {
    double purchaseAmount;
    int discountAmount = 10;
    HashMap<String, Double> shoppingList = new HashMap<String, Double>();



    public  Calculation(double purchaseAmount, int discountAmount){
        this.purchaseAmount =purchaseAmount;
        this.discountAmount =discountAmount;
    }

    public void newProduct() {
        Scanner scanner = new Scanner(System.in);
        double priceProduct = scanner.nextDouble();
        String namePro = scanner.nextLine();
        shoppingList.put(namePro, priceProduct);
        scanner.close();
    }


    public double purchaseAmount() {
        shoppingList.put("Редиска", 30.0);
        shoppingList.put("Колбаса", 310.2);
        shoppingList.put("Хлеб", 120.3);
        shoppingList.put("Кетчуп", 190.0);
        shoppingList.put("Веревка", 330.3);
        shoppingList.put("Мыло", 80.1);
        for (double value : shoppingList.values()) {
            purchaseAmount += value;
        }
        System.out.println(purchaseAmount);
        return purchaseAmount;
    }


    
    public double calculateDiscount(double purchaseAmount, int discountAmount){
        if(purchaseAmount<0|| discountAmount<0 || discountAmount >=100){
            throw new ArithmeticException("Invalid arguments");
        }
        double discontPrice = purchaseAmount * discountAmount / 100;
        double new_price = purchaseAmount - discontPrice;
        System.out.println(new_price);
        return new_price;
    }
    
    public void testCalculateDiscont(){

        Assertions.assertThat(calculateDiscount(100,20)==80);
        Assertions.assertThat(calculateDiscount(50,10)==45);

        Assertions.assertThatThrownBy(() -> calculateDiscount(-100, 20))
                .isInstanceOf(ArithmeticException.class);
        Assertions.assertThatThrownBy(() -> calculateDiscount(100, -20))
                .isInstanceOf(ArithmeticException.class);
        Assertions.assertThatThrownBy(() -> calculateDiscount(100, 120))
                .isInstanceOf(ArithmeticException.class);
    }
    
}
