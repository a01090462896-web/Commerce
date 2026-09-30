import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CommerceSystem {
    private List<Category> categories;

    public CommerceSystem(List<Category> categories) {
        this.categories = categories;
        initCategories();
    }

    // 카테고리 데이터 세팅
    private void initCategories() {
        List<Product> electronics = new ArrayList<>();
        electronics.add(new Product("Galaxy Buds", 245000, "노이즈 캔슬링 무선 이어폰", 30));
        electronics.add(new Product("Iphone", 1540000, "아이폰", 10));
        electronics.add(new Product("Macbook", 2400000, "맥북", 15));
        electronics.add(new Product("Gaming Headset", 79000, "헤드셋", 20));

        categories.add(new Category("전자제품", electronics));
        categories.add(new Category("의류", new ArrayList<>()));
        categories.add(new Category("식품", new ArrayList<>()));
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

        // 프로그램 종료 전까지 메인 메뉴를 보여주기 기능
        while (true) {
            System.out.println("\n[ 플랫폼 메인 ]");
            for (int i = 0; i < categories.size(); i++) {
                System.out.println((i + 1) + ". " + categories.get(i).getName());
            }
            System.out.println("0. 종료");
            System.out.println("입력: ");

            int menuChoice = scanner.nextInt();

            if (menuChoice == 0) {
                System.out.println("플랫폼을 종료합니다");
                break;
            }
            if (menuChoice > 0 && menuChoice <= categories.size()) {
                Category selectedCategory = categories.get(menuChoice - 1);

                System.out.println("\n[ " + selectedCategory.getName() + " 카테고리 ]");
                List<Product> products = selectedCategory.getProducts();

                for (int i = 0; i < products.size(); i++) {
                    Product p = products.get(i);
                    String formattedPrice = String.format("%,d", p.getPrice());
                    System.out.println((i + 1) + ". " + p.getName() + " " + formattedPrice + "원 " + p.getAccount());
                }
                System.out.println("0.뒤로가기");
                System.out.print("입력:");

                int productChoice = scanner.nextInt();
                if (productChoice > 0 && productChoice <= products.size()) {
                    Product selectedProduct = products.get(productChoice - 1);
                    String formattedPrice = String.format("%,d", selectedProduct.getPrice());
                    System.out.println("선택 상품: " + selectedProduct.getName() + formattedPrice + " 원 " +
                            selectedProduct.getAccount() + " 재고: " + selectedProduct.getStocklevel() + "개");
                }
            }
        }
    }
}