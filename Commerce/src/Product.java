public class Product {

    // 속성
    private String name;
    private int price;
    private String account;
    private int stocklevel;

    // 생성자
    public Product(String name, int price, String account, int stocklevel) {
        this.name = name;
        this.price = price;
        this.account = account;
        this.stocklevel = stocklevel;
    }

    // 기능
    // 상품명
    public String getName() {
        return name;
    }
    // 가격
    public int getPrice() {
        return price;
    }
    // 설명
    public String getAccount() {
        return account;
    }
    // 재고수량
    public int getStocklevel() {
        return stocklevel;
    }
}