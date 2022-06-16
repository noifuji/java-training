package ticket;

/**
 * カート内の商品情報を保持する。
 */
public class CartItem {
    private int id;
    private String name;
    private int price;
    private int quantity;

    public CartItem(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = 1;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getPrice() {
        return this.price;
    }

    public int getQuantity() {
        return this.quantity;
    }

}
