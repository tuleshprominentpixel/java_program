package StreamEx;

import java.time.LocalDate;
import java.util.Set;

public class Customer {
    private Long id;

    private String name;
    private Integer tier;
}

class Order {
    private Long id;

    private LocalDate orderDate;
    private LocalDate deliveryDate;
    private String status;

    private Customer customer;

    Set<Product> products;

}

class Product {
    private Long id;

    private String name;
    private String category;
    private Double price;

    private Set<Order> orders;
}