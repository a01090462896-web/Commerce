import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        CommerceSystem commerceSystem = new CommerceSystem(products);

        commerceSystem.start();
    }
}