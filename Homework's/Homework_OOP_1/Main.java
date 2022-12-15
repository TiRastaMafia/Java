import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Coffee latte = new Coffee("latte", "milk", 350, 70);
        Coffee espresso = new Coffee("espresso", "black", 200, 80);
        Coffee mokkachino = new Coffee("mokkachino", "cream", 250, 60);
        Tea ulun = new Tea("ulun", "green", "strong", 500, 65);
        Tea puer = new Tea("puer", "black", "strong as f*ked", 350, 70);
        HotChocolate nesquik = new HotChocolate("nesquik", "sweet", 350, 50);

        Map<Integer, Object> products = new HashMap<>();
        products.put(1, latte);
        products.put(2, espresso);
        products.put(3, mokkachino);
        products.put(4, ulun);
        products.put(5, puer);
        products.put(6, nesquik);

        VendingMashine automat = new VendingMashine(products);
        automat.onOff(false);
        VendingMashine.choiceOptions(VendingMashine.userChoice(products), products);


    }
    



}
