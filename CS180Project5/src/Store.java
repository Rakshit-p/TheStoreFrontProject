import java.util.ArrayList;

public class Store {
    private String user;
    private String storeName;
    private ArrayList<Product> products;

    /**
     * It is the object class for a store
     *
     * @version 2022-07-25
     * @author Purdue CS
     */
    public Store(String user, String storeName) {
        this.user = user;
        this.storeName = storeName;
        this.products = new ArrayList<>();
    }

    public Store() {
    }

    public String getStoreName() {
        return storeName;
    }

    public Product getProducts(int i) {
        return products.get(i);
    }

    public int productSize() {
        return products.size();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(String productName1) {
        for (int i = 0; i < this.products.size(); i++) {
            if (products.get(i).productName.equals(productName1)) {
                products.remove(products.get(i));
            }
        }
    }

    public void editProduct(String productName1, Product product1) {
        for (int i = 0; i < this.products.size(); i++) {
            if (products.get(i).productName.equals(productName1)) {
                products.set(i, product1);
            }
        }
    }
}




//import java.util.ArrayList;

//public class Store {
//    private String user;
//    private String storeName;
//    private ArrayList<Product> products;

//    public Store(String user, String storeName) {
//        this.user = user;
//        this.storeName = storeName;
//        this.products = new ArrayList<>();
//    }

//    public Store() {
//    }

//    public String getUser() {
//        return user;
//    }

//    public void setUser(String user) {
//        this.user = user;
//    }

//    public String getStoreName() {
//        return storeName;
//    }

//    public void setStoreName(String storeName) {
//        this.storeName = storeName;
//    }

//    public ArrayList<Product> getProducts() {
//        return products;
//    }

//    public void setProducts(ArrayList<Product> products) {
//        this.products = products;
//    }

 //   public int productSize() {
 //       return products.size();
 //   }

 //   public void addProduct(Product product) {
 //       products.add(product);
 //   }

//    public void removeProduct(String productName) {
//        products.removeIf(product -> product.getProductName().equals(productName));
//    }

//    public void editProduct(String productName, Product newProduct) {
//        for (int i = 0; i < products.size(); i++) {
//            if (products.get(i).getProductName().equals(productName)) {
//                products.set(i, newProduct);
 //               break;
//            }
//        }
//    }
//}
