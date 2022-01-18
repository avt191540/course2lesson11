package pro.sky.course2lesson11;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Integer> productsId;

    public ShoppingCart() {
        this.productsId = new ArrayList<>();
    }

    public List<Integer> getProductsId() {
        return productsId;
    }

    public void setProductsId(List<Integer> productsId) {
        this.productsId = productsId;
    }
}
