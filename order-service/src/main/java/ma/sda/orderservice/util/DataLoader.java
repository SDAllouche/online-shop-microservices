package ma.sda.orderservice.util;

import lombok.RequiredArgsConstructor;
import ma.sda.orderservice.model.Order;
import ma.sda.orderservice.model.OrderLineItems;
import ma.sda.orderservice.repository.OrderRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Component
@RequiredArgsConstructor
public class DataLoader implements CommandLineRunner {
    private final OrderRepository orderRepository;
    @Override
    public void run(String... args) throws Exception {
        Order order= new Order();
        order.setOrderNumber(UUID.randomUUID().toString());

        OrderLineItems orderLineItem1=new OrderLineItems();
        orderLineItem1.setSkuCode("iphone_13");
        orderLineItem1.setQuantity(10);
        orderLineItem1.setPrice(BigDecimal.valueOf(1000));

        OrderLineItems orderLineItem2=new OrderLineItems();
        orderLineItem2.setSkuCode("iphone_13_red");
        orderLineItem2.setQuantity(12);
        orderLineItem2.setPrice(BigDecimal.valueOf(1200));

        List<OrderLineItems> orderLineItems = new ArrayList<>();
        orderLineItems.add(orderLineItem1);
        orderLineItems.add(orderLineItem2);

        order.setOrderLineItemsList(orderLineItems);

        orderRepository.save(order);
    }
}
