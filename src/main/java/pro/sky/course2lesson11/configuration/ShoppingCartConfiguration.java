package pro.sky.course2lesson11.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.SessionScope;
import pro.sky.course2lesson11.ShoppingCart;

@Configuration
public class ShoppingCartConfiguration {

    @Bean
    @SessionScope
    public ShoppingCart shoppingCart() {
        return new ShoppingCart();
    }
}
