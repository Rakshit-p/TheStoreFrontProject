import java.util.*;

public class Statistics {
    private ArrayList<User> users;
    private ArrayList<Store> stores;
    private User currentUser;

    public Statistics(ArrayList<User> users, ArrayList<Store> stores, User currentUser) {
        this.users = users;
        this.stores = stores;
        this.currentUser = currentUser;
    }

    public Map<User, Integer> getItemsPurchasedPerCustomer(Store store) {
        Map<User, Integer> customerPurchaseCounts = new HashMap<>();

        for (Product product : store.getProducts()) {
            for (User user : users) {
                int count = user.getPurchaseCount(product);
                customerPurchaseCounts.put(user, customerPurchaseCounts.getOrDefault(user, 0) + count);
            }
        }

        return sortByValue(customerPurchaseCounts);
    }

    public Map<Product, Integer> getProductSales(Store store) {
        Map<Product, Integer> productSales = new HashMap<>();

        for (Product product : store.getProducts()) {
            productSales.put(product, product.getQuantitySold());
        }

        return sortByValue(productSales);
    }

    public Map<Store, Integer> getStoresByNumberOfProductsSold() {
        Map<Store, Integer> storeSales = new HashMap<>();

        for (Store store : stores) {
            int totalSales = 0;
            for (Product product : store.getProducts()) {
                totalSales += product.getQuantitySold();
            }
            storeSales.put(store, totalSales);
        }

        return sortByValue(storeSales);
    }

    public Map<Store, Integer> getStoresByCustomerPurchases(User customer) {
        Map<Store, Integer> customerStorePurchases = new HashMap<>();

        for (Store store : stores) {
            int storePurchaseCount = 0;
            for (Product product : store.getProducts()) {
                storePurchaseCount += customer.getPurchaseCount(product);
            }
            customerStorePurchases.put(store, storePurchaseCount);
        }

        return sortByValue(customerStorePurchases);
    }

    public static <K, V extends Comparable<? super V>> Map<K, V> sortByValue(Map<K, V> map) {
        List<Map.Entry<K, V>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue(Collections.reverseOrder()));

        Map<K, V> result = new LinkedHashMap<>();
        for (Map.Entry<K, V> entry : list) {
            result.put(entry.getKey(), entry.getValue());
        }

        return result;
    }
}
