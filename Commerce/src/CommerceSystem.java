import java.util.ArrayList;
import java.util.List;

public class CommerceSystem {
    private List<Product> products;
    private String name;
    private Product product;

    public CommerceSystem(List<Product> products) {
        this.products = products;

        products.add(new Product("Galaxy Buds", 245000, "노이즈 캔슬링 무선 이어폰", 30));
        products.add(new Product("Iphone", 1540000, "아이폰", 10));
        products.add(new Product("Macbook", 2400000, "맥북", 15));
        products.add(new Product("Gaming Headset", 79000, "헤드셋", 20));
    }

    public void start() {
        for (Product product : products) {
            String formattedPrice = String.format("%,d", product.getPrice());
            System.out.println("상품명: " + product.getName()
                    + " 가격: " + formattedPrice + "원"
                    + " 설명: " + product.getAccount()
                    + " 재고: " + product.getStocklevel() + "개");
        }
    }
}