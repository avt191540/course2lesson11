package pro.sky.course2lesson11.service;

import org.springframework.stereotype.Service;
import pro.sky.course2lesson11.ShoppingCart;

import java.util.List;

@Service
public class ShoppingCartService {

    private ShoppingCart shoppingCart;

    public ShoppingCartService(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public Integer addProductId(int id) {
        shoppingCart.getProductsId().add(id);
        return id;
    }

    public List getShoppingCart() {
        return shoppingCart.getProductsId();
    }
}
