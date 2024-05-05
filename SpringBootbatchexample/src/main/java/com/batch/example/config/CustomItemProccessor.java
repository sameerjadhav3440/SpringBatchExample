package com.batch.example.config;

import com.batch.example.model.Product;
import org.springframework.batch.item.ItemProcessor;

public class CustomItemProccessor implements ItemProcessor<Product, Product> {
    @Override
    public Product process(Product item) throws Exception {

        // Calculate discounted price -

        try {
            int discountper = Integer.parseInt(item.getDiscount().trim());
            double originalPrice = Double.parseDouble(item.getPrice().trim());
            double discount = (discountper / 100) * originalPrice;

            double finalprice = originalPrice - discount;

            String discountedPrice = String.valueOf(finalprice);

            item.setDiscountedPrice(discountedPrice);
        } catch (NumberFormatException ex) {

        }
        return item;
    }
}
