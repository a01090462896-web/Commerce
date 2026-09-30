import java.util.List;

// 속성
public class Category {
    private List<Product> products;
    private String categoryName;

    // 생성자
    public Category(String categoryName, List<Product> products) {
        this.categoryName = categoryName;
        this.products = products;
    }

    // 기능
    public String getName() {
        return categoryName;}

    public List<Product> getProducts() {
        return products;
    }
}