import java.util.*;

public class Statistics {

    public static void main(String[] args) {
        // Sample stores and users data
        List<Store> stores = Arrays.asList(new Store("User 1", "Store 1"), new Store("User 2", "Store 2"));
        List<User> users = Arrays.asList(
                new User("User 1", "password1", "user1@email.com", true, true),
                new User("User 2", "password2", "user2@email.com", true, true)
        );

        // Sellers: Store statistics
        for (Store store : stores) {
            System.out.println("Store: " + store.getStoreName());
            System.out.println("Number of products: " + store.productSize());
        }

        // Customers: Seller statistics
        for (User user : users) {
            System.out.println("User: " + user.getUserName());
            System.out.println("Email: " + user.getUserEmail());
        }
    }
}
