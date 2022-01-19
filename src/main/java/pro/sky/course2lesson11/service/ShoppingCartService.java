package pro.sky.course2lesson11.service;

import org.springframework.stereotype.Service;
import pro.sky.course2lesson11.ShoppingCart;

import java.util.Map;

@Service
public class ShoppingCartService {

    private ShoppingCart shoppingCart;

    public ShoppingCartService(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public String addProductId(int id, int number) {
        int totalNumber = 0;
        if (shoppingCart.getProductsId().get(id) != null) {
            totalNumber = number + shoppingCart.getProductsId().get(id);
        } else totalNumber = number;
        shoppingCart.getProductsId().put(id, totalNumber);
        return "Добавлен товар " + id + "в количестве " + number +
                "шт. Его общее количество в корзине " + totalNumber + "шт.";
    }
    public Map<Integer, Integer> getShoppingCart() {
        return shoppingCart.getProductsId();
    }
}
