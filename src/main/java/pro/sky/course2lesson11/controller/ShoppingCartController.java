package pro.sky.course2lesson11.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.course2lesson11.service.ShoppingCartService;

import java.util.List;

@RestController
@RequestMapping("/store/order")
public class ShoppingCartController {

    private ShoppingCartService shoppingCartService;

    public ShoppingCartController(ShoppingCartService shoppingCartService) {
        this.shoppingCartService = shoppingCartService;
    }

    @GetMapping("/add")
    public String add(@RequestParam int id) {
        return ("В корзину покупок добавлен товар с id: "
                + shoppingCartService.addProductId(id));
    }
    @GetMapping("/get")
    public List get() {
        return (shoppingCartService.getShoppingCart());
    }
}
