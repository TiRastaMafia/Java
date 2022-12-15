import java.util.Map;
import java.util.Scanner;
/**
 * VendingMashine
 */

public class VendingMashine {
    private boolean mode;

    private Map<Integer, Object> products;

    public VendingMashine(Map<Integer, Object> products) {
        this.products = products;
    }

    public void onOff(boolean mode) {
        if (mode) {
            System.out.println("Машина включена");
            mode = true;
        } else {
            System.out.println("Машина выключена");
        }
    }

    public static Integer userChoice(Map<Integer, Object> products) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chose your options, please, by press the number: " + products);
        int number = scanner.nextInt();
        scanner.close();

        return number;
    }

    public static void choiceOptions(int number, Map<Integer, Object> products) {
        switch (number) {
            case 1:
                System.out.println(products.get(1) + "вот ваш заказ");
                break;

            case 2:
                System.out.println(products.get(2) + "вот ваш заказ");
                break;

            case 3:
                System.out.println(products.get(3) + "вот ваш заказ");
                break;

            case 4:
                System.out.println(products.get(4) + "вот ваш заказ");
                break;

            case 5:
                System.out.println(products.get(5) + "вот ваш заказ");
                break;

            case 6:
                System.out.println(products.get(6) + "вот ваш заказ");
                break;

            default:
                break;
        }
    }

}
