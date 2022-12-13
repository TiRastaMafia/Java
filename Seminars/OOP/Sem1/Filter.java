import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Filter {
    public static void main(String[] args) {
        Set<Laptop> laptops = new HashSet<Laptop>();
        laptops.add(new Laptop("DELL", "763456743", "black", 256));
        laptops.add(new Laptop("Acer", "657485", "black", 128));
        laptops.add(new Laptop("Lenova", "SDBFBDFS", "black", 512));
        laptops.add(new Laptop("Acer", "65eg85", "black", 256));
        laptops.add(new Laptop("Acer", "657fes5", "black", 64));
        laptops.add(new Laptop("IBM", "DFDSS", "black", 256));

        String producer = "Acer";
        int ssd = 64;

        // Оставить только ноутбуки Acer

        List<Laptop> filtered = new ArrayList<>();

        for (Laptop laptop : laptops) {
            if (!laptop.getProducer().equals(producer)) //пропустить если неправильный производитель
                continue;
            if (!laptop.getColor().startsWith("black")) //пропустить если неправильная модель
                continue;
                if (!laptop.getSsd().equals(ssd)) //пропустить если не тот ssd
                continue;
            filtered.add(laptop);
        }

        System.out.println(filtered);
    }

}