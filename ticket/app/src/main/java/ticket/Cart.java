package ticket;

import java.util.*;

/**
 * カート
 * ユーザーが購入予定の商品を管理する。
 */
public class Cart {
    private List<CartItem> cartItems;

    public Cart() {
        this.cartItems = new ArrayList<CartItem>();
    }

    public void addItem(Item item) {
        //同じ商品がすでにカートにあるかチェックする。
        for(CartItem cartItem :cartItems) {
            if(cartItem.getId() == item.getId()) {
                //ある場合
                //quantityを+1する。
                cartItem.setQuantity(cartItem.getQuantity() + 1);
                return;
            }
        }

        //ない場合
        this.cartItems.add(new CartItem(item.getId(), item.getName(), item.getPrice()));
    }

    public List<CartItem> getCartItems() {
        return this.cartItems;
    }
    
    public int getTotalPrice() {
        int total = 0;

        for(CartItem cartItem :cartItems) {
            total += cartItem.getPrice() * cartItem.getQuantity();
        }

        return total;
    }

}
