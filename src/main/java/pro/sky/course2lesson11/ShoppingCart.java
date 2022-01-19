package pro.sky.course2lesson11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShoppingCart {

    private Map<Integer, Integer> productsId;

    public ShoppingCart() {
        this.productsId = new HashMap<>();
    }

    public Map<Integer, Integer> getProductsId() {
        return productsId;
    }
    public void setProductsId(Map productsId) {
        this.productsId = productsId;
    }
}
