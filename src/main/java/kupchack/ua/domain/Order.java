package kupchack.ua.domain;

public class Order {
    private java.util.List<OrderItem> items;
    private java.time.LocalDateTime date;
    private String address;
    private Payment payment;
    private int id;
    private OrderStatus status;
}
