import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Category> categories = new ArrayList<>();

        CommerceSystem commerceSystem = new CommerceSystem(categories);

        commerceSystem.start();
    }
}