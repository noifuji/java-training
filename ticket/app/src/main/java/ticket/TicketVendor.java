package ticket;

import java.util.*;

/**
 * 券売機
 * ユーザーに対して券売機の機能を提供する。
 */
public class TicketVendor {
    private List<Item> items;
    private Cart cart;

    public TicketVendor(List<Item> items) {
        this.items = items;
        this.cart = new Cart();
    }

    public void showItems() {
        System.out.println("商品          金額");

        for(Item item : items) {
            System.out.println(item.getId() + "." + item.getName() + "     " + item.getPrice() + "円");
        }
    }

    public void addItemToCart(int itemId) {
        for(Item item :items) {
            if(item.getId() == itemId) {
                cart.addItem(item);
                return;
            }
        }

        //エラー処理
        
    }

    public void showCartItems() {
        System.out.println("商品          数量");

        List<CartItem> cartItems = cart.getCartItems();

        for(CartItem cattItem : cartItems) {
            System.out.println(cattItem.getId() + "." + cattItem.getName() + "     " + cattItem.getQuantity());
        }

        
        System.out.println("合計:" + cart.getTotalPrice() + "円");
    }

    public boolean showChange(int payment) {
        int change = payment - cart.getTotalPrice();
        if(change < 0) {
            return false;
        }

        System.out.println("ご購入ありがとうございます。おつり" + change + "円です。");

        return true;
    }

}
